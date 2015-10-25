package org.swtk.commons.dict.wiktionary.generated.m.w.a;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryMWA000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("mwah", "{\"term\":\"mwah\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"onomatopoeic|Onomatopoeic. From the sound made when kissing, or the sound of a fretless bass.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The hallmark sound of a fretless bass guitar played with a certain technique, where treble frequencies increase gradually after the attack\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Play it again, but with more mwah this time\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }