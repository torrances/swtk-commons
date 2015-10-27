package org.swtk.commons.dict.wordnet.index.name.instance.g.o.n.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGONG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"gong\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03020822\", \"03452665\"]}");
	add("{\"term\":\"gongora\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11026885\"]}");
	add("{\"term\":\"gongorism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07082364\"]}");
	add("{\"term\":\"gongorist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10157634\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }