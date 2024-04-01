package com.example.student.config;
import com.google.common.util.concurrent.RateLimiter;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class RateLimitingInterceptor implements ClientHttpRequestInterceptor {

    private final RateLimiter rateLimiter;

    public RateLimitingInterceptor(double permitsPerSecond) {
        rateLimiter = RateLimiter.create(permitsPerSecond);
    }

    @Override
    public ClientHttpResponse intercept(org.springframework.http.HttpRequest request, byte[] body,
                                        ClientHttpRequestExecution execution) throws IOException {
        if (rateLimiter.tryAcquire()) {
            return execution.execute(request, body);
        } else {
            throw new IOException("Rate limit exceeded. Try again later.");
        }
    }
}
