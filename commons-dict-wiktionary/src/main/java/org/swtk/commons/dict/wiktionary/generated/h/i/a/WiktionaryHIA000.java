package org.swtk.commons.dict.wiktionary.generated.h.i.a;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryHIA000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("hiatus", "{\"term\":\"hiatus\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Latin\"], \"text\":\"From Latin {{m|la|hiātus||opening}} (mid-16th century), from {{m|la|hiō||stand open, yawn}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A gap in a series, making it incomplete\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"An interruption, break or pause\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"An unexpected break from work\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"The band took a \u0027\u0027hiatus\u0027\u0027 for three months\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"A gap in geological strata\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"An opening in an organ\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"Hiatus\u0027\u0027 aorticus is an opening in the diaphragm through which aorta and thoracic duct pass\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"A syllable break between two vowels, without an intervening consonant. (Compare diphthong\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"The condition of having such a break\", \"priority\":9},{\"upperType\":\"NOUN\", \"text\":\"Words like\u0027 reality \u0027and\u0027 naïve \u0027contain vowels in \u0027\u0027hiatus\", \"priority\":10}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }