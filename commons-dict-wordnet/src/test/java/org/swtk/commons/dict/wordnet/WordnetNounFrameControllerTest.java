package org.swtk.commons.dict.wordnet;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.swtk.common.dict.dto.wordnet.DataNoun;
import org.swtk.common.dict.dto.wordnet.DataNounFrame;
import org.swtk.common.dict.dto.wordnet.IndexNoun;
import org.swtk.common.dict.types.DataNounFrameType;
import org.swtk.common.dict.utils.DataNounFramesHelper;
import org.swtk.commons.dict.wordnet.frame.controller.WordnetNounFrameController;
import org.swtk.commons.dict.wordnet.index.controller.WordnetNounIndexController;

public final class WordnetNounFrameControllerTest {

	@Test
	public void test() throws Throwable {
		DataNoun bean = WordnetNounFrameController.get("00007846");
		System.err.println(bean.getTerm());
		assertNotNull(bean);
		for (DataNounFrame frame : DataNounFramesHelper.filter(bean.getDataNounFrames(), DataNounFrameType.HYPERNYM)) {
			System.err.println("\t" + frame.getId());
			for (IndexNoun indexNoun : WordnetNounIndexController.get(frame.getId())) {
				System.err.println("\t\t" + indexNoun.getTerm());
			}
		}
	}
}
