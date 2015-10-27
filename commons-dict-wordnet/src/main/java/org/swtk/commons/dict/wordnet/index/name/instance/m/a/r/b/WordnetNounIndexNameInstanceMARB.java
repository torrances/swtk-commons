package org.swtk.commons.dict.wordnet.index.name.instance.m.a.r.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMARB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"marble\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03726660\", \"03726538\", \"14971945\"]}");
	add("{\"term\":\"marbleisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04958363\"]}");
	add("{\"term\":\"marbleising\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04958363\"]}");
	add("{\"term\":\"marbleization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04958363\"]}");
	add("{\"term\":\"marbleizing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04958363\"]}");
	add("{\"term\":\"marbles\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05629979\", \"00487369\"]}");
	add("{\"term\":\"marblewood\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12791652\", \"12791845\"]}");
	add("{\"term\":\"marbling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07688328\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }