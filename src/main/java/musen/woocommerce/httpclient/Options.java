package musen.woocommerce.httpclient;

import java.util.Map;

/**
 * Created by Muluneh on 8/15/2016.
 */
public class Options {

    private static final String VERSION = "v3";

    private static final int TIMEOUT = 15;

    private Map<String, String> options;

    public Options(Map<String, String> options) {
        this.options = options;
    }

    public String getVersion() {
        return this.options.get("version") != null ?
                this.options.get("version") : this.VERSION;
    }

    public boolean verifySsl() {
        return this.options.get("verify_ssl") != null ?
                Boolean.parseBoolean(this.options.get("verify_ssl")) : true;
    }

    public int getTimeout() {
        return this.options.get("timeout") != null ?
                Integer.parseInt(this.options.get("timeout")) : this.TIMEOUT;
    }

    public boolean isQueryStringAuth() {
        return this.options.get("query_string_auth") != null ?
                Boolean.parseBoolean(this.options.get("query_string_auth")) : false;
    }

    public boolean isWPAPI() {
        return this.options.get("wp_api") != null ?
                Boolean.parseBoolean(this.options.get("wp_api")) : false;
    }

}
