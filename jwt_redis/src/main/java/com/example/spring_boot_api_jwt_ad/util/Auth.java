package com.example.spring_boot_api_jwt_ad.util;

import com.example.spring_boot_api_jwt_ad.authen.UserPrincipal;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class Auth {
    public static Long getUserId() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        UserPrincipal userPrincipal = (UserPrincipal) auth.getPrincipal();


        return userPrincipal.getUserId();
    }
}
