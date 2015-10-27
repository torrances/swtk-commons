package org.swtk.commons.dict.wordnet.index.name.instance.s.p.a.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSPAN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"span\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00350039\", \"02901994\", \"13677822\", \"13765745\", \"05094268\", \"15159292\"]}");
	add("{\"term\":\"spandau\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04274201\"]}");
	add("{\"term\":\"spandex\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04274275\"]}");
	add("{\"term\":\"spandrel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04274356\"]}");
	add("{\"term\":\"spandril\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04274356\"]}");
	add("{\"term\":\"spangle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04180759\"]}");
	add("{\"term\":\"spaniard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09751320\"]}");
	add("{\"term\":\"spaniel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02103760\"]}");
	add("{\"term\":\"spanish\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09752657\", \"06979499\"]}");
	add("{\"term\":\"spank\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00135292\"]}");
	add("{\"term\":\"spanker\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04274545\", \"10628319\"]}");
	add("{\"term\":\"spanking\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01165274\"]}");
	add("{\"term\":\"spanner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04613932\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }