package org.swtk.commons.dict.wordnet.index.name.instance.j.u.s.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceJUST {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"justice\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"08152324\", \"10244889\", \"00695934\", \"04857348\"]}");
	add("{\"term\":\"justiciar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10248262\"]}");
	add("{\"term\":\"justiciary\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08604641\", \"10248262\"]}");
	add("{\"term\":\"justification\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01244332\", \"06752932\", \"05831414\"]}");
	add("{\"term\":\"justifier\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09817975\"]}");
	add("{\"term\":\"justinian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11115113\"]}");
	add("{\"term\":\"justness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04857348\", \"04721129\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }