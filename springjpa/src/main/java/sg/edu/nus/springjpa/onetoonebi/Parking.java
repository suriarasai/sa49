package sg.edu.nus.springjpa.onetoonebi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Parking {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private int lot;
    private String location;
    @OneToOne(mappedBy="parking")
    private Emp emp;
    
    public Parking(int lot, String location, Emp emp) {
		super();
		this.lot = lot;
		this.location = location;
		this.emp = emp;
	}

	public Parking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public int getLot() {
        return lot;
    }

    public void setLot(int lot) {
        this.lot = lot;
    }
    
    public String getLocation() {
        return location;
    }
    
    public void setLocation(String deptName) {
        this.location = deptName;
    }

    public Emp getEmp() {
        return emp;
    }

    public void setEmp(Emp emp) {
        this.emp = emp;
    }
    
    public String toString() {
        return "ParkingSpace id: " + getId() + " lot: " + getLot() +
               ", location: " + getLocation();
    }
}
