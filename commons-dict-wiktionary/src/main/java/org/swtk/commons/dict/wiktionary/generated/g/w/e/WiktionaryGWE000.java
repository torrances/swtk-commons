package org.swtk.commons.dict.wiktionary.generated.g.w.e;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryGWE000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("gwen", "{\"term\":\"gwen\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"shortened from Gwendolen or Guinevere\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Gwen\u0027\u0027 Stefani\u0027s \u0027Hollaback Girl\u0027 was a hit in 2004\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }