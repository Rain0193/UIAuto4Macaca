package com.javademo.pageuis;

import macaca.java.biz.BasePageUI;
import macaca.java.biz.CommonUIBean;

import macaca.client.common.GetElementWay;

public class HomeListPageUI extends BasePageUI{

	public static final CommonUIBean LIST_VIEW = new CommonUIBean(GetElementWay.ID, "candroid:id/list",GetElementWay.CLASS_NAME,"XCUIElementTypeTable", "list view");
	public static final CommonUIBean CELL = new CommonUIBean(GetElementWay.ID,"com.baidu.lbs.waimai:id/waimai_shoplist_adapter_item_shop_name",GetElementWay.NAME, "小度掌柜测试店B","Shop Cell");
}
