package org.swtk.commons.dict.wordnet.indexbyname.instance.o.n.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceONT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"on the qui vive\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04671985\"]}");
	add("{\"term\":\"on the road\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00312354\"]}");
	add("{\"term\":\"on tour\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00312354\"]}");
	add("{\"term\":\"ontario\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08846118\", \"09355676\"]}");
	add("{\"term\":\"ontogenesis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13510240\"]}");
	add("{\"term\":\"ontogeny\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13510240\"]}");
	add("{\"term\":\"ontology\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06172563\", \"06172695\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }