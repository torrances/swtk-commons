package org.swtk.commons.dict.wiktionary.generated.w.a.d;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryWAD000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("waddle", "{\"term\":\"waddle\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{PIE root|en|weh₂dʰ}}First known use in English in a version of the Song of Roland around the year 1400. (Source:OED online)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A swaying gait\", \"priority\":1}]}, \"synonyms\":{}}");

	add("wader", "{\"term\":\"wader\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who wades\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A waterproof boot that comes up to the hip, used by fishermen, etc\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A long-legged bird associated with wetland or coastal environments\", \"priority\":3}]}, \"synonyms\":{}}");

	add("wadeite", "{\"term\":\"wadeite\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Wade|ite|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A hexagonal-dipyramidal mineral containing oxygen, potassium, silicon, and zirconium\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }