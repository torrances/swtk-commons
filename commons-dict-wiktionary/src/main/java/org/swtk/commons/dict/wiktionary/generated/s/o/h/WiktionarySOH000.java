package org.swtk.commons.dict.wiktionary.generated.s.o.h;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionarySOH000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("soho", "{\"term\":\"soho\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An area of central London’s West End\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"an area of Manhattan\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }