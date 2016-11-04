package com.example.project.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.example.project.service.UserService;

@Component
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig() {
		register(UserService.class);
	}
}
