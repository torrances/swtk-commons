package org.swtk.common.dict.utils;

import org.swtk.common.dict.dto.wordnet.DataNounFrame;
import org.swtk.common.dict.dto.wordnet.DataNounFrames;
import org.swtk.common.dict.types.DataNounFrameType;

public final class DataNounFramesHelper {

	public static DataNounFrames filter(DataNounFrames dataNounFrames, DataNounFrameType frameType) {
		DataNounFrames filtered = new DataNounFrames();
		for (DataNounFrame frame : dataNounFrames)
			if (frame.getFrameType() == frameType) filtered.add(frame);

		return filtered;
	}
}
