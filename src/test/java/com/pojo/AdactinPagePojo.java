package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.stepdef.Hooks;
import com.utils.LibGlobal;

public class AdactinPagePojo extends LibGlobal {

	public AdactinPagePojo()
	{
		PageFactory.initElements(Hooks.driver, this);
	}
	@FindBy(id="username")
	private WebElement txtUserName;
	
	@FindBy(id="password")
	private WebElement txtPass;
	
	@FindBy(id="Login")
	private WebElement btnLogIn;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogIn() {
		return btnLogIn;
	}
	
}
