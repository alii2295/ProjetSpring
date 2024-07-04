/*package com.ali.demo.config;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.logging.Filter;
import java.util.logging.LogRecord;

public class authentificationfiltre implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        HttpSession session = req.getSession(false);
        String uri = req.getRequestURI();

        if (session == null || session.getAttribute("user") == null) {
            if (uri.startsWith("/api/v1/secure")) {
                {
                    res.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Vous devez vous connecter pour accéder à cette ressource.");
                    return;
                }
            }

            chain.doFilter(request, response);
        }


    }

    @Override
    public boolean isLoggable(LogRecord record) {
        return false;
    }
}
*/