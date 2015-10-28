package org.swtk.commons.dict.wordnet.indexbyname.instance.u.n.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceUNP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"unpalatability\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04787671\", \"05003520\"]}");
	add("{\"term\":\"unpalatableness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04787671\", \"05003520\"]}");
	add("{\"term\":\"unperceptiveness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04852377\"]}");
	add("{\"term\":\"unpermissiveness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04646470\"]}");
	add("{\"term\":\"unperson\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10381224\"]}");
	add("{\"term\":\"unpersuasiveness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05212488\"]}");
	add("{\"term\":\"unpleasantness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04786888\", \"07509927\"]}");
	add("{\"term\":\"unpleasingness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04698264\"]}");
	add("{\"term\":\"unpointedness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05078895\"]}");
	add("{\"term\":\"unpopularity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04816341\"]}");
	add("{\"term\":\"unpredictability\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04765568\", \"04873902\", \"04742315\"]}");
	add("{\"term\":\"unpretentiousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04794382\"]}");
	add("{\"term\":\"unproductiveness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05155786\"]}");
	add("{\"term\":\"unprofitability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05173060\"]}");
	add("{\"term\":\"unprofitableness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05173060\"]}");
	add("{\"term\":\"unpropitiousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05169744\"]}");
	add("{\"term\":\"unprotectedness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05050245\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }