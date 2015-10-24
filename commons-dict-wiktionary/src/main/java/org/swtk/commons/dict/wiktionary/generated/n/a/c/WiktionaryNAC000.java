package org.swtk.commons.dict.wiktionary.generated.n.a.c;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryNAC000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("nacelle", "{\"term\":\"nacelle\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{borrowing|fr|lang\u003den}} \u0027nacelle\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A separate streamlined enclosure mounted on an aircraft to house an engine, cargo, or crew\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The part between the tower and rotor of a wind turbine\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The compartment that holds passengers on a hot-air balloon, a dirigible, or an aerostat; a gondola\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A small boat\", \"priority\":4}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }