package org.swtk.commons.dict.wiktionary.generated.e.m.c;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryEMC000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("emcee", "{\"term\":\"emcee\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From the pronunciation of the abbreviation MC, master of ceremonies.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Master of ceremonies (host of a game show or function\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A rapper\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }