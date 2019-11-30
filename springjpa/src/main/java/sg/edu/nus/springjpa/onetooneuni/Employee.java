package sg.edu.nus.springjpa.onetooneuni;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Employee {
    
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String name;
    private long salary;
    @OneToOne 
    @JoinColumn(name="PSPACE_ID") 
    private ParkingSpace parkingSpace;
    
    public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, long salary, ParkingSpace parkingSpace) {
		super();
		this.name = name;
		this.salary = salary;
		this.parkingSpace = parkingSpace;
	}
    

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
    
    public ParkingSpace getParkingSpace() {
        return parkingSpace;
    }
    
    public void setParkingSpace(ParkingSpace parkingSpace) {
        this.parkingSpace = parkingSpace;
    }

    public String toString() {
        return "Employee id: " + getId() + " name: " + getName() + 
               " with " + getParkingSpace().toString();
    }
}
