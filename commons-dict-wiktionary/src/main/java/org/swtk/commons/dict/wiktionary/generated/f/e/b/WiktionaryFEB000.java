package org.swtk.commons.dict.wiktionary.generated.f.e.b;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryFEB000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("febarbamate", "{\"term\":\"febarbamate\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A particular muscle relaxant\", \"priority\":1}]}, \"synonyms\":{}}");

	add("february", "{\"term\":\"february\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\", \"middle english (1100-1500)\", \"old french (842-ca. 1400)\", \"Latin\"], \"text\":\"Re-Latinized from Middle english (1100-1500) \u0027feoverel\u0027 from Old french (842-ca. 1400) \u0027feverier\u0027 from Latin {{m|la|februārius}}, of the month of purification, from \u0027februa\u0027, the Roman festival of purification, plural of \u0027februum\u0027 perhaps from Latin \u0027febris\u0027 (fever) from Proto-indo-european {{m|ine-pro|*dʰegʷʰris}}, an extension of the root {{m|ine-pro|*dʰegʷʰ-|gloss\u003dto burn}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The second month of the Gregorian calendar, following January and preceding March\", \"priority\":1}]}, \"synonyms\":{}}");

	add("februation", "{\"term\":\"februation\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Latin\"], \"text\":\"From Latin \u0027februatio\u0027, from \u0027februare\u0027 ‘purify’.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"purification, rejuvenation, renewal, especially ritual or ceremonia\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Romantics hoped the war would bring a \u0027\u0027februation\u0027\u0027 by fire\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"the object of such purification; a sacrifice\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }