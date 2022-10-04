package com.epam;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("stg")
public class StgProfile {
    public StgProfile() {
        System.out.println("Stg profile is called");
    }
}