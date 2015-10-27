package org.swtk.commons.dict.wordnet.index.name.instance.c.a.r.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCARC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"carcajou\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02451814\"]}");
	add("{\"term\":\"carcase\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01761398\"]}");
	add("{\"term\":\"carcass\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01761398\"]}");
	add("{\"term\":\"carcharhinidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01491180\"]}");
	add("{\"term\":\"carcharhinus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01491916\"]}");
	add("{\"term\":\"carcharias\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01489953\"]}");
	add("{\"term\":\"carchariidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01489718\"]}");
	add("{\"term\":\"carcharodon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01487358\"]}");
	add("{\"term\":\"carcinogen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14817982\"]}");
	add("{\"term\":\"carcinoid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14260630\"]}");
	add("{\"term\":\"carcinoma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14265819\"]}");
	add("{\"term\":\"carcinosarcoma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14260833\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }