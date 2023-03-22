package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotels extends BaseClass {
	
	public SearchHotels() {
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "location")
	private WebElement loc;
	@FindBy(id = "hotels")
	private WebElement hot;
	@FindBy(id = "room_type")
	private WebElement rt;
	@FindBy(id = "room_nos")
	private WebElement rn;
	@FindBy(id = "adult_room")
	private WebElement ar;
	@FindBy(id = "child_room")
	private WebElement cr;
	@FindBy(id = "Submit")
	private WebElement search; 
	
	
public WebElement getloc() {
	return loc;
	
}
	
	public WebElement getRt() {
		return rt;
	}
	public WebElement getRn() {
		return rn;
	}
	public WebElement getAr() {
		return ar;
	}
		public WebElement getCr() {
			return cr;	
		}
			public WebElement getSearch() {
				return search;	
	}
}
	
	
	
	


