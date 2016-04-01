package cn.nb.auth.web;

import javax.servlet.http.HttpServletRequest;

/**
 * 处理API请求类
 * @author xuyao
 *
 */
public class ApiRequest {

	private ApiRequestValidator validator;	
	
	public ApiRequest(HttpServletRequest request){
		this.validator = new ApiRequestValidator(request);		
	}

	public boolean validate(){
		if(getValidator().validateTimestamp()){//验证时间戳
			return true;
		}
		if(getValidator().validateSign()){//验证签名
			return true;
		}
		
		return false;
	}	

	public ApiRequestValidator getValidator() {
		return validator;
	}
	
}
