package ideaStreet.dao.mybatis;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import ideaStreet.dao.WeChatOrderDao;
import ideaStreet.dao.mapper.WeChatOrderMapper;
import ideaStreet.domain.WeChatOrder;

public class WeChatOrderMybatisDao  extends SqlSessionDaoSupport implements WeChatOrderDao{
	private WeChatOrderMapper weChatOrderMapper;

	public WeChatOrderMapper getWeChatOrderMapper() {
		return weChatOrderMapper;
	}

	public void setWeChatOrderMapper(WeChatOrderMapper weChatOrderMapper) {
		this.weChatOrderMapper = weChatOrderMapper;
	}

	@Override
	public void saveWeChatOrder(WeChatOrder weChatOrder) {
		saveWeChatOrder(weChatOrder);
	}

	
	
}
