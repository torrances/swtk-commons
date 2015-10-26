package org.swtk.commons.dict.wiktionary;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Test;
import org.swtk.common.framework.type.Alpha;

import com.trimc.blogger.commons.LogManager;
import com.trimc.blogger.commons.utils.string.StringUtils;

public final class WiktionaryTermsTest {

	public static LogManager logger = new LogManager(WiktionaryTermsTest.class);

	@Test
	public void test() throws Throwable {

		final int TOTAL_SIZE = WiktionaryTerms.terms().size();
		logger.info("Total Wiktionary Terms (total = %s)", StringUtils.format(TOTAL_SIZE));
		assertTrue(TOTAL_SIZE > 30000);

		for (Alpha alpha : Alpha.values()) {
			int alphaSize = WiktionaryTerms.terms(alpha).size();
			logger.info("Total Wiktionary Terms (by-alpha = %s, total = %s)", alpha, StringUtils.format(alphaSize));
			assertTrue(alphaSize > 50);
		}

		assertNotNull(WiktionaryTerms.termsByAlpha());
		for (Collection<String> list : WiktionaryTerms.termsByAlpha().values()) {
			logger.trace("Total Wiktionary Terms via Map (total = %s)", list.size());
			assertNotNull(list);
			assertFalse(list.isEmpty());
		}
	}
}
