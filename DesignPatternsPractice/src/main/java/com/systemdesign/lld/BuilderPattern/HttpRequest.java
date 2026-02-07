package com.systemdesign.lld.BuilderPattern;

import java.util.HashMap;
import java.util.Map;

public class HttpRequest {
    //mandatory fields
    private final String url;

    //optional fields
    private final String method;
    private final String body;
    private final Map<String, String> headers;
    private final Map<String, String> queryParams;
    private final int timeout;

    // private constructor to enforce object creation through the builder
    private HttpRequest(Builder builder) {
        this.url = builder.url;
        this.method = builder.method;
        this.body = builder.body;
        this.headers = builder.headers;
        this.queryParams = builder.queryParams;
        this.timeout = builder.timeout;
    }

    // create getters for all fields
    public String getUrl() {
        return url;
    }
    public String getMethod() {
        return method;
    }
    public String getBody() {
        return body;
    }
    public Map<String, String> getHeaders() {
        return headers;
    }
    public Map<String, String> getQueryParams() {
        return queryParams;
    }
    public int getTimeout() {
        return timeout;
    }

    // Static nested Builder class to build HttpRequest objects
    public static class Builder {
        private String url;
        private String method = "GET"; // default method

        private String body = "";
        private Map<String, String> headers = new HashMap<>();
        private Map<String, String> queryParams = new HashMap<>();
        private int timeout = 5000; // default timeout in milliseconds

        // Builder constructor with mandatory parameters and return this for chaining
        // fluent interface
        public Builder(String url) {
            this.url = url;
        }

        // methods to set optional parameters
        public Builder method(String method) {
            this.method = method;
            return this;
        }

        public Builder body(String body) {
            this.body = body;
            return this;
        }

        public Builder addHeaders(String key, String value) {
            this.headers.put(key, value);
            return this;
        }

        public Builder addQueryParams(String key, String value) {
            this.queryParams.put(key, value);
            return this;
        }   

        public Builder timeout(int timeout) {
            this.timeout = timeout;
            return this;
        }

        public HttpRequest build() {
            return new HttpRequest(this);
        }
    }
}
