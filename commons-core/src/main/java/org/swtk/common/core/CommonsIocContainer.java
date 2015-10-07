package org.swtk.common.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CommonsIocContainer {

	public static final String[]	CONTEXTS	= { "config/commons-dict-config.xml" };

	public static ApplicationContext getContext() {
		return new ClassPathXmlApplicationContext(CONTEXTS);
	}
}
