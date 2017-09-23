package com.javademo.pages;

import macaca.java.biz.BasePage;
import com.javademo.pageuis.WMHomePageUI;

public class WMHomePage extends BasePage{

	public WMHomePage(String pageDesc) {
		super(pageDesc);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 点击home tab
	 */
	public void tabHome() {
		driver.onclickBean(WMHomePageUI.HOME_TAB);
	}
	/**
	 * 点击指南 tab
	 */
	public void tabWebView(){
		driver.onclickBean(WMHomePageUI.ZHINAN_TAB);
	}

	/**
	 * 点击订单tab
	 */
	public void tabBaiDu(){
		driver.onclickBean(WMHomePageUI.ORDER_TAB);
	}

	/**
	 * 点击Personal tab
	 */
	public void tabPersonal() {
		driver.onclickBean(WMHomePageUI.PERSONAL_TAB);
	}

	/**
	 * 进入餐饮二级页
	 */
	public void goToList(){
		driver.onclickBean(WMHomePageUI.CANYIN_BTN);
	}
}
