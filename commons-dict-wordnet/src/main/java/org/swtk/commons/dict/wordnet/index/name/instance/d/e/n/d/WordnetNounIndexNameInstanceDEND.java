package org.swtk.commons.dict.wordnet.index.name.instance.d.e.n.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDEND {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"dendranthema\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11981412\"]}");
	add("{\"term\":\"dendraspis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01752069\"]}");
	add("{\"term\":\"dendrite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05477513\"]}");
	add("{\"term\":\"dendroaspis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01752069\"]}");
	add("{\"term\":\"dendrobium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12079815\"]}");
	add("{\"term\":\"dendrocalamus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12169127\"]}");
	add("{\"term\":\"dendrocolaptes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01556952\"]}");
	add("{\"term\":\"dendrocolaptidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01556780\"]}");
	add("{\"term\":\"dendroctonus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02182698\"]}");
	add("{\"term\":\"dendroica\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01571134\"]}");
	add("{\"term\":\"dendrolagus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01882020\"]}");
	add("{\"term\":\"dendrology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06162890\"]}");
	add("{\"term\":\"dendromecon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11925365\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }