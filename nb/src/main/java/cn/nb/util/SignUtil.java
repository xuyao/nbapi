package cn.nb.util;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 	验证request请求
 * 	@author xuyao
 * */
public class SignUtil {

	private static Logger logger = LoggerFactory.getLogger(SignUtil.class);
	
	public static final String key = "rZxlsZy202";
	public static final String SIGN = "sign";
	
	/**
	 * 生成签名
	 * @param noSign
	 * @param signMethod
	 * @return
	 */
	public static String getSigned(Map<String, String> params){
		String noSign = getOrderParams(params);
		noSign = key + noSign + key + key;
		String signed = MD5Tool.encoding(noSign);
		logger.debug("getSigned:" + signed);
		return signed;
	}


	//***********************************升序
	public static String getOrderParams(Map<String, String> params){
		StringBuffer sb = new StringBuffer();
		if (params != null && params.size()>0) {
			Set<String> ps = new TreeSet<String>(params.keySet());
			for (String name : ps) {
				if (!SIGN.equals(name)) {
					sb.append(name).append(params.get(name));
				}				
			}
		}
		logger.debug("getOrderParams:" + sb);
		return sb.toString();
	}


	/**
	 * 	
	 * */
	public static void main(String[] args){
		Map<String, String> params = new HashMap();
//		params.put("back", "n");
//		params.put("historyTime", "1995-01");
		params.put("content_id", "220");
		params.put("timestamp", String.valueOf(new Date().getTime()));
		params.put("rd", "123456");
		System.out.println(String.valueOf(new Date().getTime()));
		System.out.println(getSigned(params));
	}
}
