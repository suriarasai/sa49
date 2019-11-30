package sg.edu.nus.springjpa.onetooneuni;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkingRepository extends JpaRepository <ParkingSpace, Integer>{

}
