package org.swtk.commons.dict.wordnet.indexbyname.instance.a.r.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceARS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"arse\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05545848\", \"05566889\"]}");
	add("{\"term\":\"arsehole\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05545848\"]}");
	add("{\"term\":\"arsenal\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02744372\", \"02746212\", \"02746431\"]}");
	add("{\"term\":\"arsenate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14634439\"]}");
	add("{\"term\":\"arsenic\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14653327\", \"14792380\"]}");
	add("{\"term\":\"arsenical\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14626899\"]}");
	add("{\"term\":\"arsenide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14634621\"]}");
	add("{\"term\":\"arsenopyrite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14691507\"]}");
	add("{\"term\":\"arsine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14780379\"]}");
	add("{\"term\":\"arson\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00379104\"]}");
	add("{\"term\":\"arsonist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09830112\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }