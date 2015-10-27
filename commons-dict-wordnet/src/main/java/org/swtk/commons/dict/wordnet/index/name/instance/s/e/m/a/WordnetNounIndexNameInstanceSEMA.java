package org.swtk.commons.dict.wordnet.index.name.instance.s.e.m.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSEMA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"semanticist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10597272\"]}");
	add("{\"term\":\"semantics\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05929245\", \"06189508\"]}");
	add("{\"term\":\"semaphore\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04178269\"]}");
	add("{\"term\":\"semarang\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08930003\"]}");
	add("{\"term\":\"semasiology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06190264\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }