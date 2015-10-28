package org.swtk.commons.dict.wordnet;

import java.util.Collection;

import org.swtk.common.dict.dto.wordnet.DataNoun;
import org.swtk.common.dict.dto.wordnet.DataNounFrame;
import org.swtk.common.dict.dto.wordnet.DataNounFrames;
import org.swtk.common.dict.dto.wordnet.IndexNoun;
import org.swtk.common.dict.types.DataNounFrameType;
import org.swtk.commons.dict.wordnet.frames.controller.WordnetNounFrameController;
import org.swtk.commons.dict.wordnet.indexbyid.controller.WordnetNounIndexIdController;
import org.swtk.commons.dict.wordnet.indexbyname.controller.WordnetNounIndexNameController;

import com.trimc.blogger.commons.LogManager;
import com.trimc.blogger.commons.exception.BusinessException;
import com.trimc.blogger.commons.utils.string.StringUtils;

public final class WordnetHypernmHelper {

	public static LogManager logger = new LogManager(WordnetHypernmHelper.class);

	public static void process(String term) throws BusinessException {

		Collection<IndexNoun> results = WordnetNounIndexNameController.get(term);
		logger.info("Index Noun results found (term = %s, total = %s)", term, StringUtils.format(results.size()));

		for (IndexNoun result : results) {
			logger.info("\tIndex Noun Analysis (pos = %s, total-ids = %s)", result.getUpperType(), StringUtils.format(result.getIds().size()));

			for (String id : result.getIds()) {
				DataNoun dataNoun = WordnetNounFrameController.get(id);

				DataNounFrames hypernymFrames = DataNounFramesHelper.filter(dataNoun.getDataNounFrames(), DataNounFrameType.HYPERNYM);
				logger.info("\t\tLocated Hypernym Frames (total = %s)", StringUtils.format(hypernymFrames.size()));

				for (DataNounFrame dataNounFrame : DataNounFramesHelper.filter(dataNoun.getDataNounFrames(), DataNounFrameType.HYPERNYM)) {
					logger.info("\t\t\tLocated Hypernym (name = %s)", dataNounFrame.getId());

					Collection<IndexNoun> hypernymIndexNouns = WordnetNounIndexIdController.get(dataNounFrame.getId());
					logger.info("\t\t\t\tLocated Hypernym Index Nouns (total = %s)", hypernymIndexNouns.size());

					for (IndexNoun hypernymIndexNoun : hypernymIndexNouns) {
						logger.info("\t\t\t\t\tHypernym Index Noun (term = %s)", hypernymIndexNoun.getTerm());
					}
				}
			}
		}
	}
}
