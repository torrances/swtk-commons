package org.swtk.commons.dict.wiktionary.generated.a.e.v;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryAEV000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("aevum", "{\"term\":\"aevum\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\"], \"text\":\"From \u0027aevum\u0027 in the technical sense of Scholastic philosophy.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"the mean between time and eternity; the state of being of the angels and saints in heaven\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }