package org.swtk.commons.dict.wordnet.indexbyname.instance.a.s.y;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceASY {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"asylum\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03752065\", \"04078214\"]}");
	add("{\"term\":\"asymmetry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05072886\"]}");
	add("{\"term\":\"asymptote\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13893574\"]}");
	add("{\"term\":\"asynchronism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13868035\"]}");
	add("{\"term\":\"asynchronous operation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13456550\"]}");
	add("{\"term\":\"asynchronous transfer mode\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06289724\"]}");
	add("{\"term\":\"asynchrony\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13868035\"]}");
	add("{\"term\":\"asynclitism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14072580\"]}");
	add("{\"term\":\"asyndeton\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07113801\"]}");
	add("{\"term\":\"asynergia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14047862\"]}");
	add("{\"term\":\"asynergy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14047862\"]}");
	add("{\"term\":\"asystole\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14048052\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }