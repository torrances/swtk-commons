package org.swtk.commons.dict.wordnet.indexbyname.instance.r.u.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRUR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"rural area\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08662297\"]}");
	add("{\"term\":\"rural free delivery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06275795\"]}");
	add("{\"term\":\"ruralism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04927414\", \"07169374\"]}");
	add("{\"term\":\"ruralist\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09990665\", \"10563270\"]}");
	add("{\"term\":\"rurality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04927414\"]}");
	add("{\"term\":\"ruritania\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05639464\"]}");
	add("{\"term\":\"ruritanian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09626841\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }