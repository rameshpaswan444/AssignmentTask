package com.assignment.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.Entites.Vechicle;
import com.assignment.Repo.VechicleRepo;
import com.assignment.Service.VechicleService;

@Service
public class VechicleServiceImpl implements VechicleService{
	
	@Autowired
	private VechicleRepo vechicleRepo;

	@Override
	public Vechicle addVechilce(Vechicle vechicle) {
		return vechicleRepo.save(vechicle);
	}

	@Override
	public List<Vechicle> getAllVechicles() {
		return vechicleRepo.findAll();
	}

	@Override
	public Optional<Vechicle> getVechicleByI(Long id) {
		return vechicleRepo.findById(id);
	}

	@Override
	public Vechicle updateVechicle(Vechicle vechicle, Long id) {
		vechicle.setId(id);
		return vechicleRepo.save(vechicle);
	}

	@Override
	public void deleteVechicle(Long id) {
		vechicleRepo.deleteById(id);
		
	}

}
