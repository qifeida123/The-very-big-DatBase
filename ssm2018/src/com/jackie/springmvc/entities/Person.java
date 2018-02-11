package com.jackie.springmvc.entities;

public class Person {

    private Long id;
    private String username;
    private String address;
    private String phone;
    private String remark;
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCreated() {
		return created;
	}

	public void setCreated(Long created) {
		this.created = created;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
    private Long created = System.currentTimeMillis();

    @Override
	public String toString() {
		return "Person [id=" + id + ", created=" + created + ", username=" + username + ", address=" + address
				+ ", phone=" + phone + ", remark=" + remark + "]";
	}

}
