package org.swtk.commons.dict.wordnet.index.name.instance.p.r.i.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePRIA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"priacanthidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02573931\"]}");
	add("{\"term\":\"priacanthus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02574117\"]}");
	add("{\"term\":\"priam\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11266245\"]}");
	add("{\"term\":\"priapism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14234046\"]}");
	add("{\"term\":\"priapus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09593972\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }