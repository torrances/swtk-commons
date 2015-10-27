package org.swtk.commons.dict.wordnet;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.Collection;

import org.junit.Test;
import org.swtk.common.dict.dto.wordnet.IndexNoun;
import org.swtk.commons.dict.wordnet.index.byid.controller.WordnetNounIndexIdController;

public final class WordnetNounIndexControllerTest {

	@Test
	public void test() throws Throwable {
		Collection<IndexNoun> results = WordnetNounIndexIdController.get("00007846");
		assertNotNull(results);
		assertFalse(results.isEmpty());
	}
}
