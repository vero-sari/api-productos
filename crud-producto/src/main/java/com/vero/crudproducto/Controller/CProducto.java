package com.vero.crudproducto.Controller;

import java.util.List;

import com.vero.crudproducto.Modelo.MProducto;
import com.vero.crudproducto.Repositorio.RProducto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
	RequestMethod.DELETE })
@RequestMapping("/api/productos")
public class CProducto {
	@Autowired
	private RProducto repository;

	@PostMapping("/producto")
	public MProducto create(@Validated @RequestBody MProducto p) {
		return repository.insert(p);
	}

	@GetMapping("/producto")
	public List<MProducto> readAll() {
		return repository.findAll();
	}

	@PutMapping("/producto/{id}")
	public MProducto update(@PathVariable String id, @Validated @RequestBody MProducto p) {
		return repository.save(p);
	}

	@DeleteMapping("/producto/{id}")
	public void delete(@PathVariable String id) {
		repository.deleteById(id);
	}
}
