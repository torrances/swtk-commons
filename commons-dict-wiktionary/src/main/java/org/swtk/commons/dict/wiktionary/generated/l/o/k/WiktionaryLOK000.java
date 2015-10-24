package org.swtk.commons.dict.wiktionary.generated.l.o.k;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryLOK000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("lokasi", "{\"term\":\"lokasi\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Malay\", \"Dutch\"], \"text\":\"From Dutch \u0027locatie\u0027 or English \u0027location\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"location\", \"priority\":1}]}, \"synonyms\":{}}");

	add("lokomotiv", "{\"term\":\"lokomotiv\", \"etymology\":{\"influencers\":[], \"languages\":[\"Danish\", \"English\"], \"text\":\"From English \u0027locomotive\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"locomotive (self-propelled vehicle that runs on rails\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }