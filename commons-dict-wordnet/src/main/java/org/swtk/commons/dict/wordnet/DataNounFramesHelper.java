package org.swtk.commons.dict.wordnet;

import org.swtk.common.dict.dto.wordnet.DataNounFrame;
import org.swtk.common.dict.dto.wordnet.DataNounFrames;
import org.swtk.common.dict.types.DataNounFrameType;

public final class DataNounFramesHelper {

	public static DataNounFrames filter(DataNounFrames dataNounFrames, DataNounFrameType frameType) {
		DataNounFrames filtered = new DataNounFrames();
		for (DataNounFrame dataNounFrame : dataNounFrames)
			if (frameType == dataNounFrame.getFrameType()) filtered.add(dataNounFrame);

		return filtered;
	}
}
