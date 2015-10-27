package org.swtk.commons.dict.wordnet.index.name.instance.s.e.a.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSEAT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"seat\", \"synsetCount\":9, \"upperType\":\"NOUN\", \"ids\":[\"04169494\", \"04169660\", \"05197214\", \"08507049\", \"08665520\", \"04168419\", \"04169042\", \"05566889\", \"08665191\"]}");
	add("{\"term\":\"seatbelt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04169767\"]}");
	add("{\"term\":\"seating\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01213189\", \"04170059\"]}");
	add("{\"term\":\"seats\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04170059\"]}");
	add("{\"term\":\"seattle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09176941\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }