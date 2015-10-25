package org.swtk.commons.dict.wiktionary;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public final class WiktionaryDbTest {

	@Test
	public void findByNameWalrus() throws Throwable {
		assertEquals("walrus", WiktionaryDb.findByName("walrus").getTerm());
		assertEquals("A large Arctic marine mammal related to seals and having long tusks, tough, wrinkled skin, and four flippers", WiktionaryDbUtils.firstDefinition("walrus").getText());
	}

	@Test
	public void findByNameApple() throws Throwable {
		assertEquals("apple", WiktionaryDb.findByName("apple").getTerm());
		assertEquals("A nickname for New York City, usually “the Big Apple”", WiktionaryDbUtils.firstDefinition("apple").getText());
	}
}
