package org.swtk.commons.dict.wiktionary.generated.c.w.t;

import java.util.HashMap;
import java.util.Map;
import org.swtk.common.dict.dto.wiktionary.Entry;
import com.trimc.blogger.commons.utils.GsonUtils;

public class WiktionaryCWT000 {
	private static Map<String, Entry> map = new HashMap<String, Entry>();

	static {
		add("cwtch",
				"{\"term\":\"cwtch\", \"etymology\":{\"influencers\":[], \"languages\":[\"Welsh\", \"English\"], \"text\":\"From Welsh \u0027cwts\u0027 \u0027cwtsh\u0027 (hug, cuddle)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A cubbyhole or similar hiding place\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1944\u0027\u0027, Glyn Jones, \u0026quot;An Afternoon at Ewa Shad\u0027s\u0026quot;, \u0027The Water-Music and Other Stories\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"In front of the pavement again stretched a flat patch of rusty ground, a sort of little platform in the side of the hill where the sagging drying-lines stood and a chickens\u0027 \u0027\u0027\u0027cwtch\u0027\u0027\u0027 built of orange-boxes\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2007\u0027\u0027, Mike Buckingham, \u0027Western Telegraph\u0027, 20 Aug 2007\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"quot;In better times when the coalman called at our home in William Street he heaved the sacks through the front door and put their contents into the ‘\u0027\u0027cwtch\u0027\u0027’ under the stairs, a messy business indeed.\u0026quot\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"A hug or cuddle\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"2007\u0027\u0027, Ieuan Evans, \u0027The Telegraph\u0027, 18 Nov 2007\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"I am expecting the big man to come round the corner and give me a ‘\u0027\u0027cwtch\u0027\u0027’ as he has done beside countless rugby fields\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"2011\u0027\u0027, Rachel Mainwaring, \u0027South Wales Echo\u0027, 17 Feb 2011\", \"priority\":9},{\"upperType\":\"NOUN\", \"text\":\"I don’t mind them coming in for a quick \u0027\u0027cwtch\u0027\u0027 before trudging back off to their own rooms, as long as no conversation is required and it is literally just a five-minute cuddle\", \"priority\":10}]}, \"synonyms\":{}}");

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