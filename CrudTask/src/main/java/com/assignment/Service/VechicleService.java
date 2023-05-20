package com.assignment.Service;

import java.util.List;
import java.util.Optional;

import com.assignment.Entites.Vechicle;

public interface VechicleService {
	
	//add vechicle
	
	Vechicle addVechilce(Vechicle vechicle);
	
	//get all vechicles
	
	List<Vechicle> getAllVechicles();
	
	//get vechile by id
	
	Optional<Vechicle> getVechicleByI(Long id);
	
	//update vechilce
	
	Vechicle updateVechicle(Vechicle vechicle, Long id);
	
	//delete vechicle
	void deleteVechicle(Long id);

}
