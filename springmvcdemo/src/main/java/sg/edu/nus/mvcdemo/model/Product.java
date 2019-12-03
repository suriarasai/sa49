package sg.edu.nus.mvcdemo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nn;
	private String description;
	@Length(min = 3, max = 20)
	private String type;
	private double price;
	private long currentStock;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int id, String name, String description, String type, double price, long currentStock) {
		super();
		this.id = id;
		this.nn = name;
		this.description = description;
		this.type = type;
		this.price = price;
		this.currentStock = currentStock;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return nn;
	}
	public void setName(String name) {
		this.nn = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public long getCurrentStock() {
		return currentStock;
	}
	public void setCurrentStock(long currentStock) {
		this.currentStock = currentStock;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + nn + ", description=" + description + ", type=" + type + ", price="
				+ price + ", currentStock=" + currentStock + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	

}
