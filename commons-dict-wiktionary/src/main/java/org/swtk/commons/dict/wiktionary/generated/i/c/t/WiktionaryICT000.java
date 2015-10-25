package org.swtk.commons.dict.wiktionary.generated.i.c.t;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryICT000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("icterus", "{\"term\":\"icterus\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\", \"Latin\"], \"text\":\"From the Latin {{m|la|icterus}}, from the Ancient greek (to 1453) {{m|grc|ἴκτερος||jaundice}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An excess of in the\", \"priority\":1}]}, \"synonyms\":{}}");

	add("ictus", "{\"term\":\"ictus\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\", \"Latin\"], \"text\":\"From the Latin \u0027ictus\u0027 (a blow) from {{m|la|īcio||I hit, strike, or smite”; “I stab or sting}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"the puls\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A sudden attack, blow, stroke, or seizure, as in a sunstroke, the sting of an insect, pulsation of an artery, etc\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The stress of voice laid upon an accented syllable of a word. Compare\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"In conducting, the indication of a musical event, most often the beat of the tempo or the entry of a section of the orchestra\", \"priority\":4}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }