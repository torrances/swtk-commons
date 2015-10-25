package org.swtk.commons.dict.wiktionary.generated.k.a.v;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryKAV000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("kava", "{\"term\":\"kava\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Tongan\"], \"text\":\"From Tongan \u0027kava\u0027 in turn from Proto-Polynesian {{m|poz-pol-pro|*kawa}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A plant from the South Pacific\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"An intoxicating beverage made from the kava plant\", \"priority\":2}]}, \"synonyms\":{}}");

	add("kavakava", "{\"term\":\"kavakava\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"the plant\", \"priority\":1}]}, \"synonyms\":{}}");

	add("kavalactone", "{\"term\":\"kavalactone\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|kava|lactone|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any of a class of lactone compounds found in the kava shrub\", \"priority\":1}]}, \"synonyms\":{}}");

	add("kavithai", "{\"term\":\"kavithai\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Tamil {{etystub|en}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Tamil poetry\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }