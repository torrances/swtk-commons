package org.swtk.commons.dict.wiktionary.generated.m.e.u;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryMEU000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("meum", "{\"term\":\"meum\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\", \"Latin\"], \"text\":\"From Latin {{m|la|mēum||\u0027Meum athamanticum\u0027}}, from Ancient greek (to 1453) {{m|grc|μῆον}}, probably from {{m|grc|μεῖον||lesser}} for its small size.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"spignel, \u0027Meum athamanticum\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }