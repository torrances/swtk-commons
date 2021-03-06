package org.swtk.commons.dict.wiktionary.generated.b.d.e;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.swtk.common.dict.dto.wiktionary.Entry;
import com.trimc.blogger.commons.utils.GsonUtils;

public class WiktionaryBDE000 {
	private static Map<String, Entry> map = new HashMap<String, Entry>();

	static {
		add("bdelygmia", "{\"term\":\"bdelygmia\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A litany of invective criticism\", \"priority\":1}]}, \"synonyms\":{}}");

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