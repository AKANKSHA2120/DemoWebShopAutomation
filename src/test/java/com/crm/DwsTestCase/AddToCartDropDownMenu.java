package com.crm.DwsTestCase;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.BaseClassUtility.BaseClass;
import com.crm.PomFile.AddToCart;
@Listeners(com.crm.ListenersClass.ExtendReport.class)
public class AddToCartDropDownMenu extends BaseClass
{
    @Test
    public void dropDown()
    {
       //create object of add to cart
    	AddToCart a1 = new AddToCart(driver);
    	
    	//click on digital download
    	a1.clickDigital();
    	
    	//click on dropdown
    	a1.selectSort();
    	a1.selectDisplay();
    	a1.selectView();
    }
}
