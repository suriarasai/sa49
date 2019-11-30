package sg.edu.nus.springjpa.onetooneuni;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PARKING_SPACE")
public class ParkingSpace {
    @Id 
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private int lot;
    private String location;
    
    public ParkingSpace() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ParkingSpace(int lot, String location) {
		super();
		this.lot = lot;
		this.location = location;
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

    public String toString() {
        return "ParkingSpace id: " + getId() + " lot: " + getLot() +
               ", location: " + getLocation();
    }

}
