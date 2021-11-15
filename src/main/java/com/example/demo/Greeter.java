package com.example.demo;

import com.google.inject.Inject;

public class Greeter {

    private final String enMessage;
    private final String zhMessage;
    private final Integer count;

    @Inject
    public Greeter(@GreeterModule.EnMessage String message,
                   @GreeterModule.ZhMessage String zhMessage,
                   Integer count) {
        this.enMessage = message;
        this.zhMessage = zhMessage;
        this.count = count;
    }

    public void greet() {
        for (int i = 0; i < count; i++) {
            System.out.println(enMessage);
        }
        System.out.println(zhMessage);
    }
}
