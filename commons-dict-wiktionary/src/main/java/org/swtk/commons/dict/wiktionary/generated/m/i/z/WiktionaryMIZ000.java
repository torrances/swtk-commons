package org.swtk.commons.dict.wiktionary.generated.m.i.z;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryMIZ000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("mizo", "{\"term\":\"mizo\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A language spoken in India, especially Mizoram, and adjoining parts of Bangladesh and Myanmar\", \"priority\":1}]}, \"synonyms\":{}}");

	add("mizoram", "{\"term\":\"mizoram\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"State in north-eastern India which has Aizawl as its capital\", \"priority\":1}]}, \"synonyms\":{}}");

	add("mizuage", "{\"term\":\"mizuage\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From Japanese 水揚げ.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The coming-of-age ceremony of an apprentice geisha, often associated with loss of virginity\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1997\u0027\u0027: “The first time a woman\u0027s cave is explored by a man\u0027s eel. That is what we call \u0027\u0027\u0027mizuage\u0027\u0027\u0027.” — Arthur Golden, \u0027Memoirs of a Geisha\u0027 (Vintage 1998, p. 232\", \"priority\":2}]}, \"synonyms\":{}}");

	add("mizzenmast", "{\"term\":\"mizzenmast\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The aftmost mast on a ship having three or more mast\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The second mast of a ship having two masts where the second one is shorter, such as a ketch or yawl\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }