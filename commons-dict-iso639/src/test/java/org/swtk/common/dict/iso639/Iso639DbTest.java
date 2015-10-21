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
	public static final String[] AMBIGUOUS_LANG_ID = { "and", "but", "eng", "for", "new", "see", "sig", "the", "vel" };

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
		/*for (String token : set)
			System.err.println(">" + token + "<");*/
	}

	@Test
	public void hasByIdAmbiguousWords() throws Throwable {
		for (String ambiguousTerm : AMBIGUOUS_LANG_ID) {
			boolean exists = Iso639Db.getLanguageNamesWithVariantsAsSet().contains(ambiguousTerm);
			if (exists) logger.info("Testing Ambiguous Term (term = %s, exists = %s)", ambiguousTerm, exists);
			assertFalse(exists);
		}
	}
}
