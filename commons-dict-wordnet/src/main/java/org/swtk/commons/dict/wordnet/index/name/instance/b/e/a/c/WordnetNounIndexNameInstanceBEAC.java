package org.swtk.commons.dict.wordnet.index.name.instance.b.e.a.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBEAC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"beach\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09240137\"]}");
	add("{\"term\":\"beachball\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02817359\"]}");
	add("{\"term\":\"beachcomber\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09864093\"]}");
	add("{\"term\":\"beachfront\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09240321\"]}");
	add("{\"term\":\"beachhead\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00037020\", \"08707187\"]}");
	add("{\"term\":\"beachwear\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02817909\"]}");
	add("{\"term\":\"beacon\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02817995\", \"04049010\", \"07278881\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }