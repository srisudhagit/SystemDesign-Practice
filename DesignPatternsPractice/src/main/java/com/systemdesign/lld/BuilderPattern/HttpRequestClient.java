package com.systemdesign.lld.BuilderPattern;

public class HttpRequestClient {
    public static void main(String[] args) {
        HttpRequest request = new HttpRequest.Builder("http://example.com/api/data")
                .method("POST")
                .body("{\"key\":\"value\"}")
                .addHeaders("Content-Type", "application/json")
                .addQueryParams("version", "1.0")
                .timeout(10000)
                .build();

        System.out.println("URL: " + request.getUrl());
        System.out.println("Method: " + request.getMethod());
        System.out.println("Body: " + request.getBody());
        System.out.println("Headers: " + request.getHeaders());
        System.out.println("Query Params: " + request.getQueryParams());
        System.out.println("Timeout: " + request.getTimeout() + " ms");


        HttpRequest getRequest = new HttpRequest.Builder("http://example.com/api/info")
                .addQueryParams("detail", "full")
                .build();
        System.out.println("URL: " + getRequest.getUrl());
        System.out.println("Method: " + getRequest.getMethod());
        
    }
}
