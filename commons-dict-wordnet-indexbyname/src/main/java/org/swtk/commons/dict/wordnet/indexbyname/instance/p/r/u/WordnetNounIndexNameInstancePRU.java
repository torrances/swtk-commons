package org.swtk.commons.dict.wordnet.indexbyname.instance.p.r.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePRU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"prude\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10506611\"]}");
	add("{\"term\":\"prudence\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05623283\", \"04899989\"]}");
	add("{\"term\":\"prudery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04908329\"]}");
	add("{\"term\":\"prudishness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04908329\"]}");
	add("{\"term\":\"prumnopitys\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11678555\"]}");
	add("{\"term\":\"prune\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07768578\"]}");
	add("{\"term\":\"prunella\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01529696\", \"12883786\"]}");
	add("{\"term\":\"prunellidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01529566\"]}");
	add("{\"term\":\"pruner\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04022634\", \"10506767\"]}");
	add("{\"term\":\"pruning\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00360969\", \"09423360\"]}");
	add("{\"term\":\"pruno\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07938539\"]}");
	add("{\"term\":\"prunus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12658490\"]}");
	add("{\"term\":\"prurience\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07505354\"]}");
	add("{\"term\":\"pruriency\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07505354\"]}");
	add("{\"term\":\"prurigo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14255122\"]}");
	add("{\"term\":\"pruritus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05731756\"]}");
	add("{\"term\":\"prussia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08793617\"]}");
	add("{\"term\":\"prussian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09767979\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }