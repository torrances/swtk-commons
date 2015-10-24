package org.swtk.commons.dict.wiktionary.generated.t.y.m;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryTYM000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("tympanometry", "{\"term\":\"tympanometry\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An examination to test the condition of the middle ear and mobility of the eardrum (tympanic membrane) and the ossicular chain by creating variations of air pressure in the ear canal\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }