package cn.appsys.controller.develop;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import cn.appsys.pojo.DevUser;
import cn.appsys.service.developer.DevCodeService;
import cn.appsys.tools.Constants;

@Controller
@RequestMapping(value="/dev")
public class DevUserController {

	@Resource
	private DevCodeService service;
	private Logger logger=Logger.getLogger(DevUserController.class);
	
	@RequestMapping(value="/login")
	public String login(){
		logger.debug("jafkjdjjaksfdjsaklfj");
		return "devlogin";
	}
	
	@RequestMapping(value="/dologin")
	public String dologin(@RequestParam String devCode,
						@RequestParam String password,
						HttpSession session,HttpServletRequest request){
		logger.debug("dologin===================================");
		DevUser user=null;
		//调用service方法，进行用户匹配
		user=service.login(devCode, password);
		if (user!=null) {
			//登录成功放入session
			session.setAttribute(Constants.DEV_USER_SESSION,user);
			//跳转页面
			return "redirect:/dev/flatform/main";
		}else {
			//保留在登录页面
			request.setAttribute("error", "用户名或密码错误");
			return "devlogin";
		}
	}
	
	
	@RequestMapping(value="/flatform/main")
	public String main(HttpSession session){
		if(session.getAttribute(Constants.DEV_USER_SESSION) == null){
			return "redirect:/dev/login";
		}
		return "developer/main";
	}
	
	
	@RequestMapping(value="/logout")
	public String logout(HttpSession session){
		//清除session
		session.removeAttribute(Constants.DEV_USER_SESSION);
		return "devlogin";
	}
	
	
	
	
	
	
	
}
