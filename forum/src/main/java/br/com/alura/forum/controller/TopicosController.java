package br.com.alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.controller.dto.TopicoDto;
import br.com.alura.forum.model.Curso;
import br.com.alura.forum.model.Topico;

@RestController
@RequestMapping("/topicos")
public class TopicosController {
	
	@GetMapping
	public List<TopicoDto> lista() {
		Topico topico = new Topico("Duvida", "Duvida com spring", new Curso("Spring", "Programação"));
	
		
		return TopicoDto.converter(Arrays.asList(topico, topico,topico));
	}
}
