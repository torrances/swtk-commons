package org.swtk.commons.dict.wordnet.indexbyname;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Test;
import org.swtk.common.dict.dto.wordnet.IndexNoun;
import org.swtk.commons.dict.wordnet.indexbyname.controller.WordnetNounIndexNameController;

import com.trimc.blogger.commons.LogManager;
import com.trimc.blogger.commons.utils.Stopwatch;
import com.trimc.blogger.commons.utils.string.StringUtils;

public final class WordnetNounIndexNameControllerTest {

	public static LogManager logger = new LogManager(WordnetNounIndexNameControllerTest.class);

	@Test
	public void get() throws Throwable {
		get("cat");
		get("feline");
		get("placental mammal");
	}

	private void get(String term) throws Throwable {
		Stopwatch timer = new Stopwatch();
		Collection<IndexNoun> terms = WordnetNounIndexNameController.get(term);
		assertNotNull(terms);
		logger.info("Wordnet Terms (term = %s, total = %s, time = %s)", term, StringUtils.format(terms.size()), timer.getTotalTime());
	}

	@Test
	public void terms() throws Throwable {

		Stopwatch timer = new Stopwatch();

		Collection<String> terms = WordnetNounIndexNameController.terms();
		assertNotNull(terms);

		logger.info("Wordnet Terms (total = %s, time = %s)", StringUtils.format(terms.size()), timer.getTotalTime());
		assertTrue(terms.size() > 30000);
	}
}
