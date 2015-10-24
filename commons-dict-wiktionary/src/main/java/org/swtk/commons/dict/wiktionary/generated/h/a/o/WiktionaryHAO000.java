package org.swtk.commons.dict.wiktionary.generated.h.a.o;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryHAO000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("haor", "{\"term\":\"haor\", \"etymology\":{\"influencers\":[], \"languages\":[\"Bengali\", \"English\"], \"text\":\"Bengali \u0027হাওর|sc\u003dbeng|tr\u003dsagor\u0027 (sea) \u0027Haor\u0027 is a corruption of \u0027sagor\u0027 in certain Bengali dialects that pronounce \u0026quot;S\u0026quot; (স) as \u0026quot;H\u0026quot; (হ).\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A marshy wetland ecosystem in the north eastern part of Bangladesh which physically is a bowl or saucer shaped depression that looks like inland seas during the monsoon floods\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }