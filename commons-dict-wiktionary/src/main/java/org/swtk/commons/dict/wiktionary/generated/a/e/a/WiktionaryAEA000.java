package org.swtk.commons.dict.wiktionary.generated.a.e.a;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.swtk.common.dict.dto.wiktionary.Entry;
import com.trimc.blogger.commons.utils.GsonUtils;

public class WiktionaryAEA000 {
	private static Map<String, Entry> map = new HashMap<String, Entry>();

	static {
		add("aeaea", "{\"term\":\"aeaea\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The mythical island said to be the home of Circe\", \"priority\":1}]}, \"synonyms\":{}}");

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

	public static Collection<String> terms() {
		return map.keySet();
	}
}