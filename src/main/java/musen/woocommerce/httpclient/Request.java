package musen.woocommerce.httpclient;

import java.util.Map;

/**
 * Created by Muluneh on 8/15/2016.
 */
public class Request {

    private String url;

    private String method;

    private Map<String, String> parameters;

    private Map<String, String> headers;

    private String body;

    public Request(String url, String method, Map<String, String> parameters, Map<String, String> headers, String body) {
        this.url = url;
        this.method = method;
        this.parameters = parameters;
        this.headers = headers;
        this.body = body;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Map<String, String> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

}
