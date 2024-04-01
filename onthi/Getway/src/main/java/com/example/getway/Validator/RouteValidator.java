package com.example.getway.Validator;

import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import java.util.function.Predicate;

import java.util.List;

@Component
public class RouteValidator {
    public static final List<String> endpointsNoAuth = List.of(
            "/auth/register",
            "/auth/login"
    );

    public Predicate<ServerHttpRequest> isSecured =
            request -> endpointsNoAuth
                    .stream()
                    .noneMatch(uri -> request.getURI().getPath().contains(uri));
}
