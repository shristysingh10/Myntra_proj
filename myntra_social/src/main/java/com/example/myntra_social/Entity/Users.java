package com.example.myntra_social.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name="Users")
public class Users {

	@Id
	@GeneratedValue
	private int id;
	//@NotNull
	private String userId;
	private String userName;
	private String profileImage;
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(int id, String userId, String userName, String profileImage) {
		super();
		this.id = id;
		this.userId = userId;
		this.userName = userName;
		this.profileImage = profileImage;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getProfileImage() {
		return profileImage;
	}
	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}
	
	
	
}
