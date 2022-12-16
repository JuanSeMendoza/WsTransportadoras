package com.melexa.tr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.melexa.tr.service.ApiColvanes;

@SpringBootApplication
public class IntegracionTransportadorasApplication {
	@Autowired
	ApiColvanes apiColvanes;
	public static void main(String[] args) {
		SpringApplication.run(IntegracionTransportadorasApplication.class, args);
		
	}
	@EventListener(ApplicationReadyEvent.class)
	public void doSomethingAfterStartup() {
	  apiColvanes.consultaRemesa();
	}

}
