package org.swtk.commons.dict.wordnet.index.name.instance.k.a.l.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceKALA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"kalahari\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09193191\"]}");
	add("{\"term\":\"kalamazoo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09123833\"]}");
	add("{\"term\":\"kalansuwa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03612740\"]}");
	add("{\"term\":\"kalantas\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12721117\"]}");
	add("{\"term\":\"kalapooia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09677959\"]}");
	add("{\"term\":\"kalapooian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06937880\"]}");
	add("{\"term\":\"kalapuya\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09677959\"]}");
	add("{\"term\":\"kalapuyan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06937880\"]}");
	add("{\"term\":\"kalashnikov\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03612872\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }