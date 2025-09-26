package com.kh.java.pet.model.vo;

import java.util.Date;

public class Pet {
	
	private Long userNo;
	private String userId;
	private String userPwd;
	private String userName;
	private String nickName;
	private String phone;
	private String address;
	private String email;
	private String breed;
	private String petName;
	private String gender;
	private Date birthDate;
	private int point;
	
	
	
	public Pet() {
		super();
	}



	public Pet(Long userNo, String userId, String userPwd, String userName, String nickName, String phone,
			String address, String email, String breed, String petName, String gender, Date birthDate, int point) {
		super();
		this.userNo = userNo;
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.nickName = nickName;
		this.phone = phone;
		this.address = address;
		this.email = email;
		this.breed = breed;
		this.petName = petName;
		this.gender = gender;
		this.birthDate = birthDate;
		this.point = point;

	}



	public Long getUserNo() {
		return userNo;
	}



	public void setUserNo(Long userNo) {
		this.userNo = userNo;
	}



	public String getUserId() {
		return userId;
	}



	public void setUserId(String userId) {
		this.userId = userId;
	}



	public String getUserPwd() {
		return userPwd;
	}



	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getNickName() {
		return nickName;
	}



	public void setNickName(String nickName) {
		this.nickName = nickName;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getBreed() {
		return breed;
	}



	public void setBreed(String breed) {
		this.breed = breed;
	}



	public String getPetName() {
		return petName;
	}



	public void setPetName(String petName) {
		this.petName = petName;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public Date getBirthDate() {
		return birthDate;
	}



	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}



	public int getPoint() {
		return point;
	}



	public void setPoint(int point) {
		this.point = point;
	}



	@Override
	public String toString() {
		return "Pet [userNo=" + userNo + ", userId=" + userId + ", userPwd=" + userPwd + ", userName=" + userName
				+ ", nickName=" + nickName + ", phone=" + phone + ", address=" + address + ", email=" + email
				+ ", breed=" + breed + ", petName=" + petName + ", gender=" + gender + ", birthDate=" + birthDate
				+ ", point=" + point + "]";
	}
	
	
	
	
	
	

	
}
