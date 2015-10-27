package org.swtk.commons.dict.wordnet.index.name.instance.h.a.y.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHAYM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"haymaker\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00136457\", \"03505843\"]}");
	add("{\"term\":\"haymaking\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00624197\", \"00624292\"]}");
	add("{\"term\":\"haymow\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03505701\", \"13798139\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }