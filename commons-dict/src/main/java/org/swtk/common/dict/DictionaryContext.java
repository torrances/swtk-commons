package org.swtk.common.dict;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.swtk.common.core.CommonsIocContainer;

import com.trimc.blogger.commons.LogManager;

public class DictionaryContext {

	private static DictionaryContext	instance;

	public static LogManager			logger	= new LogManager(DictionaryContext.class);

	public static DictionaryContext getInstance() {
		if (null == instance) instance = new DictionaryContext();
		return instance;
	}

	private ApplicationContext	context;

	private DictionaryContext() {}

	public void close() {
		((ConfigurableApplicationContext) getContext()).close();
		setContext(null);
	}

	private ApplicationContext getContext() {
		if (null == context) setContext(CommonsIocContainer.getContext());
		return context;
	}

	public Dictionary getDictionary(DictionaryName dictionary) {
		Dictionary dict = getContext().getBean(dictionary.toString(), Dictionary.class);
		return dict;
	}

	private void setContext(ApplicationContext context) {
		this.context = context;
	}
}
