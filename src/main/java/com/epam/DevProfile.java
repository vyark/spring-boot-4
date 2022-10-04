package com.epam;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevProfile {

    public DevProfile() {
        System.out.println("Dev profile is called");
    }
}