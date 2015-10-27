package org.swtk.commons.dict.wordnet.index.name.instance.c.r.a.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCRAT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"crataegus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12646791\"]}");
	add("{\"term\":\"crate\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13788777\", \"03132576\"]}");
	add("{\"term\":\"crateful\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13788777\"]}");
	add("{\"term\":\"crater\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09282125\", \"09282282\", \"09495543\"]}");
	add("{\"term\":\"crateva\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11887411\"]}");
	add("{\"term\":\"craton\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09282406\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }