package com.tizfer.di;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student implements Serializable{

	private String stName;
	private String stAge;
	private List<String> famList;
	private Set<String> hobby;
	private Map<String,String> education;

	public Student() {
	}

	public Student(String stName, String stAge) {
		super();
		this.stName = stName;
		this.stAge = stAge;
	}

	public List<String> getFamList() {
		return famList;
	}

	public void setFamList(List<String> famList) {
		this.famList = famList;
	}

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public String getStAge() {
		return stAge;
	}

	public void setStAge(String stAge) {
		this.stAge = stAge;
	}
	
	public Set<String> getHobby() {
		return hobby;
	}

	public void setHobby(Set<String> hobby) {
		this.hobby = hobby;
	}

	public Map<String, String> getEducation() {
		return education;
	}

	public void setEducation(Map<String, String> education) {
		this.education = education;
	}

	public void helloDi() {
		System.out.println(stName+stAge+"\n家庭成员"+famList);
		System.out.println(hobby);
		System.out.println(education);
	}
}
