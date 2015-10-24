package org.swtk.commons.dict.wiktionary.generated.v.r.d;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryVRD000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("vrddhi", "{\"term\":\"vrddhi\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Sanskrit\"], \"text\":\"From Sanskrit \u0027sc\u003ddeva|वृद्धि|tr\u003dvṛddhi\u0027 (growth, increase)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The strongest ablaut-grade in a series of vowels alternations in certain Indo-European languages, most notably Sanskrit, as well as in Proto-Indo-European\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2004\u0027\u0027, Benjamin Fortson, \u0027Indo-European Language and Culture\u0027, Blackwell 2004, p. 117\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Sometimes a \u0027\u0027vrddhi\u0027\u0027-derivative was formed from a zero-grade and involved the insertion of the full-grade vowel in the “wrong” place\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"In Sanskrit grammar terminology, a technical term for a group of long vowels\", \"priority\":4}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }