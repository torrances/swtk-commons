package org.swtk.commons.dict.wiktionary.generated.k.o.b;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryKOB000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("kobe", "{\"term\":\"kobe\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Japanese\"], \"text\":\"From Japanese \u0027神戸\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"or \u0027\u0027Kōbe\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A city in Honshū, Japan, capital of Hyōgo prefecture\", \"priority\":2}]}, \"synonyms\":{}}");

	add("kobane", "{\"term\":\"kobane\", \"etymology\":{\"influencers\":[], \"languages\":[\"German\", \"English\"], \"text\":\"From {{m|kmr|Kobanê}}, {{m|kmr|Kobanî}}, from German {{m|de|Kompanie}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A city in Kurdistan of Syria\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }