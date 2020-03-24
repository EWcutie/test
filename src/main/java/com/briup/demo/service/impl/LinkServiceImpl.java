package com.briup.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.demo.bean.Link;
import com.briup.demo.mapper.LinkMapper;
import com.briup.demo.service.ILinkService;
import com.briup.demo.utils.CustomerException;
import com.briup.demo.utils.StatusCodeUtil;
/**
 * 操作链接的service功能类
 * @author zcg
 *
 */
@Service
public class LinkServiceImpl implements ILinkService {
	@Autowired
	private LinkMapper linkMapper;
	
	@Override
	public void saveLink(Link link) throws CustomerException {
		//参数为引用类型，要做判空处理
		if(link == null) {
			throw new CustomerException(StatusCodeUtil.ERROR_CODE, "参数为空！");
		}
		linkMapper.insert(link);
	}

}







