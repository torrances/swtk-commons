package org.swtk.commons.dict.wiktionary.generated.j.i.h;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryJIH000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("jihad", "{\"term\":\"jihad\", \"etymology\":{\"influencers\":[], \"languages\":[\"Arabic\", \"English\"], \"text\":\"From Arabic {{m|ar|جِهَاد||struggle; effort}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A holy war undertaken by Muslims\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1938\u0027\u0027, \u0026quot;Holy War\u0026quot;, \u0027Time\u0027, 22 Aug 1938\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Young Iraqis of both sects obeyed the imams\u0027 ruling last week by rushing to conscription offices in hot, dirty, dusty Bagdad to offer themselves or their money for the \u0027\u0027jihad\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"1977\u0027\u0027, \u0027A Savage War of Peace\u0027, New York Review Books 2006, p. 26\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"Small groups of killers, the scent of blood in their nostrils, now fanned out by taxi, bicycle or even on horseback into the surrounding countryside, spreading the word that a general \u0027\u0027\u0027jihad\u0027\u0027\u0027, or ‘holy war’, had broken out\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"2013\u0027\u0027, Mona Mahmood \u0026amp; Ian Black, \u0027The Guardian\u0027, 8 May 2013\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"The Jabhat al-Nusra media, with songs about \u0027\u0027jihad\u0027\u0027 and martyrdom, is extremely influential\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"An aggressive campaign for an idea\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"a personal spiritual struggle for self-improvement and against evil\", \"priority\":9}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }