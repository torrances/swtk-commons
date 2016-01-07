package org.swtk.commons.dict.stopwords;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.swtk.common.framework.type.LanguageTag;

public final class StopwordsDbTest {

	@Test
	public void isStopwordEn() throws Throwable {
		
		assertFalse(isStopword("the", LanguageTag.SPANISH));
		
		assertTrue(isStopword("the", LanguageTag.ENGLISH));
		assertFalse(isStopword("quick", LanguageTag.ENGLISH));
		assertFalse(isStopword("brown", LanguageTag.ENGLISH));
		assertFalse(isStopword("fox", LanguageTag.ENGLISH));
		assertFalse(isStopword("jumped", LanguageTag.ENGLISH));
		assertTrue(isStopword("over", LanguageTag.ENGLISH));
		assertTrue(isStopword("the", LanguageTag.ENGLISH));
		assertFalse(isStopword("lazy", LanguageTag.ENGLISH));
		assertFalse(isStopword("dog", LanguageTag.ENGLISH));
		assertFalse(isStopword("!", LanguageTag.ENGLISH));
	}

	@Test
	public void isStopwordEs() throws Throwable {
		
		assertFalse(isStopword("yo", LanguageTag.ENGLISH));

		assertTrue(isStopword("yo", LanguageTag.SPANISH));
		assertFalse(isStopword("hablo", LanguageTag.SPANISH));
		assertFalse(isStopword("espanol", LanguageTag.SPANISH));
		assertFalse(isStopword("!", LanguageTag.SPANISH));
	}

	private boolean isStopword(String token, LanguageTag languageTag) throws Throwable {
		return StopwordsDb.isStopword(token, languageTag);
	}
}
