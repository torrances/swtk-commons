package org.swtk.commons.dict.wordnet.indexbyname.instance.d.e.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDEU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"deuce\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03187461\", \"07140494\", \"13765409\", \"13970452\"]}");
	add("{\"term\":\"deuteranopia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14177650\"]}");
	add("{\"term\":\"deuterium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14665224\"]}");
	add("{\"term\":\"deuteromycetes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13016828\"]}");
	add("{\"term\":\"deuteromycota\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13016484\"]}");
	add("{\"term\":\"deuteromycotina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13016484\"]}");
	add("{\"term\":\"deuteron\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09289193\"]}");
	add("{\"term\":\"deuteronomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06445145\"]}");
	add("{\"term\":\"deutschland\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08784821\"]}");
	add("{\"term\":\"deutschmark\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13710138\"]}");
	add("{\"term\":\"deutzia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12811190\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }