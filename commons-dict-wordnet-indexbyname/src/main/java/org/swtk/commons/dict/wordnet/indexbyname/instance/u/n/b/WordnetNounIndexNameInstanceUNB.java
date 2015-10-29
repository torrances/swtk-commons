package org.swtk.commons.dict.wordnet.indexbyname.instance.u.n.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceUNB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"unbalance\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14421118\", \"14027634\"]}");
	add("{\"term\":\"unbecomingness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04909974\"]}");
	add("{\"term\":\"unbelief\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05988776\"]}");
	add("{\"term\":\"unbounded interval\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06025949\"]}");
	add("{\"term\":\"unboundedness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05216592\"]}");
	add("{\"term\":\"unbreakableness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04947164\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }