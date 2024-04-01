package com.example.student.config;

import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.retry.support.RetryTemplate;

import java.io.IOException;

public class RetryTemplateInterceptor implements ClientHttpRequestInterceptor {

    private final RetryTemplate retryTemplate;

    public RetryTemplateInterceptor(RetryTemplate retryTemplate) {
        this.retryTemplate = retryTemplate;
    }

    @Override
    public ClientHttpResponse intercept(org.springframework.http.HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
        return retryTemplate.execute(context -> execution.execute(request, body));
    }
}