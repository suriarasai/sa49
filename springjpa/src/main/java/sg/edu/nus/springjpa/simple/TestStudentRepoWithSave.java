package sg.edu.nus.springjpa.simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class TestStudentRepoWithSave {
	
private static final Logger log = LoggerFactory.getLogger(TestStudentRepoWithSave.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(TestStudentRepoWithSave.class, args);
	}

	@Bean
	public CommandLineRunner demosave(StudentRepository srepo) {
		return (args) -> {
			
			log.info("Demo the save method");
			Student s1 = new Student("Alice","supergeek","adv java",345.67,5.0);
			srepo.save(s1);
			Student s2 = new Student("Alice","supergeek","adv java",345.67,5.0);
			srepo.save(s2);
			for (Student s : srepo.findAll()) {
				log.info("Student Record"+s.toString());
			}
			
		};
	}

}
