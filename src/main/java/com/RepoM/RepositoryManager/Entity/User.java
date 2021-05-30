package com.RepoM.RepositoryManager.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class user {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "firstName")
	private String fName;

	@Column(name = "lastName")
	private String lName;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userdetails_id")
	private userDetails userdetails;




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getfName() {
		return fName;
	}




	public void setfName(String fName) {
		this.fName = fName;
	}




	public String getlName() {
		return lName;
	}




	public void setlName(String lName) {
		this.lName = lName;
	}




	public userDetails getUserdetails() {
		return userdetails;
	}




	public void setUserdetails(userDetails userdetails) {
		this.userdetails = userdetails;
	}




	public user(String fName, String lName, userDetails userdetails) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.userdetails = userdetails;
	}

	user(){
				}
}
