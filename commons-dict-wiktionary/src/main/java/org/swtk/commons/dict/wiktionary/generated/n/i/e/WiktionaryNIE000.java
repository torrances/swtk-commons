package org.swtk.commons.dict.wiktionary.generated.n.i.e;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryNIE000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("niello", "{\"term\":\"niello\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\", \"Italian\", \"Latin\"], \"text\":\"From Italian \u0027niello\u0027 from post-classical Latin \u0027nigellum\u0027 from Latin \u0027nigellus\u0027 (blackish)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any of various black metal alloys, made of sulphur with copper, silver or lead, used to create decorative designs on other metals\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2006\u0027\u0027, Thomas Pynchon, \u0027Against the Day\u0027, Vintage 2007, p. 283\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"a young woman named Renata, with a gesturing of her dark curls, beckoned him in with a cigarette-case of Russian silver and \u0027\u0027niello\u0027\u0027, which sprang open to reveal a collection of “smokes”\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"An impression on paper taken from the engraved or incised surface before the niello alloy has been inlaid\", \"priority\":4}]}, \"synonyms\":{}}");

	add("nielsbohrium", "{\"term\":\"nielsbohrium\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From w:Niels Bohr|Niels Bohr and \u0027\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"dubnium\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"bohrium\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }