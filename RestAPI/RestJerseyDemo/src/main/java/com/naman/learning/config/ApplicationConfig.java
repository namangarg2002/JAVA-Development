package com.naman.learning.config;

import org.glassfish.jersey.server.ResourceConfig;

public class ApplicationConfig extends ResourceConfig {
    public ApplicationConfig() {
        packages("com.naman.learning.resource");
    }
}
