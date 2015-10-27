package org.swtk.commons.dict.wordnet.index.name.instance.s.p.a.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSPAS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"spasm\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00226974\", \"14383864\"]}");
	add("{\"term\":\"spasmolysis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00355611\"]}");
	add("{\"term\":\"spasmolytic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02727458\"]}");
	add("{\"term\":\"spassky\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11329767\"]}");
	add("{\"term\":\"spastic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10649455\"]}");
	add("{\"term\":\"spasticity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04778977\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }