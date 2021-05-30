package com.RepoM.RepositoryManager.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="userDetails")
public class userDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="userName")
	private String userName;
	
	@Column(name="address")
	private String address; 
	
	@Column(name="phoneNumber",unique = true)
	private String phoneNumber;
	
	@OneToOne(mappedBy = "userdetails")
	private user user;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public user getUser() {
		return user;
	}


	public void setUser(user user) {
		this.user = user;
	}


	public userDetails() {
	}


	public userDetails(int id, String userName, String address, String phoneNumber,
			com.RepoM.RepositoryManager.Entity.user user) {
		super();
		this.id = id;
		this.userName = userName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.user = user;
	}
	
	
	
	
	
	
	
}
