package org.swtk.commons.dict.wiktionary.generated.p.i.j;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryPIJ000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("pijin", "{\"term\":\"pijin\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"pijin\"], \"text\":\"Pijin \u0027pijin\u0027 from English \u0027pidgin\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A language spoken on the Solomon Islands\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }