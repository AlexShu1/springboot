package com.zyd.exception.exception;

/**
 * 模拟400错误处理异常类
 * 
 * @author <a href="mailto:shuxianfon1987@126.com">xianfeng.shu</a>
 * @date 2017年6月8日 上午9:27:29 
 * @version V1.0
 * @since JDK ： 1.7
 */
public class BadRequestException extends Exception {
	  	
	private static final long serialVersionUID = -6091047030159094706L;

	public BadRequestException() {
		super();
	}

	public BadRequestException(String message) {
		super(message);
	}

}
