package org.swtk.commons.dict.wiktionary.generated.t.u.y;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryTUY000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("tuyere", "{\"term\":\"tuyere\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"old english (ca. 450-1100)\", \"English\", \"French\", \"frankish\", \"middle french (ca. 1400-1600)\", \"old french (842-ca. 1400)\", \"old high german (ca. 750-1050)\", \"Icelandic\", \"Dutch\", \"old saxon\"], \"text\":\"From French \u0027tuyère\u0027 from Middle french (ca. 1400-1600) \u0027tuyere\u0027 from Old french (842-ca. 1400) \u0027toiere\u0027 (pipe-hole) from \u0027tuyau\u0027 \u0027tueil\u0027 \u0027tudel\u0027 (pipe) from Frankish {{m|frk|*thūta||pipe}}, from Proto-germanic {{m|gem-pro|*þeutǭ||pipe, channel, flow}}, from Proto-germanic {{m|gem-pro|*þeutaną||to howl, roar, resound}}, from Proto-indo-european {{m|ine-pro|*tu-}}, {{m|ine-pro|*tutu-||bird-cry, shriek}}. Cognate with Old saxon \u0027theuta\u0027 (pipe, water-channel) Old high german (ca. 750-1050) watar\u0027dioza\u0027 (water-opening) Old english (ca. 450-1100) {{m|ang|þēote||pipe, channel}}, Dutch \u0027tuit\u0027 (spout, nozzle) Icelandic \u0027þjótandi\u0027 (the name of an artery) Icelandic \u0027þjóta\u0027 (to rush, whistle)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A nozzle or similar fixture through which the blast is delivered to the interior of a blast furnace, or to the fire of a forg\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1957\u0027\u0027, H.R. Schubert, \u0027History of the British Iron and Steel Industry\u0027, page 21\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Remains of a clay \u0027\u0027tuyere\u0027\u0027 are present through which the blast was conducted into the furnace\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }