package org.swtk.commons.dict.wiktionary.generated.c.s.i;

import java.util.HashMap;
import java.util.Map;
import org.swtk.common.dict.dto.wiktionary.Entry;
import com.trimc.blogger.commons.utils.GsonUtils;

public class WiktionaryCSI000 {
	private static Map<String, Entry> map = new HashMap<String, Entry>();

	static {
		add("csis",
				"{\"term\":\"csis\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Canadian Security and Intelligence Service\", \"priority\":1}]}, \"synonyms\":{}}");

	}

	private static void add(String term, String json) {
		map.put(term, GsonUtils.toObject(json, Entry.class));
	}

	public static Entry get(String term) {
		return map.get(term);
	}

	public static boolean has(String term) {
		return null != get(term);
	}
}