package org.swtk.commons.dict.wordnet.indexbyname.instance.n.e.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceNEM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"nematocera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02202364\"]}");
	add("{\"term\":\"nematoda\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01932037\"]}");
	add("{\"term\":\"nematode\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01932753\"]}");
	add("{\"term\":\"nembutal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03919248\"]}");
	add("{\"term\":\"nemea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08806042\"]}");
	add("{\"term\":\"nemertea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01931001\"]}");
	add("{\"term\":\"nemertean\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01931158\"]}");
	add("{\"term\":\"nemertina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01931001\"]}");
	add("{\"term\":\"nemertine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01931158\"]}");
	add("{\"term\":\"nemesis\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14468692\", \"09590550\"]}");
	add("{\"term\":\"nemophila\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12856972\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }