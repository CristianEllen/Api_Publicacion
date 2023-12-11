package com.example.demo.Service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.PublicacionModel;
import com.example.demo.Repositories.PublicacionRepository;

@Service
public class PublicacionService {
	
	@Autowired
	PublicacionRepository publicacionRepository;
	
	public ArrayList<PublicacionModel> obtenerpublicacion(){
		return(ArrayList<PublicacionModel>) publicacionRepository.findAll();
		
	}
	
	public PublicacionModel guardarpublicacion(PublicacionModel publicacion) {
		return publicacionRepository.save(publicacion);
	}
	
	public Optional<PublicacionModel> obtenerPorIdPublicacion(Long idpublicacion){
		return publicacionRepository.findById(idpublicacion);
	}
	
	public ArrayList<PublicacionModel> obtenerPordisponibilidad(Integer disponible){
		return publicacionRepository.findBydisponible(disponible);
	}
	
	public boolean eliminarPublicacion(Long idpublicacion) {
		try {
			publicacionRepository.deleteById(idpublicacion);
			return true;	
		} catch(Exception err){
			return false;
		}
	}

}
