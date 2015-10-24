package org.swtk.commons.dict.wiktionary.generated.d.o.s;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryDOS000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("dosh", "{\"term\":\"dosh\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{unk.|en}}. Possibly a combination of dough and cash\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"I\u0027d like to buy a new car, but I\u0027m short on \u0027\u0027dosh\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }