package com.example.cicdproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestCiCdProjectApplication {

    public static void main(String[] args) {
        SpringApplication.from(CiCdProjectApplication::main).with(TestCiCdProjectApplication.class).run(args