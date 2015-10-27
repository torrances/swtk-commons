package org.swtk.commons.dict.wordnet.index.name.instance.t.e.n.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTENN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tenner\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13416580\", \"13768652\"]}");
	add("{\"term\":\"tennessean\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09765063\"]}");
	add("{\"term\":\"tennessee\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09478770\", \"09162870\"]}");
	add("{\"term\":\"tenniel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11355221\"]}");
	add("{\"term\":\"tennis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00483309\"]}");
	add("{\"term\":\"tenno\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10334875\"]}");
	add("{\"term\":\"tennyson\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11355325\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }