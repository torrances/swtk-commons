package org.swtk.commons.dict.wiktionary.generated.p.d.c;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryPDC000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("pdca", "{\"term\":\"pdca\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"the cycle of Plan-do|Do-check|Check-act|Act, four-step solving process typically used in quality control\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }