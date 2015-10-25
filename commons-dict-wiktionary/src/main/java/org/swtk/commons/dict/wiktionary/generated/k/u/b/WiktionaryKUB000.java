package org.swtk.commons.dict.wiktionary.generated.k.u.b;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryKUB000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("kubasa", "{\"term\":\"kubasa\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"old turkish\", \"Ukrainian\"], \"text\":\"From Ukrainian \u0027ковбаса\u0027 (sausage) a very early Slavic borrowing with no clear antecedent. The Slavic variants point to several reconstructed forms from Proto-slavic {{m|sla-pro|*kъlbasa}}, {{m|sla-pro|*klobasa}}, {{m|sla-pro|*kobasa}}. It is considered most likely to be borrowed from language; compare Turkish \u0027külbastı\u0027 (roasted meat) from \u0027kül\u0027 (ash) from Old turkish \u0027\u0027 (kül) from Proto-turkic {{m|trk-pro|*kül||ashes}}.More at ковбаса.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A smoked pork sausage with garlic, originating in Eastern Europe\", \"priority\":1}]}, \"synonyms\":{}}");

	add("kubrickologist", "{\"term\":\"kubrickologist\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Kubrick|ologist|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who studies the works of Stanley Kubrick; one who studies Kubrickology\", \"priority\":1}]}, \"synonyms\":{}}");

	add("kubrickology", "{\"term\":\"kubrickology\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Kubrick|ology|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"the study of the works of Stanley Kubrick\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }