package org.swtk.commons.dict.wiktionary.generated.o.m.i;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryOMI000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("omiai", "{\"term\":\"omiai\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Japanese\"], \"text\":\"From Japanese \u0027見合い\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A Japanese custom in which unattached individuals are introduced to each other to consider the possibility of marriage\", \"priority\":1}]}, \"synonyms\":{}}");

	add("omicron", "{\"term\":\"omicron\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"the name for the 15th letter of Classical Classical and Modern Greek. The 16th in Ancient Ancient and Old Greek\", \"priority\":1}]}, \"synonyms\":{}}");

	add("omission", "{\"term\":\"omission\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"old french (842-ca. 1400)\", \"Latin\"], \"text\":\"From Old french (842-ca. 1400) \u0027omission\u0027 from Latin \u0027omissio\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The act of omitting\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The act of neglecting to perform an action one has an obligation to do\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Something deleted or left out\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Something not done or neglected\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"The shortening of a word or phrase, using an apostrophe ( \u0027 ) to replace the missing letters, often used to approximate the sound of speech or a specific dialect\", \"priority\":5}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }