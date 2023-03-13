package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


	@RestController
	@RequestMapping("/bsm-generation")
	public class BsmController {

		@GetMapping
		public String bsm () {
			return " Responsabilidade Pessoal, Persistência, Mentalidade de Crescimento, Orientação ao futuro, Comunicação, Trabalho em Equipe, Proatividade e Orientação ao Detalhe. ";
		}
}
