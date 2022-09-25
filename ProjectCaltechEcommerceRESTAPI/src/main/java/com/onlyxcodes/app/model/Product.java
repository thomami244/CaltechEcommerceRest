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
@Table(name = "PRODUCT1")
@EnableTransactionManagement
public class Product {
		
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
		
		@Column(name = "productName")
		private String pname;
		
		public String getPname() {
			return pname;
		}

		public void setPname(String pname) {
			this.pname = pname;
		}
		
		
		@Column(name = "season")
		private String pseason;
		
		
		public String getPseason() {
			return pseason;
		}

		public void setPseason(String pseason) {
			this.pseason = pseason;
		}
		
		@Column(name = "brand")
		private String pbrand;
		
		public String getPbrand() {
			return pbrand;
		}

		public void setPbrand(String pbrand) {
			this.pseason = pbrand;
		}
		
		@Column(name = "category, ")
		private String pcategory ;
		
		public String getPcategory() {
			return pcategory;
		}

		public void setPcategory(String pcategory) {
			this.pcategory = pcategory;
		}
		
		@Column(name = "price")
		private BigDecimal  pprice;
		
		public BigDecimal getPprice() {
			return pprice;
		}

		public void setPprice(BigDecimal pprice) {
			this.pprice = pprice;
		}
		
		@Column(name = "color")
		private String pcolor;
		
		public String getPcolor() {
			return pcolor;
		}

		public void setPcolor(String pcolor) {
			this.pcolor = pcolor;
		}
		
		
		@Column(name = "createdDate")
		private String pcreatedDate;
		
		public String getPcreatedDate() {
			return pcreatedDate;
		}

		public void setPcreatedDate(String pcreatedDate) {
			this.pcreatedDate = pcreatedDate;
		}
		
		@Column(name = "discount, ")
		private BigDecimal pdiscount ;
		
		public BigDecimal getPdiscount() {
			return pdiscount;
		}

		public void setPdiscount(BigDecimal pdiscount) {
			this.pdiscount = pdiscount;
		}
		
		@Column(name = "quantity")
		private int pquantity;
		
		public int getPquantity() {
			return pquantity;
		}

		public void setPquantity(int pquantity) {
			this.pquantity = pquantity;
		}
				
	}

