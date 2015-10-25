package org.swtk.commons.dict.wiktionary.generated.k.o.h;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryKOH000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("koha", "{\"term\":\"koha\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Maori\"], \"text\":\"Maori\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A Māori tradition of reciprocal giving of gifts\", \"priority\":1}]}, \"synonyms\":{}}");

	add("kohl", "{\"term\":\"kohl\", \"etymology\":{\"influencers\":[], \"languages\":[\"Arabic\", \"English\"], \"text\":\"From Arabic \u0027lang\u003dar\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A dark powder used as eye makeup, especially in Eastern countries\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }