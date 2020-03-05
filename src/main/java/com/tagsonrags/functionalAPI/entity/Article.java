package com.tagsonrags.functionalAPI.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import com.tagsonrags.functionalAPI.util.ArticleAge;
import com.tagsonrags.functionalAPI.util.ArticleType;



@Entity
public class Article {
	
	private Long id;
	private String brand;
	private ArticleType articleType;
	private ArticleAge articleAge;
	private double price;
	private String description;
	private String articlePictureUrl;
	private Listing listingId;
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public ArticleType getArticleType() {
		return articleType;
	}
	public void setArticleType(ArticleType articleType) {
		this.articleType = articleType;
	}
	public ArticleAge getArticleAge() {
		return articleAge;
	}
	public void setArticleAge(ArticleAge articleAge) {
		this.articleAge = articleAge;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getArticlePictureUrl() {
		return articlePictureUrl;
	}
	public void setArticlePictureUrl(String articlePictureUrl) {
		this.articlePictureUrl = articlePictureUrl;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@ManyToOne
	@JoinColumn(name = "Listing ID")
	public Listing getListingId() {
		return listingId;
	}
	public void setListingId(Listing listingId) {
		this.listingId = listingId;
	}


}
