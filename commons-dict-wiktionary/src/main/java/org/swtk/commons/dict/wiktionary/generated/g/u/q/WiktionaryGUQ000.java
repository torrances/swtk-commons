package org.swtk.commons.dict.wiktionary.generated.g.u.q;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryGUQ000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("guqin", "{\"term\":\"guqin\", \"etymology\":{\"influencers\":[], \"languages\":[\"mandarin chinese\", \"English\"], \"text\":\"From Mandarin chinese {{l|cmn|古琴|tr\u003dgǔqín}}, made up of {{l|cmn|古}} ‘ancient’ and {{l|cmn|琴}} ‘stringed instrument’.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A plucked zither-like stringed instrument (chordophone), traditionally featuring seven unfretted strings, originating in ancient China\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1982\u0027\u0027: \u0027The Times\u0027, 25 May 1982, p.10 col\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Among those who will be making the Otter valley resound to the strains of the \u0027guzheng\u0027 and \u0027erhu\u0027 is Wu Wenguang, who plays a piece of music 1,800 years old on the \u0027\u0027\u0027guqin\u0027\u0027\u0027, an instrument known to have existed 3,000 years ago\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"place\u0027) \u0027\u0027Guqin Tai\u0027\u0027 《古琴臺》 (Guqin Terrace or Heptachord Terrace, etc), the name of a place in Wuhan, China\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"2005\u0027\u0027, Travel China Guide ([http://www.travelchinaguide.com/attraction/hubei/wuhan/guqin.htm travelchinaquide.com], 09 September 2006\", \"priority\":5}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }