package com.epam;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("local")
public class LocalProfile {
    public LocalProfile() {
        System.out.println("Local profile is called");
    }
}