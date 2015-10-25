package org.swtk.commons.dict.wiktionary.generated.q.a.s;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryQAS000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("qasida", "{\"term\":\"qasida\", \"etymology\":{\"influencers\":[], \"languages\":[\"Arabic\", \"English\"], \"text\":\"From Arabic {{m|ar|قَصِيدَة}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An Arabic or Persian elegiac monorhyme poem, usually having a tripartite structure\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1958\u0027\u0027, Lawrence Durrell, \u0027Balthazar\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"He was delighted to hear some music and listened with emotion to the wild \u0027\u0027\u0027qasidas\u0027\u0027\u0027 that the old man sang – songs of the Arab canon full of the wild heart-sickness of the desert\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2000\u0027\u0027: María Rosa Menocal, Raymond P. Scheindlin, \u0027The Literature of Al-Andalus\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"The \u0027\u0027qasida\u0027\u0027 is a formal multithematic ode addressed to a member of the elite in praise\", \"priority\":5}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }