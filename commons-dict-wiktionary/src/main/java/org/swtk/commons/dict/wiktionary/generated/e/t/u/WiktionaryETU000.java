package org.swtk.commons.dict.wiktionary.generated.e.t.u;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryETU000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("etude", "{\"term\":\"etude\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\", \"Latin\"], \"text\":\"From the around the year 1837, from French \u0027étude\u0027 (meaning \u0026quot;study\u0026quot;) from the Latin word \u0027studium\u0027 (meaning \u0026quot;spirit\u0026quot;, \u0026quot;devotion\u0026quot; or \u0026quot;study\u0026quot;).\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A short piece of music, designed to give a performer practice in a particular area or skill\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }