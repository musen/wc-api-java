package musen.woocommerce;

import com.mashape.unirest.http.exceptions.UnirestException;
import musen.woocommerce.httpclient.HttpClient;
import musen.woocommerce.httpclient.Options;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Muluneh on 8/15/2016.
 */
public class Client {

    public static final String VERSION = "1.0.0";

    public HttpClient http;

    public Client(String url, String consumerKey, String consumerSecret, Options options) {
        this.http = new HttpClient(url, consumerKey, consumerSecret, options);
    }

    public String post(String endpoint, String data) throws UnirestException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException {
        return this.http.request(endpoint, "POST", data, null);
    }

    public String get(String endpoint) throws UnirestException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException {
        return this.http.request(endpoint, "GET", null, null);
    }

    public String put(String endpoint, String data) throws UnirestException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException {
        return this.http.request(endpoint, "PUT", data, null);
    }

    public String delete(String endpoint) throws UnirestException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException {
        return this.http.request(endpoint, "DELETE", null, null);
    }

}
