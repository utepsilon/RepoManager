package com.RepoM.RepositoryManager.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="image")
	private String productImage;

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	@Column(name = "pname", nullable = false)
	private String pName;

	@Column(name = "price", nullable = false)
	private int price;

	@Column(name = "company", nullable = false)
	private String company;

	@ManyToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH })
	@JoinColumn(name = "category_id")
	private Category category;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "inventory_id", nullable = false)
	private Inventory inventory;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "discount_id")
	private discount discount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public discount getDiscount() {
		return discount;
	}

	public void setDiscount(discount discount) {
		this.discount = discount;
	}


	public Product(String productImage, String pName, int price, String company, Category category, Inventory inventory,
			com.RepoM.RepositoryManager.Entity.discount discount) {
		super();
		this.productImage = productImage;
		this.pName = pName;
		this.price = price;
		this.company = company;
		this.category = category;
		this.inventory = inventory;
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", pName=" + pName + ", price=" + price + ", company=" + company + ", category="
				+ category + ", inventory=" + inventory + "]";
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="discount_id")	
//	private Discount discount;

}
