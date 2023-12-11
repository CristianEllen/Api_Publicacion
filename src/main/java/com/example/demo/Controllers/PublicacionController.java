package com.example.demo.Controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.PublicacionModel;
import com.example.demo.Service.PublicacionService;

@RestController
@RequestMapping("/publicacion")
public class PublicacionController {

	@Autowired
	PublicacionService publicacionService;
	
	@GetMapping(path = "/listar")
	public ArrayList<PublicacionModel> obtenerpublicacion(){
		return publicacionService.obtenerpublicacion();
	}
	
	@PostMapping()
	public PublicacionModel guardarPublicacion(@RequestBody PublicacionModel titulo) {
		return this.publicacionService.guardarpublicacion(titulo);
	}
	
	@GetMapping (path = "/{idpublicacion}")
	public Optional<PublicacionModel> obtenerUsuarioPorId(@PathVariable("idpublicacion")Long idpublicacion){
		return this.publicacionService.obtenerPorIdPublicacion(idpublicacion);
	}
	
	@GetMapping (path = "/query")
	public ArrayList<PublicacionModel> obtenerPublicaciondisponibilidad(@RequestParam("disponible")Integer disponible){
		return this.publicacionService.obtenerPordisponibilidad(disponible);
	}
	
	@DeleteMapping(path ="/{idpublicacion}")
		public String eliminarPoridpublicacion(@PathVariable("idpublicacion")Long idpublicacion) {
			boolean ok = this.publicacionService.eliminarPublicacion(idpublicacion);
			if(ok) {
				return "Se eliminó la publicacion con id " + idpublicacion;	
			}else {
				return "No pudo eliminar el publicacion con id " +idpublicacion;
			}
		}
	
}
