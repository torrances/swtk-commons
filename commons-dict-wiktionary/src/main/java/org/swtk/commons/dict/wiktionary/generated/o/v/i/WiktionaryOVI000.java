package org.swtk.commons.dict.wiktionary.generated.o.v.i;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryOVI000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("oviposition", "{\"term\":\"oviposition\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From oviposit\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The process of laying eggs\", \"priority\":1}]}, \"synonyms\":{}}");

	add("ovipositor", "{\"term\":\"ovipositor\", \"etymology\":{\"influencers\":[{},{}], \"languages\":[\"English\", \"Latin\"], \"text\":\"From Latin \u0027ovum\u0027 (egg) + Latin \u0027positor\u0027 (one who deposits) Image:GrassHopperOviPositor.jpg|thumb|right|250px|A grasshopper\u0027s ovipositor.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A tubular protruding organ for laying eggs\", \"priority\":1}]}, \"synonyms\":{}}");

	add("ovist", "{\"term\":\"ovist\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|ovum|ist|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who believed that the complete human being was contained in the ovum rather than the sperm\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }