package cn.appsys.service.developer;

import cn.appsys.pojo.DevUser;

public interface DevCodeService {
	/**
	 * ��¼��֤
	 * @param devCode
	 * @param password
	 * @return
	 */
	public DevUser login(String devCode,String password);

}
