package cn.appsys.dao.devuser;

import org.apache.ibatis.annotations.Param;

import cn.appsys.pojo.DevUser;

public interface DevUserMapper {
	/**
	 * ����DevCode��ȡ�û���¼
	 * @param devCode
	 * @return
	 */
	public DevUser getLoginUser(@Param("devCode")String devCode);

}
