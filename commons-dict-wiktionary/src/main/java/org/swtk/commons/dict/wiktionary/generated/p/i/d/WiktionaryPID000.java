package org.swtk.commons.dict.wiktionary.generated.p.i.d;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryPID000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("piddock", "{\"term\":\"piddock\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{unk.|en}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any of the bivalve molluscs of the genus \u0027Pholas\u0027 or family \u0027\u0027, which burrow into soft rocks\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }