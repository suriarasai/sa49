package sg.edu.nus.springjpa.onetooneuni;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestOneToOneUni {

	private static final Logger log = LoggerFactory.getLogger(TestOneToOneUni.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(TestOneToOneUni.class, args);
	}

	@Bean
	public CommandLineRunner demo(EmployeeRepository repository, ParkingRepository prepository) {
		return (args) -> {
			log.info("Demo One to One Unidirectional Relationship");
			ParkingSpace ps1 = new ParkingSpace(100, "ISS 29 HMKT");
			ParkingSpace ps2 = new ParkingSpace(101, "SFAH");
			ParkingSpace ps3 = new ParkingSpace(102, "GUILD HOUSE");
			ArrayList<ParkingSpace> plist = new ArrayList<ParkingSpace>();
			plist.add(ps1);plist.add(ps2);plist.add(ps3);
			prepository.saveAll(plist);
			Employee e1 = new Employee("Dilbert", 1000, ps1);
			Employee e2 = new Employee("Alice", 1000, ps2);
			Employee e3 = new Employee("Pointy", 1000, ps3);
			ArrayList<Employee> list = new ArrayList<Employee>();
			list.add(e1);list.add(e2);list.add(e3);
			repository.saveAll(list);
			
			for (Employee e : repository.findAll()) {
				log.info(e.toString());
			}
			
			
		};
	}
}
