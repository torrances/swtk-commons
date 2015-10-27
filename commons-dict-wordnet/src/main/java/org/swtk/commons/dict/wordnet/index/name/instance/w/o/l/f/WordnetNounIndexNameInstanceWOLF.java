package org.swtk.commons.dict.wordnet.index.name.instance.w.o.l.f;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceWOLF {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"wolf\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"09864997\", \"10806873\", \"11414209\", \"11414393\", \"02116752\"]}");
	add("{\"term\":\"wolfbane\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11743921\"]}");
	add("{\"term\":\"wolfe\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11414486\", \"11414652\"]}");
	add("{\"term\":\"wolff\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11414843\"]}");
	add("{\"term\":\"wolffia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11816243\"]}");
	add("{\"term\":\"wolffiella\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11816787\"]}");
	add("{\"term\":\"wolffish\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02546905\", \"02619481\"]}");
	add("{\"term\":\"wolfhound\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02093127\"]}");
	add("{\"term\":\"wolfman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09526253\"]}");
	add("{\"term\":\"wolfram\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14683691\"]}");
	add("{\"term\":\"wolframite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15127793\"]}");
	add("{\"term\":\"wolfsbane\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11743921\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }