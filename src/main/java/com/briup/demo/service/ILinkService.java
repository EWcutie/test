package com.briup.demo.service;

import com.briup.demo.bean.Link;
import com.briup.demo.utils.CustomerException;

/**
 * 关于链接的相关操作
 * @author zcg
 */
public interface ILinkService {
	/**
	 * 保存链接信息
	 * @param link
	 */
	void saveLink(Link link) throws CustomerException;
}












