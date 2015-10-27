package org.swtk.commons.dict.wordnet.index.name.instance.s.u.b.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSUBP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"subpart\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13833552\"]}");
	add("{\"term\":\"subphylum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08120265\"]}");
	add("{\"term\":\"subpoena\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06569038\"]}");
	add("{\"term\":\"subpopulation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06035916\"]}");
	add("{\"term\":\"subprogram\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06594579\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }