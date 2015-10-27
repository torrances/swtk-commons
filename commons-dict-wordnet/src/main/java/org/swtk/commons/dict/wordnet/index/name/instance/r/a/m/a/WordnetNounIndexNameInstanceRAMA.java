package org.swtk.commons.dict.wordnet.index.name.instance.r.a.m.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRAMA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"rama\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09553999\"]}");
	add("{\"term\":\"ramachandra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09554318\"]}");
	add("{\"term\":\"ramadan\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01245636\", \"15243068\"]}");
	add("{\"term\":\"ramalina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13011010\"]}");
	add("{\"term\":\"ramanavami\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15244670\"]}");
	add("{\"term\":\"ramayana\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06475694\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }