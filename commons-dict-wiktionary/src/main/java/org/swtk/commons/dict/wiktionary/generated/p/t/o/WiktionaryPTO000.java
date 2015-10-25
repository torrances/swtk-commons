package org.swtk.commons.dict.wiktionary.generated.p.t.o;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryPTO000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("ptochocracy", "{\"term\":\"ptochocracy\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"From Ancient greek (to 1453) \u0027πτοχος\u0027 (poverty) + \u0027κράτος\u0027 (power”, “might)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a society or a system ruled and dominated by the poor\", \"priority\":1}]}, \"synonyms\":{}}");

	add("ptochology", "{\"term\":\"ptochology\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The study of poverty\", \"priority\":1}]}, \"synonyms\":{}}");

	add("ptolemy", "{\"term\":\"ptolemy\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"From Ancient greek (to 1453) \u0027πτολεμαῖος\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"of Greek origin, borne by historical persons in ancient Egypt\", \"priority\":1}]}, \"synonyms\":{}}");

	add("ptomaine", "{\"term\":\"ptomaine\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\", \"ancient greek (to 1453)\"], \"text\":\"From French \u0027ptomaïne\u0027 from French \u0027ptomaina\u0027 from Ancient greek (to 1453) \u0027lang\u003dgrc|πτῶμα\u0027 ()\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any of various formed by putrefactive bacteria\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"food poisonin\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"1989\u0027\u0027, Margaret Atwood, \u0027Cat\u0027s Eye\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Sandwiches arrived from outside, strange granular bread, the butter on it liquid, some sort of beige meat paste that hinted at \u0027\u0027ptomaine\", \"priority\":4}]}, \"synonyms\":{}}");

	add("ptosis", "{\"term\":\"ptosis\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"From Ancient greek (to 1453) \u0027πτῶσις\u0027 (falling, a fall)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The prolapse of a bodily organ, especially drooping of the eyelid or the breasts\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }