package org.swtk.commons.dict.wordnet.indexbyname.instance.s.a.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSAS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sas\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08362958\"]}");
	add("{\"term\":\"sash\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03442981\", \"04143593\"]}");
	add("{\"term\":\"sashay\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00312635\", \"00535189\", \"00542072\"]}");
	add("{\"term\":\"sashimi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07895326\"]}");
	add("{\"term\":\"saskatchewan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08848767\"]}");
	add("{\"term\":\"saskatoon\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07761637\", \"08849108\"]}");
	add("{\"term\":\"sasquatch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09510515\"]}");
	add("{\"term\":\"sass\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06734698\"]}");
	add("{\"term\":\"sassaby\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02425037\"]}");
	add("{\"term\":\"sassafras\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07832028\", \"11727698\"]}");
	add("{\"term\":\"sassenach\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10571821\"]}");
	add("{\"term\":\"sassing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06734698\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }