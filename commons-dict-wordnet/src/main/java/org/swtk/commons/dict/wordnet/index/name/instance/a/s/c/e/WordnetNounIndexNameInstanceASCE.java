package org.swtk.commons.dict.wordnet.index.name.instance.a.s.c.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceASCE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ascendance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14465291\"]}");
	add("{\"term\":\"ascendancy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14465291\"]}");
	add("{\"term\":\"ascendant\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09811996\", \"14465827\"]}");
	add("{\"term\":\"ascendence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14465291\"]}");
	add("{\"term\":\"ascendency\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14465291\"]}");
	add("{\"term\":\"ascendent\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09811996\", \"14465827\"]}");
	add("{\"term\":\"ascender\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06813390\", \"06843611\", \"09832927\"]}");
	add("{\"term\":\"ascending\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00325210\"]}");
	add("{\"term\":\"ascension\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00325210\", \"07326279\", \"07326440\", \"07460080\", \"15217887\"]}");
	add("{\"term\":\"ascent\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00325210\", \"07460080\", \"09229873\"]}");
	add("{\"term\":\"ascesis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01070936\"]}");
	add("{\"term\":\"ascetic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09777504\"]}");
	add("{\"term\":\"asceticism\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01070936\", \"04889193\", \"05967949\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }