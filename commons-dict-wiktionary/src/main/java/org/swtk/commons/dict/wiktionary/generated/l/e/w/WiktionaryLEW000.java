package org.swtk.commons.dict.wiktionary.generated.l.e.w;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryLEW000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("lewis", "{\"term\":\"lewis\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"old french (842-ca. 1400)\", \"anglo-norman\"], \"text\":\"Anglo-norman from Old french (842-ca. 1400) \u0027louis\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"of Norman origin, the English form of Louis\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"anglicized form of Llewellyn\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The Isle of Lewis, Scotland\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"The title given to a partially apprenticed Freemason who is normally the Master or Son of a practicing Freemason; One practising or learning the degrees of Freemasonry after introduction to the degrees and before full induction or before becoming a Worshipful Brother\", \"priority\":4}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }