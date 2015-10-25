package org.swtk.commons.dict.wiktionary.generated.b.j.a;

import java.util.HashMap;
import java.util.Map;
import org.swtk.common.dict.dto.wiktionary.Entry;
import com.trimc.blogger.commons.utils.GsonUtils;

public class WiktionaryBJA000 {
	private static Map<String, Entry> map = new HashMap<String, Entry>();

	static {
		add("bjarmian",
				"{\"term\":\"bjarmian\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Bjarmia|an|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A native or inhabitant of Bjarmia or Bjarmaland\", \"priority\":1}]}, \"synonyms\":{}}");

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