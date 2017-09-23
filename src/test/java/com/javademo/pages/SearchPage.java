package com.javademo.pages;

import macaca.java.biz.BasePage;
import com.javademo.pageuis.SearchPageUI;

public class SearchPage extends BasePage{

	public SearchPage(String pageDesc) {
		super(pageDesc);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 按照关键字搜索
	 * @param keywords 关键字
	 */
	public void search(String keywords){

		driver.inputBean(SearchPageUI.SEARCH_FIELD, keywords);
		driver.onclickBean(SearchPageUI.SEARCH_BTN);
	}
	
	/**
	 * 添加普通商品
	 */
	public void addNoramlGoodsToShopCart() {
		driver.onclickBean(SearchPageUI.ADD_NORAML_GOODS_BTN);
	}

	/**
	 * 点击“选好了”
	 */
	public void gotoConfirmOrder() {
		driver.onclickBean(SearchPageUI.CHOOSE_FINISH_BTN);
	}

}
