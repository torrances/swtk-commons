package org.swtk.commons.dict.wiktionary.generated.t.e.o;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryTEO000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("teosinte", "{\"term\":\"teosinte\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\", \"Spanish\", \"French\", \"classical nahuatl\"], \"text\":\"From French \u0027téosinte\u0027 from Spanish \u0027teocinte\u0027 from Classical nahuatl \u0027teocintli\u0027 apparently from \u0027teōtl\u0027 (lang\u003dnci) + \u0027cintli\u0027 (dried maize)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any of a few species of maize-like grasses of the genus \u0027Zea\u0027 found in Mexico, Guatemala and Nicaragua\", \"priority\":1}]}, \"synonyms\":{}}");

	add("teotihuacan", "{\"term\":\"teotihuacan\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\"], \"text\":\"From\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A vast archeological site in Mexico\", \"priority\":1}]}, \"synonyms\":{}}");

	add("teotwawki", "{\"term\":\"teotwawki\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Acronym\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The end of the world as we know it\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }