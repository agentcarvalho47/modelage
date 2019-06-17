package com.ifpi.ted2019.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.ifpi.ted2019.domain.*;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {
	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listar() {
		List<Categoria> categorias = new ArrayList<Categoria>();
		categorias.add(new Categoria(1, "Informática"));
		categorias.add(new Categoria(2, "Escritório"));
		categorias.add(new Categoria(3, "Laboratório"));
		return categorias;
	}
	
}
