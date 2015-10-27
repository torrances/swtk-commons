package org.swtk.commons.dict.wordnet.index.name.instance.g.u.i.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGUIN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"guinea\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01811747\", \"08967092\", \"09735835\", \"13413861\"]}");
	add("{\"term\":\"guinean\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09768717\"]}");
	add("{\"term\":\"guinevere\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11038435\"]}");
	add("{\"term\":\"guinness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07906515\", \"11039265\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }