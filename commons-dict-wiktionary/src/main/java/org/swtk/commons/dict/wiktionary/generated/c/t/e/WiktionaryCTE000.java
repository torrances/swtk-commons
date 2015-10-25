package org.swtk.commons.dict.wiktionary.generated.c.t.e;

import java.util.HashMap;
import java.util.Map;
import org.swtk.common.dict.dto.wiktionary.Entry;
import com.trimc.blogger.commons.utils.GsonUtils;

public class WiktionaryCTE000 {
	private static Map<String, Entry> map = new HashMap<String, Entry>();

	static {
		add("ctenophile",
				"{\"term\":\"ctenophile\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"From Ancient greek (to 1453) \u0027κτείς\u0027 (comb) + \u0027-phile\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a lover of comb\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1973\u0027\u0027: Making a show of looking for his comb which is, as usual, lost, suspect is known as a notorious \u0027\u0027ctenophile\u0027\u0027 — Thomas Pynchon, \u0027Gravity’s Rainbow\", \"priority\":2}]}, \"synonyms\":{}}");

		add("ctesiphon",
				"{\"term\":\"ctesiphon\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\", \"Latin\"], \"text\":\"From Latin {{m|la|Ctēsiphōn}}, from Ancient greek (to 1453) {{m|grc|Κτησιφῶν}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Ancient ruined city on the Tigris, near Baghdad, in present-day Iraq. Capital of Parthia and later of the Sassanid Persian Empire, abandoned in 7th and 8th centuries\", \"priority\":1}]}, \"synonyms\":{}}");

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