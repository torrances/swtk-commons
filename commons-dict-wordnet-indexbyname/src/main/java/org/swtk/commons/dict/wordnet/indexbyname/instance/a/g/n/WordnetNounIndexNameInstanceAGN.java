package org.swtk.commons.dict.wordnet.indexbyname.instance.a.g.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAGN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"agnail\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05592396\"]}");
	add("{\"term\":\"agnate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10256360\"]}");
	add("{\"term\":\"agnatha\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01476631\"]}");
	add("{\"term\":\"agnathan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01476924\"]}");
	add("{\"term\":\"agnation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13837110\"]}");
	add("{\"term\":\"agnes de mille\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10949637\"]}");
	add("{\"term\":\"agnes george de mille\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10949637\"]}");
	add("{\"term\":\"agnes gonxha bojaxhiu\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11355873\"]}");
	add("{\"term\":\"agni\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09547398\"]}");
	add("{\"term\":\"agnomen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06345388\"]}");
	add("{\"term\":\"agnosia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14123415\"]}");
	add("{\"term\":\"agnostic\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09798368\", \"09798565\"]}");
	add("{\"term\":\"agnosticism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05988918\", \"06232435\"]}");
	add("{\"term\":\"agnus dei\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06467946\", \"06896324\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }