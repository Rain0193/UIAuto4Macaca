package com.javademo.pageuis;

import macaca.java.biz.BasePageUI;
import macaca.java.biz.CommonUIBean;

import macaca.client.common.GetElementWay;

public class WMHomePageUI extends BasePageUI{

	public static final CommonUIBean HOME_TAB = new CommonUIBean(GetElementWay.NAME, "首页", "HOME TAB");
	public static final CommonUIBean ZHINAN_TAB = new CommonUIBean(GetElementWay.NAME, "指南", "ZHINAN TAB");
	public static final CommonUIBean ORDER_TAB = new CommonUIBean(GetElementWay.NAME, "订单", "ORDER TAB");
	public static final CommonUIBean PERSONAL_TAB = new CommonUIBean(GetElementWay.NAME, "我的", "PERSONAL TAB");
	public static final CommonUIBean CANYIN_BTN = new CommonUIBean(GetElementWay.NAME, "餐饮", "首页餐饮金刚icon");

}
