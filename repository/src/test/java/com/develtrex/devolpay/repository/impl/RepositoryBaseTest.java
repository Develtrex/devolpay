package com.develtrex.devolpay.repository.impl;

import com.develtrex.devolpay.config.EntityConfig;
import com.develtrex.devolpay.config.RepositoryConfig;
import org.junit.After;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class RepositoryBaseTest {
    protected AnnotationConfigApplicationContext contextEntity = new AnnotationConfigApplicationContext(EntityConfig.class);
    protected AnnotationConfigApplicationContext contextRepository = new AnnotationConfigApplicationContext(RepositoryConfig.class);
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }
}
