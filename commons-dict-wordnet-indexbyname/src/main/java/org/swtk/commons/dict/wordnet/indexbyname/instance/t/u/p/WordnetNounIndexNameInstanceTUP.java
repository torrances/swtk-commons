package org.swtk.commons.dict.wordnet.indexbyname.instance.t.u.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTUP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tup\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02414726\"]}");
	add("{\"term\":\"tupaia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02497730\"]}");
	add("{\"term\":\"tupaiidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02497497\"]}");
	add("{\"term\":\"tupek\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04505570\"]}");
	add("{\"term\":\"tupelo\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09128006\", \"12360900\", \"12361515\"]}");
	add("{\"term\":\"tupi\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06930273\", \"09714528\"]}");
	add("{\"term\":\"tupik\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04505570\"]}");
	add("{\"term\":\"tupinambis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01689650\"]}");
	add("{\"term\":\"tuppence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13412136\"]}");
	add("{\"term\":\"tupungatito\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09200146\"]}");
	add("{\"term\":\"tupungato\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09486851\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }