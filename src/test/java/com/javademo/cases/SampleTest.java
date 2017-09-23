package com.javademo.cases;

import com.alibaba.fastjson.JSONObject;
import macaca.client.commands.Element;
import macaca.client.common.GetElementWay;
import org.junit.Test;

import macaca.java.biz.ResultGenerator;
import com.javademo.pages.SearchPage;
import com.javademo.pages.ShopmenuPage;
import com.javademo.pages.HomeListPage;
import com.javademo.pages.WMHomePage;
import com.javademo.pages.PersonalPage;
import com.javademo.pages.WebviewPage;
import com.javademo.pageuis.SearchPageUI;
import com.javademo.pageuis.ShopmenuPageUI;
import com.javademo.pageuis.HomeListPageUI;
import com.javademo.pageuis.WMHomePageUI;
import com.javademo.pageuis.PersonalPageUI;
import com.javademo.pageuis.WebviewPageUI;

public class SampleTest extends BaseTest{

	@Test
	public void test () throws Exception {

		// 测试首页
		WMHomePage wmhomePage = new WMHomePage("首页");
		wmhomePage.setDriver(driver);
//		if (wmhomePage.hasPageShown(WMHomePageUI.HOME_TAB)) {
//			saveScreen(wmhomePage.pageDesc);
//			ResultGenerator.loadPageSucc(wmhomePage);
//			// 进入list
//			wmhomePage.goToList();
//		} else {
//			// 首页没有加载成功，后面的用例都不用执行了，return
//			ResultGenerator.loadPageFail(wmhomePage);
//			return;
//		}
//
//        driver.sleep(1000);
		

		
		// 测试Personal
		wmhomePage.tabPersonal();
		PersonalPage personalPage = new PersonalPage("个人中心");
		personalPage.setDriver(driver);
		if (personalPage.hasPageShown(PersonalPageUI.FAVORITE_SHOP_TEXT)) {
			saveScreen(personalPage.pageDesc);
			ResultGenerator.loadPageSucc(personalPage);

			// logout
//			personalPage.logout();
			personalPage.goToFavoriteList();

		} else {
			ResultGenerator.loadPageFail(personalPage);
		}
		
		
		
		// 收藏List页
		HomeListPage homeListPage = new HomeListPage("收藏列表页");
		homeListPage.setDriver(driver);
		if (homeListPage.hasPageShown(HomeListPageUI.LIST_VIEW)) {

			saveScreen(homeListPage.pageDesc);
			ResultGenerator.loadPageSucc(homeListPage);

			// 滑动
//			homeListPage.scroll();

			// 点击第一个cell
//			homeListPage.onclickOneCell(0);
			homeListPage.goToShopmenu();
			
		}
		
		
		//Shopmenu页
		ShopmenuPage shopmenuPage = new ShopmenuPage("商户点菜页");
		shopmenuPage.setDriver(driver);
		if(shopmenuPage.hasPageShown(ShopmenuPageUI.SEARCH_BTN)) {
			saveScreen(shopmenuPage.pageDesc);
			ResultGenerator.loadPageSucc(shopmenuPage);

			shopmenuPage.goToSearchList();


		} else {
			ResultGenerator.loadPageFail(shopmenuPage);
		}

		//单点搜索
		SearchPage searchPage = new SearchPage("商户搜索页");
		searchPage.setDriver(driver);
		if(searchPage.hasPageShown(SearchPageUI.SEARCH_FIELD)) {
			saveScreen(searchPage.pageDesc);
			ResultGenerator.loadPageSucc(searchPage);
			
			// 搜索
			searchPage.search("菜");
			searchPage.addNoramlGoodsToShopCart();
			searchPage.gotoConfirmOrder();
		}

		driver.sleep(2000);
		
		

	}
}
