package com.example.demo;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

import javax.inject.Qualifier;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

public class GreeterModule extends AbstractModule {
    @Qualifier
    @Retention(RUNTIME)
    @interface EnMessage {}

    @Qualifier
    @Retention(RUNTIME)
    @interface ZhMessage {}

    @Provides
    public Integer provideCount() {
        return 4;
    }

    @Provides
    @EnMessage
    public String provideEnMessage() {
        return "hello world";
    }

    @Provides
    @ZhMessage
    public String provideZhMessage() {
        return "你好 世界";
    }
}
