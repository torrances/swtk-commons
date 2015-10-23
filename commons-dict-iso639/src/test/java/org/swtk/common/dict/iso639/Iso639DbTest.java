package org.swtk.common.dict.iso639;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Collection;
import java.util.Map;

import org.junit.Test;
import org.swtk.common.dict.iso639.dmo.Iso639Db;

import com.trimc.blogger.commons.LogManager;

public final class Iso639DbTest {

	public static final String[] AMBIGUOUS_TERMS = { "and", "but", "eng", "for", "new", "see", "sig", "the", "vel", "to", "as", "mon" };

	public static LogManager logger = new LogManager(Iso639DbTest.class);

	@Test
	public void getLanguageNamesWithVariantsAsMap() throws Throwable {
		Map<String, Collection<String>> map = Iso639Db.getLanguageNamesWithVariantsAsMap();
		assertNotNull(map);
		assertTrue(map.size() > 1000);
	}

	@Test
	public void getLanguageNamesWithVariantsAsSet() throws Throwable {
		Collection<String> set = Iso639Db.getLanguageNamesWithVariantsAsSet();
		assertNotNull(set);
		assertTrue(set.size() > 1000);
	}

	@Test
	public void hasById() throws Throwable {
		assertTrue(Iso639Db.hasById("gem-pro"));
		assertTrue(Iso639Db.hasById("en"));
	}

	@Test
	public void hasByName() throws Throwable {
		assertTrue(Iso639Db.hasByName("old high german"));
	}

	@Test
	public void hasByNameAmbiguousWords() throws Throwable {
		for (String ambiguousTerm : AMBIGUOUS_TERMS) {
			boolean exists = Iso639Db.getLanguageNamesWithVariantsAsSet().contains(ambiguousTerm);
			if (exists) logger.info("Testing Ambiguous Term (term = %s, exists = %s)", ambiguousTerm, exists);
			assertFalse(exists);
		}
	}
}
