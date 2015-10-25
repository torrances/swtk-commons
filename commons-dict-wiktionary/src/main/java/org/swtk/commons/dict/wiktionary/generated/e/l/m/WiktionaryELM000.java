package org.swtk.commons.dict.wiktionary.generated.e.l.m;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryELM000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("elmo", "{\"term\":\"elmo\", \"etymology\":{\"influencers\":[], \"languages\":[\"German\", \"English\", \"Italian\"], \"text\":\"From an Italian contraction of \u0027erasmo\u0027 cognate with Erasmus. Also a German short form of \u0027elmar\u0027 * By folk etymology seen as a short form of Elmer.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"1996\u0027\u0027 , \u0027A Language of Their Own\u0027, Two Plays, Grove/Atlantic Inc\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"MING. About his name. Oscar. Asians always pick out the most curious and most discarded English names from books and TV. Like Cornelius. \u0027\u0027Elmo\u0027\u0027. Wellington\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A city in Missouri\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"An unincorporated community in Texas\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"A town in Utah\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"An unincorporated community in Wisconsin\", \"priority\":6}]}, \"synonyms\":{}}");

	add("elmer", "{\"term\":\"elmer\", \"etymology\":{\"influencers\":[], \"languages\":[\"old english (ca. 450-1100)\", \"English\"], \"text\":\"Medieval variant of the given name Aylmer, from Old english (ca. 450-1100) \u0027æþel\u0027 (noble) + \u0027mær\u0027 (famous) .\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"transferred back from the surname in the 19th century U.S\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A city in Missouri\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A borough in New Jersey\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A town in Oklahoma\", \"priority\":4}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }