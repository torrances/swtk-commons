package org.swtk.commons.dict.wiktionary.generated.a.y.a;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryAYA000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("ayah", "{\"term\":\"ayah\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Portuguese\"], \"text\":\"From various Indian languages, after Portuguese \u0027aia\u0027 (nurse, governess) feminine of \u0027aio\u0027 ()\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A verse in the Quran\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A native female servant or maid, especially working for Europeans in South Asia\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"1888\u0027\u0027, Rudyard Kipling, ‘Watches of the Night’, \u0027Plain Tales from the Hills\u0027, Folio 2005, p. 59\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"She manufactured the Station scandal, and—talked to her \u0027\u0027\u0027ayah\", \"priority\":4}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }