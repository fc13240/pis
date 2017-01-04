package ideaStreet.service.impl;

import ideaStreet.dao.WeChatOrderDao;
import ideaStreet.domain.WeChatOrder;
import ideaStreet.service.WeChatOrderService;

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
