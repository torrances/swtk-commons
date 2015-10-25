package org.swtk.commons.dict.wiktionary.generated.s.u.e;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionarySUE000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("suer", "{\"term\":\"suer\", \"etymology\":{\"influencers\":[], \"languages\":[\"French\", \"Latin\"], \"text\":\"From Latin \u0027sūdāre\u0027 present active infinitive of \u0027sūdō\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who sues; a suitor\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }