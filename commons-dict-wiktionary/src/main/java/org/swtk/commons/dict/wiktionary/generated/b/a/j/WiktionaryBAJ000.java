package org.swtk.commons.dict.wiktionary.generated.b.a.j;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryBAJ000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("baja", "{\"term\":\"baja\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a port on the river Danube in Hungary\", \"priority\":1}]}, \"synonyms\":{}}");

	add("bajaj", "{\"term\":\"bajaj\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Indonesian\"], \"text\":\"Indonesian \u0027bajaj\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A tuk-tuk\", \"priority\":1}]}, \"synonyms\":{}}");

	add("bajan", "{\"term\":\"bajan\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a shortened w:Corruption corrupted form of Bar-Bajan, which itself is a phonetically spelled form of Barbadian\", \"priority\":1}]}, \"synonyms\":{}}");

	add("bajillion", "{\"term\":\"bajillion\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"See {{suffix||illion|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An unspecified large number (of\", \"priority\":1}]}, \"synonyms\":{}}");

	add("bajocian", "{\"term\":\"bajocian\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A subdivision of the Jurassic period\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }