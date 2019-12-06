package sg.edu.nus.restful.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sg.edu.nus.restful.domain.Car;
import sg.edu.nus.restful.domain.Owner;
import sg.edu.nus.restful.repository.CarRepository;
import sg.edu.nus.restful.repository.OwnerRepository;

@RestController
public class CarController {
	
	@Autowired
	private CarRepository carrepo;
	@Autowired
	private OwnerRepository ownrepo;
	
	   
    @RequestMapping("/cars")
	public Iterable<Car> getCars() {
		return carrepo.findAll();
	}
    @RequestMapping("/owners")
	public Iterable<Owner> getOwners() {
		return ownrepo.findAll();
	}
}
