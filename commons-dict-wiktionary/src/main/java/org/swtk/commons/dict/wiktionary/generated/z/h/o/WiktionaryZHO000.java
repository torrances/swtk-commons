package org.swtk.commons.dict.wiktionary.generated.z.h.o;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryZHO000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("zhou", "{\"term\":\"zhou\", \"etymology\":{\"influencers\":[], \"languages\":[\"mandarin chinese\", \"English\"], \"text\":\"From the Pinyin romanization of Mandarin chinese {{zh-l|粥|tr\u003dzhōu}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A Chinese rice porridge\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }