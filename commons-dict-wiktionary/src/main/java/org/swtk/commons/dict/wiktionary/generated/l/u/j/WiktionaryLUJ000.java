package org.swtk.commons.dict.wiktionary.generated.l.u.j;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryLUJ000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("lujvo", "{\"term\":\"lujvo\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"lojban\"], \"text\":\"From Lojban\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A compound Lojban word, made up of several in their form, joined together\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }