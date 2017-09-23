package com.javademo.pageuis;

import macaca.java.biz.BasePageUI;
import macaca.java.biz.CommonUIBean;

import macaca.client.common.GetElementWay;

public class PersonalPageUI extends BasePageUI{

	public static final CommonUIBean LOG_OUT_BTN = new CommonUIBean(GetElementWay.NAME, "Logout", "logout按钮");
	public static final CommonUIBean FAVORITE_SHOP_TEXT = new CommonUIBean(GetElementWay.NAME, "收藏店铺", "收藏店铺Text");
}
