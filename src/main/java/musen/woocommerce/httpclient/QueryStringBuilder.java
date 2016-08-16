package musen.woocommerce.httpclient;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

//https://github.com/box/box-java-sdk/blob/master/src/main/java/com/box/sdk/QueryStringBuilder.java

class QueryStringBuilder {
    private final StringBuilder stringBuilder;

    QueryStringBuilder() {
        this.stringBuilder = new StringBuilder();
    }

    QueryStringBuilder(String existing) {
        if (existing == null) {
            this.stringBuilder = new StringBuilder();
        } else {
            this.stringBuilder = new StringBuilder(existing);
        }
    }

    QueryStringBuilder appendParam(String key, String... fields) throws UnsupportedEncodingException {
        StringBuilder valuesBuilder = new StringBuilder();
        for (String field : fields) {
            valuesBuilder.append(field);
            valuesBuilder.append(",");
        }
        valuesBuilder.deleteCharAt(valuesBuilder.length() - 1);

        this.appendParam(key, valuesBuilder.toString());
        return this;
    }

    QueryStringBuilder appendParam(String key, String value) throws UnsupportedEncodingException {
        if (this.stringBuilder.length() == 0) {
            this.stringBuilder.append('?');
        } else {
            this.stringBuilder.append('&');
        }

        this.stringBuilder.append(key);
        this.stringBuilder.append('=');
        this.stringBuilder.append(this.encode(value));
        return this;
    }

    QueryStringBuilder appendParam(String key, long value) throws UnsupportedEncodingException {
        return this.appendParam(key, Long.toString(value));
    }

    URL addToURL(URL existing) throws MalformedURLException {
        String existingQuery = existing.getQuery();
        if (existingQuery == null || existingQuery.equals("")) {
            return new URL(existing.toString() + this.toString());
        }

        return new URL(existing.toString().replace(existingQuery, this.toString()));
    }

    @Override
    public String toString() {
        return this.stringBuilder.toString();
    }

    public String encode(String unencoded) throws UnsupportedEncodingException {
        return URLEncoder.encode(unencoded, "UTF-8");
    }
}
