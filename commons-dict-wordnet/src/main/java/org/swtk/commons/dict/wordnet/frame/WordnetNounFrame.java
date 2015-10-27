package org.swtk.commons.dict.wordnet.frame;

import java.util.Map;
import java.util.TreeMap;

import org.swtk.common.dict.dto.wordnet.DataNoun;

import com.trimc.blogger.commons.utils.GsonUtils;

public final class WordnetNounFrame {

	private static Map<String, DataNoun> map = new TreeMap<String, DataNoun>();

	static {
		add("JSON");
	}

	private static void add(final String JSON) {
		DataNoun bean = GsonUtils.toObject(JSON, DataNoun.class);
		map.put(bean.getId(), bean);
	}

	public static DataNoun get(final String ID) {
		return map.get(ID);
	}

	public static boolean has(final String ID) {
		return map.containsKey(ID);
	}
}
