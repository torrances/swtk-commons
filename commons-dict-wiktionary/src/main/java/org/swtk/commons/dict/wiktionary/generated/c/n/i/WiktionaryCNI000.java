package org.swtk.commons.dict.wiktionary.generated.c.n.i;

import java.util.HashMap;
import java.util.Map;
import org.swtk.common.dict.dto.wiktionary.Entry;
import com.trimc.blogger.commons.utils.GsonUtils;

public class WiktionaryCNI000 {
	private static Map<String, Entry> map = new HashMap<String, Entry>();

	static {
		add("cnida",
				"{\"term\":\"cnida\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\", \"Latin\"], \"text\":\"New Latin from Ancient greek (to 1453)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A nematocyst\", \"priority\":1}]}, \"synonyms\":{}}");

		add("cnidarian",
				"{\"term\":\"cnidarian\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\"], \"text\":\"From \u0027cnidaria\u0027 {{suffix||an|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"any of various invertebrate animals, such as jellyfish, hydras, sea anemones, corals and formerly sponges and ctenophores that belong to the phylum \u0027Cnidaria\", \"priority\":1}]}, \"synonyms\":{}}");

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