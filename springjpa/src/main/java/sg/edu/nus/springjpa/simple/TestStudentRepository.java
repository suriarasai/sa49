package sg.edu.nus.springjpa.simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//@SpringBootApplication
public class TestStudentRepository {

	private static final Logger log = LoggerFactory.getLogger(TestStudentRepository.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(TestStudentRepository.class, args);
	}

	//@Bean
	public CommandLineRunner demo(StudentRepository srepo) {
		return (args) -> {
			for (Student s : srepo.findAll()) {
				log.info("Student Record"+s.toString());
			}
			log.info("We are trying the finder method");
			for (Student s : srepo.findSamplesByIdAndCgpa(1, 5.0)) {
				log.info("Student Record"+s.toString());
			}
			log.info("I hear rain - i hear hunry stomach");
			log.info("Count please"+srepo.countByFees(123.45));
			
			log.info("@Query annotation");
			for (Student s : srepo.searchingForGeek("g%")) {
				log.info("Student Record"+s.toString());
			}
		};
	}
}
