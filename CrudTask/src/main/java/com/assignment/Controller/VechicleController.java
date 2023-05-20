package com.assignment.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.Entites.Book;
import com.assignment.Entites.Vechicle;
import com.assignment.Service.BookService;
import com.assignment.Service.VechicleService;

@RestController
@RequestMapping("/vechicle")
public class VechicleController {
	
	
	
	
	
	@Autowired
	private VechicleService vechicleService;
	
	//add vechicle
	
	@PostMapping("/add")
	public ResponseEntity<Vechicle> addVechicle(@RequestBody Vechicle vechicle)
	{
		vechicleService.addVechilce(vechicle);
		
		return ResponseEntity.ok(vechicle);
	}
	
	//get all vechicle
	
	@GetMapping("/get")
	public ResponseEntity<List<Vechicle>> getAllVechicle(){
		List<Vechicle> vechicle = vechicleService.getAllVechicles();
		return ResponseEntity.ok(vechicle);
	}
	
	//get vechicle by id
	@GetMapping("/{id}")
	public Optional<Vechicle> getVechicleById(@PathVariable("id") Long id){
		
		return vechicleService.getVechicleByI(id);
	
	}
	//update vechicle
	@PutMapping("/{id}")
	public Vechicle updateVechicle(@RequestBody Vechicle vechicle, @PathVariable("id") Long id) {
		return vechicleService.updateVechicle(vechicle, id);
		
	}
	
	//delete Vechicle
	@DeleteMapping("/{id}")
	public void deleteVechicle(@PathVariable("id") Long id) {
		
		vechicleService.deleteVechicle(id);

}
}
