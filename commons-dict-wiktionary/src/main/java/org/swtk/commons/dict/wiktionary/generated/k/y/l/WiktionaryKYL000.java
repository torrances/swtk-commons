package org.swtk.commons.dict.wiktionary.generated.k.y.l;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryKYL000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("kyle", "{\"term\":\"kyle\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From several places in Scotland and Northern Ireland, derived from Gaelic \u0027caol\u0027 (\u0026quot;narrows\u0026quot;).\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"transferred from the surname\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2005\u0027\u0027 Joyce Carol Oates: \u0027Missing Mom\u0027. Ecco 2005. ISBN 006081621X page 110\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Wally Szalla was the least discomforting of men, nothing like the pushy arrogant guys I was always meeting, or who were always meeting me. Guys with names like Dale, Brock, Kevin, \u0027\u0027Kyle\u0027\u0027. Guys with names nothing like Wally\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"transferred from the surnam\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"A town in Saskatchewa\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"A CDP in South Dakot\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"A city in Texas\", \"priority\":7}]}, \"synonyms\":{}}");

	add("kyle", "{\"term\":\"kyle\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A narrow channel between islands\", \"priority\":1}]}, \"synonyms\":{}}");

	add("kyloe", "{\"term\":\"kyloe\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Scottish Gaelic\"], \"text\":\"From Scottish gaelic \u0027gaidhealach\u0027 (gaelic, highland)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A breed of small Highland cattle.Category:en:Cattle\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }