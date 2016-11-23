package zhuanli.service.impl;

import zhuanli.dao.WeChatOrderDao;
import zhuanli.domain.WeChatOrder;
import zhuanli.service.WeChatOrderService;

public class WeChatOrderServiceImpl implements WeChatOrderService{
	private WeChatOrderDao weChatOrderDao;

	public WeChatOrderServiceImpl(WeChatOrderDao weChatOrderDao) {
		this.weChatOrderDao = weChatOrderDao;
	}

	@Override
	public void saveWeChatOrder(WeChatOrder weChatOrder) {
		saveWeChatOrder( weChatOrder);
	}
	
}
