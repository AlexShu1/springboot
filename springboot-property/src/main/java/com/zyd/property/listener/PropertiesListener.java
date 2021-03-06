package com.zyd.property.listener;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

import com.zyd.property.config.PropertiesListenerConfig;

/**
 * 配置文件监听器，用来加载自定义配置文件
 * 
 * @author <a href="mailto:shuxianfon1987@126.com">xianfeng.shu</a>
 * @date 2017年6月1日 下午3:38:25 
 * @version V1.0
 * @since JDK ： 1.7
 */
public class PropertiesListener implements ApplicationListener<ApplicationStartedEvent> {
	
	private String propertyFileName;

	public PropertiesListener(String propertyFileName) {
		this.propertyFileName = propertyFileName;
	}

	@Override
	public void onApplicationEvent(ApplicationStartedEvent event) {
		PropertiesListenerConfig.loadAllProperties(propertyFileName);
	}
}
