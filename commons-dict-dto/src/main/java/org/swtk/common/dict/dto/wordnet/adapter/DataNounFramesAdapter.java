package org.swtk.common.dict.dto.wordnet.adapter;

import java.util.Iterator;

import org.swtk.common.dict.dto.wordnet.DataNounFrame;
import org.swtk.common.dict.dto.wordnet.DataNounFrames;

import com.trimc.blogger.commons.exception.AdapterValidationException;

public final class DataNounFramesAdapter {

	public static String toString(DataNounFrames bean) {
		StringBuilder sb = new StringBuilder();

		Iterator<DataNounFrame> iter = bean.getList().iterator();
		while (iter.hasNext()) {
			sb.append("\n\t");
			sb.append(iter.next().toString());
		}

		return sb.toString();
	}

	public static DataNounFrames transform(DataNounFrame... frames) throws AdapterValidationException {
		DataNounFrames bean = new DataNounFrames();

		bean.add(frames);

		return bean;
	}
}
