package com.melexa.tr.controller;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ControladorData {
	
	@GetMapping("obtenerInformacion")
	public String obtenerInformacion() {
		
		return "Hola Juan";
	}
}
