package org.swtk.commons.dict.wiktionary.generated.w.y.n;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryWYN000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("wynd", "{\"term\":\"wynd\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A narrow lane, alley or path, especially one between houses\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1999\u0027\u0027, \u0027A Clash of Kings\u0027, Bantam 2011, p. 637\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"He flew through the moonlight streets, clattering over cobbles, darting down narrow alleys and up twisty \u0027\u0027wynds\u0027\u0027, racing to his love\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2010\u0027\u0027, Tom Dyckhoff, \u0027The Guardian\u0027, 10 Jul 2010\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"Stirling\u0027s called an Edinburgh mini-me: the same winding \u0027\u0027wynds\u0027\u0027, the same historic core, castle, looming romantic hills. Only a lot cheaper\", \"priority\":5}]}, \"synonyms\":{}}");

	add("wynkernel", "{\"term\":\"wynkernel\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A member of the species \u0027Gallinula chloropus\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }