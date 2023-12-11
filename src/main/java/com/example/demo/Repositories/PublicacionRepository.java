package com.example.demo.Repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.PublicacionModel;

@Repository
public interface PublicacionRepository extends CrudRepository<PublicacionModel,Long>{
	public abstract ArrayList<PublicacionModel> findBydisponible(Integer disponible);
	
}
