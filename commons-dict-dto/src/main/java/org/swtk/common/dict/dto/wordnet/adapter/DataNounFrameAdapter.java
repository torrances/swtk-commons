package org.swtk.common.dict.dto.wordnet.adapter;

import org.swtk.common.dict.dto.wordnet.DataNounFrame;
import org.swtk.common.dict.types.DataNounFrameType;
import org.swtk.common.dict.utils.WordnetAdapterUtils;

import com.trimc.blogger.commons.exception.AdapterValidationException;

public final class DataNounFrameAdapter {

	public static String toString(DataNounFrame bean) {
		StringBuilder sb = new StringBuilder();

		sb.append("id = " + bean.getId());
		sb.append(", rel-type = " + bean.getRelType());
		sb.append(", pos = " + bean.getUpperType());
		sb.append(", sem-pointer = " + bean.getSemPointer());

		return sb.toString();
	}

	public static DataNounFrame transform(String relType, String id, String pos, String semPointer) throws AdapterValidationException {
		DataNounFrame bean = new DataNounFrame();

		bean.setRelType(transformRelType(relType));
		bean.setId(transformId(id));
		bean.setUpperType(WordnetAdapterUtils.transformPos(pos));
		bean.setSemPointer(transformSemPointer(semPointer));

		return bean;
	}

	private static String transformId(String id) throws AdapterValidationException {
		return id;
	}

	private static DataNounFrameType transformRelType(String relType) throws AdapterValidationException {
		DataNounFrameType type = DataNounFrameType.find(relType);
		if (null == type) throw new AdapterValidationException("Unrecognized WN Relationship Type");
		return type;
	}

	private static String transformSemPointer(String text) throws AdapterValidationException {
		return text;
	}
}
