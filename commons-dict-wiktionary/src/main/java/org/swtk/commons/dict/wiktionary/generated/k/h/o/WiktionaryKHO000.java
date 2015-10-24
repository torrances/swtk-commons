package org.swtk.commons.dict.wiktionary.generated.k.h.o;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryKHO000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("khoekhoe", "{\"term\":\"khoekhoe\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"hai//om\", \"khoekhoe\"], \"text\":\"From Hai//om and Khoekhoe \u0027khoe-khoe\u0027 self-designation, from \u0027khoe\u0027 ()\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A member of a Southern African people, formerly known as Hottentots\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Any of a group of languages or dialects spoken by such people\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }