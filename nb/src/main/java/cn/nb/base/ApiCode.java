package cn.nb.base;

/**
 * 	code 常量类
 *  @author xuyao	
 * */
public class ApiCode {

	public static final int CODE_SUCCESS = 0;//成功请求
	public static final String MSG_SUCCESS = "success";
	
	public static final int CODE_ERROR = 10;//系统调用失败
	public static final String MSG_ERROR = "error";
	
	public static final int CODE_INVALID_SIGN = 11;//无效签名
	public static final String MSG_INVALID_SIGN = "invalid sign";//无效签名
	
	public static final int CODE_INVALID_TIMESTAMP = 12;//无效时间戳异常
	public static final String MSG_INVALID_TIMESTAMP = "invalid_timestamp";
	
	public static final int CODE_MISSING_USERID = 1000;//缺少用户id
	public static final String MSG_MISSING_USERID = "missing_userid";
	
	public static final int CODE_MISSING_PHONENUM = 1001;//缺少手机号码
	public static final String MSG_MISSING_PHONENUM = "missing_phonenum";
	
	public static final int CODE_MISSING_VALIDCODE = 1002;//缺少验证码
	public static final String MSG_MISSING_VALIDCODE = "missing_validcode";
	
	public static final int CODE_VALIDCODE_ERROR = 1003;//验证码错误
	public static final String MSG_VALIDCODE_ERROR = "invalid validcode";
	
	public static final int CODE_EXIST_USER = 1004;//用户已经存在
	public static final String MSG_EXIST_USER = "user exist";
	
	public static final int CODE_MISSING_USERNAME = 1005;//缺少用户名
	public static final String MSG_MISSING_USERNAME = "missing_username";
	
	public static final int CODE_MISSING_PHOTOURL = 1006;//缺少photo url
	public static final String MSG_MISSING_PHOTOURL = "missing_photourl";
	
	public static final int CODE_MISSING_PASSWORD = 1007;//缺少密码
	public static final String MSG_MISSING_PASSWORD = "missing_password";
	
	public static final int CODE_MISSING_USERTYPE = 1008;//缺少用户类型
	public static final String MSG_MISSING_USERTYPE = "missing_usertype";
	
	public static final int CODE_MISSING_NICNAME = 1009;//缺少用户昵称
	public static final String MSG_MISSING_NICNAME = "missing_nicname";
	
	public static final int CODE_USER_NOTEXIST = 1010;//用户不存在，没有注册
	public static final String MSG_USER_NOTEXIST = "user not exist";
	
	public static final int CODE_FAVORITE_EXIST = 1014;//收藏已经存在
	public static final String MSG_FAVORITE_EXIST = "favorite exist";
	
	public static final int CODE_MISSING_FAVVERTION = 1015;//缺少版本号
	public static final String MSG_MISSING_FAVVERTION = "missing fav_version";//缺少版本号
	
	public static final int CODE_MISSING_FAVCONTENT = 1016;//缺少收藏夹内容id
	public static final String MSG_MISSING_FAVCONTENT = "missing favorite contentid";
	
	public static final int CODE_MISSING_FAVCONTENT_TYPE = 1017;//缺少收藏夹操作类型
	public static final String MSG_MISSING_FAVCONTENT_TYPE = "missing favorite type";
	
	public static final int CODE_MISSING_FDBCONTENT = 1020;//缺少反馈内容
	public static final String MSG_MISSING_FDBCONTENT = "missing feedback content";
	
	public static final int CODE_ERROR_PHONENUM = 1021;//手机号码错误
	public static final String MSG_ERROR_PHONENUM = "error_phonenum";
	
	public static final int CODE_ERRORlEN_PASSWORD = 1022;//密码长度不正确
	public static final String MSG_ERRORlEN_PASSWORD = "error_length_password";
	
	public static final int CODE_ERRORPATTEN_PASSWORD = 1023;//密码格式错误
	public static final String MSG_ERRORPATTEN_PASSWORD = "error_patten_password";
	
	public static final int CODE_LENGTH_NICNAME = 1024;//用户昵称长度不正确
	public static final String MSG_LENGTH_NICNAME = "error_length_nicname";
	
	public static final int CODE_ERROR_NICNAME = 1025;//用户昵称长度不正确
	public static final String MSG_ERROR_NICNAME = "error_nicname";
	
	public static final int CODE_MISSING_CONTENTID = 1026;//缺少文章id
	public static final String MSG_MISSING_CONTENTID = "missing_contentid";
	
	public static final int CODE_HEAD_PICTURE_NOT_EXISTS = 1027;//用户头像不存在
	public static final String MSG_HEAD_PICTURE_NOT_EXISTS = "head picture is not exists";
	
	public static final int CODE_USER_NULL = 2001;
	public static final String MSG_USER_NULL = "no records";
	

}
