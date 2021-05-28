package com.RepoM.RepositoryManager.Entity;

//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "inventory")
public class Inventory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "quantity")
	private int quantity;

	@Column(name = "refilldate")
	private String refilldate;

	@OneToOne // yeh nahi hatega
	private Product product;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getRefilldate() {
		return refilldate;
	}

	public void setRefilldate(String refilldate) {
		this.refilldate = refilldate;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Inventory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Inventory(int id, int quantity, String refilldate, Product product) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.refilldate = refilldate;
		this.product = product;
	}

}
