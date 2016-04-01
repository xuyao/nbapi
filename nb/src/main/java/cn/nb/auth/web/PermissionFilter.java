package cn.nb.auth.web;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.nb.base.ApiCode;
import cn.nb.base.http.BaseResponse;
import cn.nb.base.http.HttpResponse;
import cn.nb.base.http.Status;
import cn.nb.util.JsonUtil;

/**
 * 接口访问权限限制
 * @author xuyao
 */
public class PermissionFilter implements Filter {
	
	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		ApiRequest apiRequest = new ApiRequest(req);
		if(apiRequest.validate()){//如果验证通过
			chain.doFilter(req, response);
		}else{
			BaseResponse br = new BaseResponse();
			br.setStatus(new Status(ApiCode.CODE_INVALID_SIGN, ApiCode.MSG_INVALID_SIGN));
			HttpResponse.responseContentTypeJson((HttpServletResponse)response, JsonUtil.getJsonString4JavaPOJO(br));
		}
		
	}

	
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}
	
}
