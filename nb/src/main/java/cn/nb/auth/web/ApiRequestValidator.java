package cn.nb.auth.web;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import cn.nb.util.PropertiesUtil;
import cn.nb.util.SignUtil;

/**
 * API请求核心验证类
 * @author xuyao
 *
 */
public class ApiRequestValidator {	
	
	private static final String dateFormat = "yyyy-MM-dd HH:mm:ss";
	
	private Logger logger = LoggerFactory.getLogger(ApiRequestValidator.class);
	
	private HttpServletRequest request;
	
	public ApiRequestValidator(HttpServletRequest request){
		this.request = request;		
	}		
	
	
	/**
	 * 时间戳检查
	 */
	public boolean validateTimestamp(){
		boolean result = true;
		SimpleDateFormat simpleDateFormat = getSimpleDateFormat();
		String reqTime = getTimestamp();
		if(StringUtils.isEmpty(reqTime)){
			return false;
		}
		Long reqTimeInt = Long.parseLong(reqTime);
		Calendar now = Calendar.getInstance(TimeZone.getTimeZone("GMT"));//取GMT时间
		if (reqTimeInt<now.getTime().getTime() - getTime_out() || reqTimeInt>now.getTime().getTime() + getTime_out()) {
			result = false;
		}
		return result;
	}
	
	
	/**
	 * 签名验证
	 */
	public boolean validateSign(){
		Map<String, String> params = new HashMap<String, String>();
		Enumeration<String> enumeration = getRequest().getParameterNames();
		while (enumeration.hasMoreElements()) {
			String s = (String) enumeration.nextElement();
			if(!SignUtil.SIGN.equals(s)){
				params.put(s, getRequest().getParameter(s));
			}			
		}	
		
		String signed = SignUtil.getSigned(params);
		String paramSign = request.getParameter(SignUtil.SIGN);
		if(StringUtils.isEmpty(paramSign) || StringUtils.isEmpty(signed)){
			return false;
		}
		if (!paramSign.equals(signed)) {
			logger.error("client sign:" + paramSign);
			logger.error("server sign:" + signed);
			return false;
		}
		return true;
	}
	
	
	public HttpServletRequest getRequest() {
		return request;
	}	
	
	
	public String getTimestamp(){
		return getRequest().getParameter("timestamp");
	}
	
	
	private static SimpleDateFormat getSimpleDateFormat(){
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
		simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+8"));
		return simpleDateFormat;
	}
	
	//超时返回
	public static long getTime_out(){
		return Long.parseLong(PropertiesUtil.get("timeout_error").toString());
	}
	
}
