package org.swtk.commons.dict.wiktionary.generated.k.i.z;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryKIZ000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("kizami", "{\"term\":\"kizami\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Japanese\"], \"text\":\"Japanese\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A shredded form of nori used in Japanese dishes.Category:en:Foods\", \"priority\":1}]}, \"synonyms\":{}}");

	add("kizlyar", "{\"term\":\"kizlyar\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a town in the Republic of Dagestan, Russia\", \"priority\":1}]}, \"synonyms\":{}}");

	add("kizomba", "{\"term\":\"kizomba\", \"etymology\":{\"influencers\":[], \"languages\":[\"Portuguese\"], \"text\":\"From {{m|kmb|kizomba||party}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A genre of Angolan popular music derived from the traditional semba dance\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }