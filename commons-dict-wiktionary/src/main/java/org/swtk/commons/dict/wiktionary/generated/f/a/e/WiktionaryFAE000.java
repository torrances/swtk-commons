package org.swtk.commons.dict.wiktionary.generated.f.a.e;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryFAE000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("faena", "{\"term\":\"faena\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{borrowing|es|faena|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a series of passes performed by a matador with a muleta or a sword before the kill\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }