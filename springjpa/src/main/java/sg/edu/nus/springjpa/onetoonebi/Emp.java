package sg.edu.nus.springjpa.onetoonebi;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity

public class Emp {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String name;
    private long salary;
    @OneToOne (fetch = FetchType.EAGER)
    @JoinColumn(name="PSPACE_ID") 
    private Parking parking;
    
    public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(String name, long salary, Parking parking) {
		super();
		this.name = name;
		this.salary = salary;
		this.parking = parking;
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
    
    public Parking getParking() {
        return parking;
    }
    
    public void setParking(Parking parkingSpace) {
        this.parking = parkingSpace;
    }

    public String toString() {
        return "Emp id: " + getId() + " name: " + getName() + 
               " with " + getParking();
    }
}
