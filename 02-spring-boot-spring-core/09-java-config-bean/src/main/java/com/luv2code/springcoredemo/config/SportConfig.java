package com.luv2code.springcoredemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.luv2code.util.Coach;
import com.luv2code.util.SwimCoach;

@Configuration
public class SportConfig {
	
	//custom bean id aquatic
	@Bean("aquatic")
	// the bean id here defaults to the method name with first letter 
	//small as swimCoach
	public Coach swimCoach() {
		return new SwimCoach();
	}
}
