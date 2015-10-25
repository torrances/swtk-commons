package org.swtk.commons.dict.wiktionary.generated.k.o.h;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryKOH000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("koha", "{\"term\":\"koha\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Maori\"], \"text\":\"Maori\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A Māori tradition of reciprocal giving of gifts\", \"priority\":1}]}, \"synonyms\":{}}");

	add("kohl", "{\"term\":\"kohl\", \"etymology\":{\"influencers\":[], \"languages\":[\"Arabic\", \"English\"], \"text\":\"From Arabic \u0027lang\u003dar\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A dark powder used as eye makeup, especially in Eastern countries\", \"priority\":1}]}, \"synonyms\":{}}");

	add("kohlrabi", "{\"term\":\"kohlrabi\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"German\", \"English\", \"Italian\"], \"text\":\"From the German \u0027kohlrabi\u0027 from \u0027kohl|lang\u003dde\u0027 () + Italian \u0027rapa\u0027 from \u0027cavoli rape\u0027 the plural of \u0027cavolo rapa\u0027 (cole rape)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a variety of the cabbage, having a turnip-shaped edible stem\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }