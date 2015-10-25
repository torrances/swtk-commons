package org.swtk.commons.dict.wiktionary.generated.n.d.u;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryNDU000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("nduja", "{\"term\":\"nduja\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\", \"Italian\", \"sicilian\"], \"text\":\"From \u0027\u0027nduja\u0027 in the {{l/en|Southern Calabrian}} dialect (either the {{l/en|Reggino}} or the {{l/en|Chjàna}} subdialect) of Sicilian originally from the French \u0027andouille\u0027 The standard Italian word for the sausage is \u0027salsicciotto\u0027 Image:Nduja.jpg|Some nduja|thumb|right\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A type of spicy, spreadable salami from Calabri\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }