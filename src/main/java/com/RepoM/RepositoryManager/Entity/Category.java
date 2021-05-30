package com.RepoM.RepositoryManager.Entity;


import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class Category {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "cname", nullable = false)
	private String cName;
	
	@Column(name="cimage")
	private String categoryImage;
	@Column(name = "description", nullable = false)
	private String description;

	@OneToMany(cascade = { CascadeType.DETACH, CascadeType.MERGE,

			CascadeType.REFRESH }, targetEntity = Product.class, mappedBy = "category")

	private List<Product> products;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getDescription() {
		return description;
	}

	public String getCategoryImage() {
		return categoryImage;
	}

	public void setCategoryImage(String categoryImage) {
		this.categoryImage = categoryImage;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

    
	public Category(String cName, String categoryImage, String description, List<Product> products) {
		super();
		this.cName = cName;
		this.categoryImage = categoryImage;
		this.description = description;
		this.products = products;
	}

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

}
