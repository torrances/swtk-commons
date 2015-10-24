package org.swtk.commons.dict.wiktionary.generated.o.k.r;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryOKR000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("okroshka", "{\"term\":\"okroshka\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Russian\", \"Ukrainian\"], \"text\":\"From Russian or Ukrainian \u0027окро́шка\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A cold raw vegetable soup, part of the national cuisines of Russia and Ukraine\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }