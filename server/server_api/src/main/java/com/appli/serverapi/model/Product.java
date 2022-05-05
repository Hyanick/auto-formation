package com.appli.serverapi.model;

import javax.persistence.*;

@Entity
@Table(name = "products")

public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "title")
	private String title;
	@Column(name = "description")
	private String description;
	@Column(name = "category")
	private String category;
	@Column(name = "price")
	private String price;
	@Column(name = "activated")
	private boolean activated;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String title, String description, String category, String price, boolean activated) {
		super();
		this.title = title;
		this.description = description;
		this.category = category;
		this.price = price;
		this.activated = activated;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public boolean isActivated() {
		return activated;
	}
	public void setActivated(boolean activated) {
		this.activated = activated;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", title=" + title + ", description=" + description + ", category=" + category + ", price="
				+ price + ", activated=" + activated + "]";
	}
	
	

}
