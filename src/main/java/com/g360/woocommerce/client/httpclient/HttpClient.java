package com.g360.woocommerce.client.httpclient;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.g360.woocommerce.client.Client;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Muluneh on 8/15/2016.
 */
public class HttpClient {

    protected String url;
    protected String consumerKey;
    protected String consumerSecret;
    protected Options options;

    private Request request;
    private Response response;
    private String responseHeaders;

    private HttpResponse<JsonNode> httpResponse;


    public HttpClient(String url, String consumerKey, String consumerSecret, Options options) {

        this.options = options;
        this.url = this.buildApiUrl(url);
        this.consumerKey = consumerKey;
        this.consumerSecret = consumerSecret;

    }

    protected boolean isSsl() {
        return this.url.startsWith("https://");
    }

    protected String buildApiUrl(String url) {
        String api = this.options.isWPAPI() ? "/wp-json/" : "/wc-api/";

        //TODO rtrim url for / forslashes
        return url.trim() + api + this.options.getVersion() + '/';
    }

    protected String buildUrlQuery(String url, Map<String, String> parameters) throws UnsupportedEncodingException {

        if(parameters != null) {
            url = this.httpBuildQuery(url, parameters);
        }

        return url;
    }

    private String httpBuildQuery(String url, Map<String, String> parameters)
            throws UnsupportedEncodingException {

        QueryStringBuilder builder = new QueryStringBuilder();
        for (Map.Entry<String, String> pair : parameters.entrySet()) {
            builder.appendParam(pair.getKey(), pair.getValue());
        }
        return url + builder.toString();
    }

    protected Map<String, String> authenticate(String url, String method, Map<String, String> parameters) throws UnsupportedEncodingException, NoSuchAlgorithmException, InvalidKeyException {
        if(this.isSsl()) {
            //TODO: basic auth implementation
            System.out.println("Basic Auth...");
        } else {
            OAuth auth = new OAuth(url, this.consumerKey, this.consumerSecret, this.options.getVersion(), method, parameters);
            parameters = auth.getParameters();
        }
        return parameters;
    }

    protected Map<String, String> getRequestHeaders() {
        Map<String, String> requestHeaders = new HashMap<String, String>();
        requestHeaders.put("Accept", "application/json");
        requestHeaders.put("Content-Type", "application/json");
        requestHeaders.put("User-Agent", "WooCommerce API Client-JAVA/" + Client.VERSION);
        return requestHeaders;
    }

    protected Request createRequest(String endpoint, String method, String data, Map<String, String> parameters) throws UnsupportedEncodingException, NoSuchAlgorithmException, InvalidKeyException {

        String body = "";
        String url = this.url + endpoint;

        parameters = this.authenticate(url, method, parameters);

        this.request = new Request(this.buildUrlQuery(url, parameters), method, parameters, this.getRequestHeaders(), body);

        return this.getRequest();

    }

    protected Map<String, String> getResponseHeaders() {
        Map<String, String> headers = new HashMap<String, String>();

        String lines[] = this.responseHeaders.split("\\r?\\n");

        for (String line: lines) {
            if(line.contains(":") == false) {
                continue;
            }
            String keyValue[] = line.split(":");
            headers.put(keyValue[0], keyValue[1]);
        }

        return headers;
    }

    protected Response createResponse() {

        this.responseHeaders = "";
        this.responseHeaders += this.httpResponse.getHeaders();

        String body = this.httpResponse.getBody().toString();
        int code = this.httpResponse.getStatus();
        Map<String, String> headers = this.getRequestHeaders();

        this.response = new Response(code, headers, body);

        return this.getResponse();
    }

    protected void setDefaultUnirestSettings() {

        boolean verifySsl = this.options.verifySsl();
        int timeout = this.options.getTimeout();

//        Unirest.setTimeouts(1000, 6000);
        Unirest.setDefaultHeader("Accept", "application/json");
        Unirest.setDefaultHeader("Content-Type", "application/json");
        Unirest.setDefaultHeader("User-Agent", "WooCommerce API Client-JAVA/" + Client.VERSION);
    }

    public String request(String endpoint, String method, String data, Map<String, String> parameters) throws UnsupportedEncodingException, NoSuchAlgorithmException, InvalidKeyException, UnirestException {

        Request request = this.createRequest(endpoint, method, data, parameters);
        String responseString = new String();

        this.setDefaultUnirestSettings();

        System.out.println(request.getUrl());

        if(method == "GET") {
            responseString = Unirest.get(request.getUrl()).asString().getBody().toString();
            //this.httpResponse = Unirest.get(request.getUrl()).asJson();
            //Response response = this.createResponse();
        }
        if(method == "POST") {
            responseString = Unirest.post(request.getUrl()).body(new JsonNode(data)).asString().getBody().toString();
        }
        if(method == "PUT") {
            responseString = Unirest.put(request.getUrl()).body(new JsonNode(data)).asString().getBody().toString();
        }
        if(method == "DELETE") {
            responseString = Unirest.delete(request.getUrl()).asString().getBody().toString();
        }

        return responseString;
    }

    public Request getRequest() {
        return this.request;
    }

    public Response getResponse() {
        return this.response;
    }

}
