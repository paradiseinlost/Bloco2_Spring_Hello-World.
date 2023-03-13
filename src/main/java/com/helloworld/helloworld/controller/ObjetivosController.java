package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos-generation")

public class ObjetivosController {

	@GetMapping
	public String objetivo () {
		return " Entender Spring, conseguir finalizar as task e aplicar tanto no projeto integrador, quanto no projeto Blog pessoal. ";
	}
		
}
