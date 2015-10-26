package org.swtk.commons.dict.wordnet;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.Collection;

import org.junit.Test;
import org.swtk.common.dict.dto.wordnet.IndexNoun;
import org.swtk.commons.dict.wordnet.byid.generated.p0.p0.WordnetNounIndexById0000;

public final class WordnetNounIndexById0000Test {

	@Test
	public void test() throws Throwable {
		Collection<IndexNoun> results = WordnetNounIndexById0000.get("00007846");
		assertNotNull(results);
		assertFalse(results.isEmpty());
	}
}
