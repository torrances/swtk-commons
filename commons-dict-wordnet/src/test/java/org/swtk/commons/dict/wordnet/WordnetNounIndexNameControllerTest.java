package org.swtk.commons.dict.wordnet;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Test;
import org.swtk.commons.dict.wordnet.index.name.controller.WordnetNounIndexNameController;

import com.trimc.blogger.commons.LogManager;
import com.trimc.blogger.commons.utils.Stopwatch;
import com.trimc.blogger.commons.utils.string.StringUtils;

public final class WordnetNounIndexNameControllerTest {

	public static LogManager logger = new LogManager(WordnetNounIndexNameControllerTest.class);

	@Test
	public void run() throws Throwable {

		Stopwatch timer = new Stopwatch();

		Collection<String> terms = WordnetNounIndexNameController.terms();
		assertNotNull(terms);

		logger.info("Wordnet Terms (total = %s, time = %s)", StringUtils.format(terms.size()), timer.getTotalTime());
		assertTrue(terms.size() > 30000);
	}
}
