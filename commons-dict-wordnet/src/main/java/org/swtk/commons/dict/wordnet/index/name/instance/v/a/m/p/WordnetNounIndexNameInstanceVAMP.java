package org.swtk.commons.dict.wordnet.index.name.instance.v.a.m.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceVAMP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"vamp\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04527315\", \"07045693\", \"09984664\"]}");
	add("{\"term\":\"vamper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09984664\"]}");
	add("{\"term\":\"vampire\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09567238\"]}");
	add("{\"term\":\"vampirism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01270301\", \"05963962\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }