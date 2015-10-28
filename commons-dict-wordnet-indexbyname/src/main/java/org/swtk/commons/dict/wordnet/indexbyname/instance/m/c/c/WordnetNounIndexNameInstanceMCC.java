package org.swtk.commons.dict.wordnet.indexbyname.instance.m.c.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMCC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"mccarthy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11187585\", \"11187782\"]}");
	add("{\"term\":\"mccarthyism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00427391\"]}");
	add("{\"term\":\"mccartney\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11187942\"]}");
	add("{\"term\":\"mccauley\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11188208\"]}");
	add("{\"term\":\"mccormick\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11188503\", \"11188635\"]}");
	add("{\"term\":\"mccullers\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11188829\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }