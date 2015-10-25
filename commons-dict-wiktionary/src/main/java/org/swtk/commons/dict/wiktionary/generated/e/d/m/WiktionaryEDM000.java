package org.swtk.commons.dict.wiktionary.generated.e.d.m;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryEDM000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("edmonchuk", "{\"term\":\"edmonchuk\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Ukrainian\"], \"text\":\"\u0027\u0027 + \u0027\u0027 a suffix from Ukrainian surnames, from Ukrainian \u0027-чук\u0027 in reference to Edmonton\u0027s large proportion of residents of Ukrainian ancestry.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The city of Edmonton, Canada\", \"priority\":1}]}, \"synonyms\":{}}");

	add("edmonton", "{\"term\":\"edmonton\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Provincial capital city of Alberta (Canada\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"An area of north London, United Kingdom\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }