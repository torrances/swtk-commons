package org.swtk.commons.dict.wiktionary.generated.d.i.x;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryDIX000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("dixey", "{\"term\":\"dixey\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A large kettle used for cooking and distributing hot food and drink, as on battlefields\", \"priority\":1}]}, \"synonyms\":{}}");

	add("dixie", "{\"term\":\"dixie\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Hindi\"], \"text\":\"From Hindi\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A large iron pot, used in the army\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1917\u0027\u0027, Arthur Guy Empey, \u0027Over the Top\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Then from the communication trenches came \u0027\u0027dixies\u0027\u0027 or iron pots, filled with steaming tea, which had two wooden stakes through their handles, and were carried by two men\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"1928\u0027\u0027, \u0027Memoirs of a Fox-Hunting Man\u0027, Penguin 2013, p. 261\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"And what those ‘\u0027\u0027dixies\u0027\u0027’ of hot tea signified no one knows who wasn\u0027t there to wait for them\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"1929\u0027\u0027, \u0027The Middle Parts of Fortune\u0027, Vintage 2014, p. 39\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"Army rum is potent stuff, especially when the supplies of tea and water have run out, and one drinks it neat out of a \u0027\u0027dixie\", \"priority\":7}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }