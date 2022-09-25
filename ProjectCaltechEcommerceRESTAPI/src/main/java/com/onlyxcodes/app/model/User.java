package com.onlyxcodes.app.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.transaction.annotation.EnableTransactionManagement;

@Entity
@Table(name = "USER1")
@EnableTransactionManagement

public class User {
	
	
	@Column(name = "username")
	private String pusername;
	
	public String getPusername() {
		return pusername;
	}

	public void setPusername(String pusername) {
		this.pusername = pusername;
	}
	
	
	@Column(name = "password")
	private String ppassword;
	
	
	public String getPpassword() {
		return ppassword;
	}

	public void setPpassword(String ppassword) {
		this.ppassword = ppassword;
	}
	
	@Column(name = "email")
	private String pemail;
	
	public String getPemail() {
		return pemail;
	}

	public void setPbrand(String pemail) {
		this.pemail = pemail;
	}
	
	@Column(name = "phone_number, ")
	private String pphone_number ;
	
	public String getPphone_number() {
		return pphone_number;
	}

	public void setPphone_number(String pphone_number) {
		this.pphone_number = pphone_number;
	}
	

}
