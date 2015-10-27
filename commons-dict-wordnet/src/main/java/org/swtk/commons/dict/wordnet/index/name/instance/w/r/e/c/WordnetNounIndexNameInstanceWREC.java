package org.swtk.commons.dict.wordnet.index.name.instance.w.r.e.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceWREC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"wreck\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04613609\", \"07316568\", \"07367675\", \"14447274\"]}");
	add("{\"term\":\"wreckage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04613716\"]}");
	add("{\"term\":\"wrecker\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04468931\", \"10564305\", \"10812496\"]}");
	add("{\"term\":\"wreckfish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02571078\"]}");
	add("{\"term\":\"wrecking\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00218640\", \"07349697\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }