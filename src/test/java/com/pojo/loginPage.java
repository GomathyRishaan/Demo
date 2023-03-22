package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage extends BaseClass {
	
	public Login() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "username")
	private WebElement use;
	@FindBy(id = "password")
	private WebElement pass;
	@FindBy(id = "login")
	private WebElement login;
	
	public WebElement getUse() {
		return use;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLogin() {
		return login;
	}
	}
		
	

