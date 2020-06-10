package br.com.alura.forum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.controller.dto.TopicoDto;
import br.com.alura.forum.model.Topico;
import br.com.alura.forum.repository.TopicoRepository;

@RestController
@RequestMapping("/topicos")
public class TopicosController {

	@Autowired
	private TopicoRepository repository;

	@GetMapping
	public List<TopicoDto> lista(String nomeCurso) {
		if( nomeCurso ==  null) {
			List<Topico> topicos = repository.findAll();
			return TopicoDto.converter(topicos);
		} else {
			List<Topico> topicos = repository.findByCurso_Nome(nomeCurso);
			return TopicoDto.converter(topicos);
		}
		
	}
}
