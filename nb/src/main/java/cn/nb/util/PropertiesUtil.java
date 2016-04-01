package cn.nb.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 	配置文件读取类
 *  @author xuyao
 * */
public class PropertiesUtil {

	private static Properties p = new Properties();

	private static Logger logger=LoggerFactory.getLogger(PropertiesUtil.class);
	
	static{
		try {
			InputStream in = PropertiesUtil.class.getResourceAsStream("/app.properties");
			p.load(in);
		} catch (IOException e) {
			logger.error("load app.properties error", e);			
		}
	}

	public static Object get(String key) {
		return p.get(key);
	}
}
