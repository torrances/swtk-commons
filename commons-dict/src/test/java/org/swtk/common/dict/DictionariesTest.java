package org.swtk.common.dict;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.swtk.common.core.CommonsIocContainer;

public class DictionariesTest {

	@Test
	public void container() throws Throwable {
		read("adjectivesDictionary");
		read("measurementWordsDictionary");
		read("nounPhrasesDictionary");
		read("stopWordsDictionary");
		read("languagesDictionary");
	}

	@Test
	public void factory() throws Throwable {
		DictionaryContext.getInstance().getDictionary(DictionaryName.ADJECTIVES);
		DictionaryContext.getInstance().getDictionary(DictionaryName.MEASUREMENT_WORDS);
		DictionaryContext.getInstance().getDictionary(DictionaryName.NOUN_PHRASES);
		DictionaryContext.getInstance().getDictionary(DictionaryName.STOP_WORDS);
	}

	private void read(String beanName) throws Throwable {
		ApplicationContext context = CommonsIocContainer.getContext();
		test(context.getBean(beanName, Dictionary.class).entries());
	}

	private void test(Set<String> entries) {
		assertNotNull(entries);
		assertFalse(entries.isEmpty());
		assertTrue(entries.size() > 10);
	}
}
