package com.melexa.tr;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.melexa.tr.model.Colvanes;
import com.melexa.tr.service.ApiColvanes;

@SpringBootTest
class IntegracionTransportadorasApplicationTests {
	@Autowired
	ApiColvanes apiColvanes ;
	@Test
	void contextLoads() {
		
	}
	
	@Test
	void pruebaApiColvanes() {
		
		String prueba = apiColvanes.consultaRemesa();
		
		System.out.print(prueba);
	}

}
