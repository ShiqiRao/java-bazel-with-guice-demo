package com.example.demo;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class App {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new GreeterModule());
        Greeter greeter = injector.getInstance(Greeter.class);
        greeter.greet();
    }
}
