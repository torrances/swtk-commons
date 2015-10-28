package org.swtk.commons.dict.wordnet;

import org.junit.Test;

public final class WordnetHypernmHelperTest {

	// @Test
	public void test() throws Throwable {
		WordnetHypernmHelper.process("cat");
		WordnetHypernmHelper.process("feline");
		WordnetHypernmHelper.process("carnivore");
		WordnetHypernmHelper.process("placental mammal");
	}
}
