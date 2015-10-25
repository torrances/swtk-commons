package org.swtk.commons.dict.wiktionary.generated.t.e.q;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryTEQ000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("tequila", "{\"term\":\"tequila\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Spanish\"], \"text\":\"From Spanish \u0027tequila\u0027 from \u0027tequillan\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An alcoholic liquor distilled from the fermented juice of the Central American century plant \u0027Agave tequilana\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }