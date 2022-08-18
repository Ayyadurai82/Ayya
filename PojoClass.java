package org.po;

import org.ba.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends BaseClass {
	
	private void tc10() {
		PageFactory.initElements(driver, this);
	}
		@FindBy(id="email")
		private WebElement user;
		
		
		@FindBys({
			
			@FindBy(name="pass"),
			@FindBy(id="pass")
		})
		private WebElement password;
		
           @FindAll({
        	   @FindBy(name="login"),
        	  @FindBy(xpath="//button[@type='submit']")
        	   
           })
        	   
          private WebElement login;

		public WebElement getUser() {
			return user;
		}

		public WebElement getPassword() {
			return password;
		}

		public WebElement getLogin() {
			return login;
		}
		
		



}






