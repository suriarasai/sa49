package sg.edu.nus.restful;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import sg.edu.nus.restful.domain.Car;
import sg.edu.nus.restful.domain.Owner;
import sg.edu.nus.restful.repository.CarRepository;
import sg.edu.nus.restful.repository.OwnerRepository;

@SpringBootApplication
public class RestdemoApplication {

	private CarRepository carrepo;
	private OwnerRepository ownrepo;
	
	@Autowired
	public void setCarRepository(CarRepository crepo) {
		this.carrepo = crepo;
	}
    @Autowired
    public void setOwnerRepoitory(OwnerRepository orepo) {
    	this.ownrepo = orepo;
    }
    
	public static void main(String[] args) {
		SpringApplication.run(RestdemoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
			Owner owner1 = new Owner("Lee Yong" , "Siang");
			Owner owner2 = new Owner("Ong Jun Hao" , "Edmund");
			Owner owner3 = new Owner("Chen Sin Yin", "Stephanie");
			ownrepo.save(owner1);
			ownrepo.save(owner2);
			ownrepo.save(owner3);
			
			carrepo.save(new Car("Ford", "Mustang", "Red", "SKF1121H", 2017, 59000, owner1));
			carrepo.save(new Car("Nissan", "Leaf", "White", "SJN3002U", 2014, 29000, owner2));
			carrepo.save(new Car("Toyota", "Prius", "Silver", "SST3456K", 2019, 39000, owner2));
			carrepo.save(new Car("BMW", "i8", "Silver", "SGU3456K", 2019, 109000, owner3));
			
		};
	}	
}
