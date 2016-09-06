package com.g360.woocommerce.client.httpclient;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.codec.binary.Base64;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.sql.Timestamp;
import java.util.*;

/**
 * Created by Muluneh on 8/15/2016.
 */
public class OAuth {

    private static final String HASH_ALGORITHM = "HMAC-SHA256";
    private static final String URL_ENCODING  = "UTF-8";

    protected String url;

    protected String consumerKey;

    protected String consumerSecret;

    protected String apiVersion;

    protected String method;

    protected Map<String,String> parameters;

    public OAuth(String url, String consumerKey, String consumerSecret, String apiVersion, String method, Map<String,String> parameters) {
        this.url = url;
        this.consumerKey = consumerKey;
        this.consumerSecret = consumerSecret;
        this.apiVersion = apiVersion;
        this.method = method;
        this.parameters = parameters;
    }

    protected String normalizeString(String string) throws UnsupportedEncodingException {
        return URLEncoder.encode(URLDecoder.decode(string, this.URL_ENCODING), this.URL_ENCODING).replace("%", "%25");
    }

    protected Map<String,String> normalizeParameters(Map<String,String> parameters) throws UnsupportedEncodingException {

        Map<String,String> normalized = new HashMap<String,String>();

        for (Map.Entry<String, String> parameter : parameters.entrySet()) {
            String key = parameter.getKey();
            String value = parameter.getValue();

            normalized.put(this.normalizeString(key), this.normalizeString(value));
        }

        return normalized;

    }

    //TODO: Impletement filter processor
    //protected List<Map<String, String>> processFilters(List<Map<String,String>> parameters) {
    //
    //}

    protected String getSecret() {
        String secret = this.consumerSecret;

        if(this.apiVersion.compareTo("v1") != 0 || this.apiVersion.compareTo("v2") != 0) {
            secret += "&";
        }

        return secret;
    }

    protected String generateOauthSignature(Map<String,String> parameters) throws UnsupportedEncodingException, NoSuchAlgorithmException, InvalidKeyException {

        String baseRequestUri = URLEncoder.encode(this.url, this.URL_ENCODING);

        //TODO: Implement filter processor
        //parameters = this.processFilters(parameters);


        parameters = this.getSortedParameters(this.normalizeParameters(parameters));

        List<String> queryStringList = new ArrayList<String>();

        for (Map.Entry<String, String> parameter : parameters.entrySet()) {
            queryStringList.add( parameter.getKey() + "%3D" + parameter.getValue() ); //join with equal sign
        }

        String[] queryStringArr = new String[queryStringList.size()];
        queryStringArr = queryStringList.toArray(queryStringArr);

        String queryString = StringUtils.join(queryStringArr, "%26");

        String stringToSign = this.method + "&" + baseRequestUri + "&" + queryString;
        String secret = this.getSecret();

        Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
        SecretKeySpec secretKey = new SecretKeySpec(secret.getBytes(), "HmacSHA256");
        sha256_HMAC.init(secretKey);

        System.out.println(stringToSign);

        return Base64.encodeBase64String(sha256_HMAC.doFinal(stringToSign.getBytes()));

    }

    protected Map<String, String> getSortedParameters(Map<String,String> parameters) {
        Map<String, String> sortedParameters = new TreeMap<String, String>(parameters);
        return sortedParameters;
    }

    public Map<String, String> getParameters() throws UnsupportedEncodingException, InvalidKeyException, NoSuchAlgorithmException {

        Date date = new Date();
        Timestamp timestamp = new Timestamp(date.getTime());

        UUID uuid = UUID.randomUUID();
        String nonce = uuid.toString();

        if(this.parameters == null) {
            this.parameters = new HashMap<String, String>();
        }

        this.parameters.put("oauth_consumer_key", this.consumerKey);
        this.parameters.put("oauth_timestamp", String.valueOf(System.currentTimeMillis() / 1000L));
        this.parameters.put("oauth_nonce", nonce);
        this.parameters.put("oauth_signature_method", this.HASH_ALGORITHM);

        this.parameters.put("oauth_signature", this.generateOauthSignature(this.parameters));

        return this.getSortedParameters(this.parameters);

    }
    
}
