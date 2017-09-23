package com.javademo.pageuis;

import macaca.java.biz.BasePageUI;
import macaca.java.biz.CommonUIBean;

import macaca.client.common.GetElementWay;

public class SearchPageUI extends BasePageUI{

	public static final CommonUIBean SEARCH_FIELD = new CommonUIBean(GetElementWay.CLASS_NAME, "android.widget.EditText",GetElementWay.NAME,"搜索小度掌柜测试店B的商品", "搜索框");
	public static final CommonUIBean SEARCH_BTN = new CommonUIBean(GetElementWay.ID, "com.baidu.lbs.waimai:id/waimai_shoplist_actionbar_search",GetElementWay.NAME,"搜索", "搜索按钮");
	public static final CommonUIBean ADD_NORAML_GOODS_BTN = new CommonUIBean(GetElementWay.CLASS_NAME,"XCUIElementTypeButton",GetElementWay.NAME,"shopmenu add nomal","添加普通商品");
	public static final CommonUIBean CHOOSE_FINISH_BTN = new CommonUIBean(GetElementWay.CLASS_NAME,"XCUIElementTypeButton",GetElementWay.NAME,"选好了","添加普通商品");

}