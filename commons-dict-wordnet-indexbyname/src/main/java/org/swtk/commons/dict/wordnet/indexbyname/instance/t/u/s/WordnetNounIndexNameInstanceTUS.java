package org.swtk.commons.dict.wordnet.indexbyname.instance.t.u.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTUS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tuscaloosa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09077260\"]}");
	add("{\"term\":\"tuscan\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06977530\", \"09737092\"]}");
	add("{\"term\":\"tuscany\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08829834\"]}");
	add("{\"term\":\"tuscarora\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06929477\", \"09690614\"]}");
	add("{\"term\":\"tush\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05566889\"]}");
	add("{\"term\":\"tushery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06398847\"]}");
	add("{\"term\":\"tusk\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01468354\", \"14781726\"]}");
	add("{\"term\":\"tuskegee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09077378\"]}");
	add("{\"term\":\"tusker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01873906\"]}");
	add("{\"term\":\"tussah\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02307449\"]}");
	add("{\"term\":\"tussaud\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11373505\"]}");
	add("{\"term\":\"tusseh\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02307449\"]}");
	add("{\"term\":\"tusser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02307449\"]}");
	add("{\"term\":\"tussilago\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12049795\"]}");
	add("{\"term\":\"tussle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01174931\"]}");
	add("{\"term\":\"tussock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07977383\"]}");
	add("{\"term\":\"tussore\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02307449\"]}");
	add("{\"term\":\"tussur\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02307449\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }