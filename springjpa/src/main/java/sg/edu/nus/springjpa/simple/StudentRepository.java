package sg.edu.nus.springjpa.simple;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepository extends JpaRepository<Student, Integer>{
    public ArrayList<Student> findSamplesByIdAndCgpa(int id, double cg);
    public int countByFees(double fee);
    
    //@Query- Querying the object
    @Query("select s from Student s where s.nickName like ?1 ")
    public ArrayList<Student> searchingForGeek(String nn);
}
