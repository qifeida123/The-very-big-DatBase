package com.jackie.springmvc.entities;

import javax.persistence.*;

@Entity
public class Address {
	@Id
    private String province;
	@Column
    private String city;
	@OneToOne
	@JoinColumn(name = "us")
	private User7 user;
	
    public User7 getUser() {
		return user;
	}

	public void setUser(User7 user) {
		this.user = user;
	}

	public String getProvince() {
        return province;
    }
 
    public void setProvince(String province) {
        this.province = province;
    }
 
    public String getCity() {
        return city;
    }
 
    public void setCity(String city) {
        this.city = city;
    }
 
    @Override
    public String toString() {
        return "Address [province=" + province + ", city=" + city + "]";
    }
    
}