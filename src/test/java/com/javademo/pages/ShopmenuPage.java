package com.javademo.pages;

import macaca.java.biz.BasePage;
import com.javademo.pageuis.ShopmenuPageUI;

public class ShopmenuPage extends BasePage{

	public ShopmenuPage(String pageDesc) {
		super(pageDesc);
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * 进入收藏二级页
	 */
	public void goToSearchList(){
		driver.onclickBean(ShopmenuPageUI.SEARCH_BTN);
	}

}
