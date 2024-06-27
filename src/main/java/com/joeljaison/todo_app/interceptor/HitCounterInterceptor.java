package com.joeljaison.todo_app.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class HitCounterInterceptor implements HandlerInterceptor {

    private AtomicInteger hitCounter = new AtomicInteger(0);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // Check if the request URI is the one we want to count hits for
        if (request.getRequestURI().equals("/hello")) {
            int currentHits = hitCounter.incrementAndGet();
            System.out.println("Hit count for /hello: " + currentHits);
        }

        if(request.getRequestURI().equals("/api/todos")){
            int currentHits = hitCounter.incrementAndGet();
            System.out.println("Hit count for /api/todos: " + currentHits);
        }
        return true;
    }
}
