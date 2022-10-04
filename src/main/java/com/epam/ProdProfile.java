package com.epam;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProdProfile {
    public ProdProfile() {
        System.out.println("Prod profile is called");
    }
}