package org.swtk.commons.dict.wiktionary.generated.c.p.c;

import java.util.HashMap;
import java.util.Map;
import org.swtk.common.dict.dto.wiktionary.Entry;
import com.trimc.blogger.commons.utils.GsonUtils;

public class WiktionaryCPC000 {
	private static Map<String, Entry> map = new HashMap<String, Entry>();

	static {
		add("cpctc",
				"{\"term\":\"cpctc\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a theorem regarding congruent triangles, stating that if two or more triangles are proven congruent by any method, then all of their corresponding angles and sides are congruent as well\", \"priority\":1}]}, \"synonyms\":{}}");

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