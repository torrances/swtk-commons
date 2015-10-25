package org.swtk.commons.dict.wiktionary.generated.c.z.e;

import java.util.HashMap;
import java.util.Map;
import org.swtk.common.dict.dto.wiktionary.Entry;
import com.trimc.blogger.commons.utils.GsonUtils;

public class WiktionaryCZE000 {
	private static Map<String, Entry> map = new HashMap<String, Entry>();

	static {
		add("czechoslovakia",
				"{\"term\":\"czechoslovakia\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A former country in central Europe; now Czechia and Slovakia\", \"priority\":1}]}, \"synonyms\":{}}");

		add("czenglish",
				"{\"term\":\"czenglish\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{blend|Czech|English|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The poor English spoken or written by some Czechs\", \"priority\":1}]}, \"synonyms\":{}}");

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