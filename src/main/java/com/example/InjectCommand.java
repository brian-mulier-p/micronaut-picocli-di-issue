package com.example;

import io.micronaut.configuration.picocli.PicocliRunner;
import io.micronaut.context.ApplicationContext;

import jakarta.inject.Inject;

public class InjectCommand implements Runnable {
    @Inject
    private ApplicationContext applicationContext;

    public void run() {
        System.out.println("App Context: " + applicationContext);
    }
}
