package org.swtk.commons.dict.wiktionary.generated.o.b.o;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryOBO000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("oboe", "{\"term\":\"oboe\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\", \"Italian\"], \"text\":\"An earlier form in English is \u0027\u0027 but the spelling \u0027oboe\u0027 was adopted into English ca. 1770 from the Italian \u0027oboè\u0027 a transliteration in that language\u0027s orthography of the 17th-century pronunciation of the French word \u0027hautbois\u0027 a compound word made of \u0027haut\u0027 (high, loud, high-pitched) and \u0027bois\u0027 (wood, woodwind)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A soprano and melody wind instrument in the modern orchestra and wind ensemble. It is a smaller instrument and generally made of grendilla wood. It is a member of the double reed family\", \"priority\":1}]}, \"synonyms\":{}}");

	add("obomber", "{\"term\":\"obomber\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"* {{blend|Obama|bomber|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"an epithet of Barack Obama\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }