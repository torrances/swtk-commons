package org.swtk.commons.dict.wiktionary.generated.a.a.c;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.swtk.common.dict.dto.wiktionary.Entry;
import com.trimc.blogger.commons.utils.GsonUtils;

public class WiktionaryAAC000 {
	private static Map<String, Entry> map = new HashMap<String, Entry>();

	static {
		add("aacd",
				"{\"term\":\"aacd\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"lang\u003d en\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"lang\u003d en\", \"priority\":2}]}, \"synonyms\":{}}");

		add("aachen",
				"{\"term\":\"aachen\", \"etymology\":{\"influencers\":[], \"languages\":[\"German\", \"English\"], \"text\":\"From German \u0027aachen\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A city in North Rhine-Westphalia, Germany\", \"priority\":1}]}, \"synonyms\":{}}");

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