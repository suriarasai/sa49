package sg.edu.nus.springjpa.onetoonebi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestOneToOneBi {

	private static final Logger log = LoggerFactory.getLogger(TestOneToOneBi.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(TestOneToOneBi.class, args);
	}

	@Bean
	public CommandLineRunner demo(BiEmpRepository repository, BiParkingRepository prepository) {
		return (args) -> {
			log.info("Demo One to One Unidirectional Relationship");
		
			
		};
	}
}
