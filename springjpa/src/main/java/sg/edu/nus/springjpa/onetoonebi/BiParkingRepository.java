package sg.edu.nus.springjpa.onetoonebi;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BiParkingRepository extends JpaRepository<Parking, Integer>{

}
