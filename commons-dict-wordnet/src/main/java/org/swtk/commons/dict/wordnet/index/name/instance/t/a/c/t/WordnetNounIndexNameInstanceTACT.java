package org.swtk.commons.dict.wordnet.index.name.instance.t.a.c.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTACT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tact\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04849041\"]}");
	add("{\"term\":\"tactfulness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04849041\"]}");
	add("{\"term\":\"tactic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05913746\"]}");
	add("{\"term\":\"tactician\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10707852\"]}");
	add("{\"term\":\"tactics\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05913746\", \"06259098\"]}");
	add("{\"term\":\"tactility\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05729937\"]}");
	add("{\"term\":\"tactlessness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04853474\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }