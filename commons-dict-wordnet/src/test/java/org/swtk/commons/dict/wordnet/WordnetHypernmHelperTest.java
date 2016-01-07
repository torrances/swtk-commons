package org.swtk.commons.dict.wordnet;

import org.junit.Test;

import com.trimc.blogger.commons.LogManager;

public final class WordnetHypernmHelperTest {
	
	public static LogManager logger = new LogManager(WordnetHypernmHelperTest.class);

	//@Test
	public void test1() throws Throwable {
		WordnetHypernmHelper.process("cat");
		WordnetHypernmHelper.process("feline");
		WordnetHypernmHelper.process("carnivore");
		WordnetHypernmHelper.process("placental mammal");
	}
	
	//@Test
	public void test2() throws Throwable {
		WordnetHypernmHelper.process("cat");
		WordnetHypernmHelper.process("dog");

		WordnetHypernmHelper.process("feline");
		WordnetHypernmHelper.process("canine");
	}
	
	@Test
	public void hypernymns() throws Throwable {
		
		// logger.info("Hypernyms (term = %s):\n%s", "cat", IndexNounAdapter.toString(WordnetHypernmHelper.getHypernyms("cat")));
	}
}
