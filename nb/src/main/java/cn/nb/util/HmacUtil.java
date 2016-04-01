package cn.nb.util;

/**
 * 	@author xuyao
 * */
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HmacUtil {

	private static Logger logger = LoggerFactory.getLogger(HmacUtil.class);
	
	public static String encrypt(String text,String key){
		if (StringUtils.isBlank(text) || StringUtils.isBlank(key)) {
			return "";
		}
		try {
			return encrypt(text.getBytes("UTF-8"), key);
		} catch (UnsupportedEncodingException e) {
			logger.error(e.getMessage(),e);
		}
		return "";
	}
	
	public static String encrypt(byte[] b,String key){
		if (StringUtils.isBlank(key) || b == null) {
			return "";
		}
        try {  
            Mac mac = Mac.getInstance("HmacMD5");
            SecretKeySpec spec = new SecretKeySpec(key.getBytes(), mac.getAlgorithm());  
            mac.init(spec);  
            byte[] byteHMAC = mac.doFinal(b); 
            return MD5Tool.toHexString(byteHMAC);
        } catch (InvalidKeyException e) {  
        	logger.error(e.getMessage(),e);
        } catch (NoSuchAlgorithmException e) {
        	logger.error(e.getMessage(),e);
        }  
        return "";
	}
}
