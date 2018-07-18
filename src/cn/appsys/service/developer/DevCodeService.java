package cn.appsys.service.developer;

import cn.appsys.pojo.DevUser;

public interface DevCodeService {
	/**
	 * µÇÂ¼ÑéÖ¤
	 * @param devCode
	 * @param password
	 * @return
	 */
	public DevUser login(String devCode,String password);

}
