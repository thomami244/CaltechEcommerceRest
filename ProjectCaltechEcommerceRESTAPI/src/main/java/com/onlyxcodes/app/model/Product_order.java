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
@Table(name = "product_order")
@EnableTransactionManagement

public class Product_order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "userID")
	private int puserID;
	
	
	public int getPuserID() {
		return puserID;
	}

	public void setPuserID(int puserID) {
		this.puserID = puserID;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "productId")
	private int pid;
	
	
	public int getPId() {
		return pid;
	}

	public void setPId(int pid) {
		this.pid = pid;
	}
	
	
	

}
