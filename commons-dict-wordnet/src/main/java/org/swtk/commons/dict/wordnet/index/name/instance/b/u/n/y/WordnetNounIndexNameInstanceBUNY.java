package org.swtk.commons.dict.wordnet.index.name.instance.b.u.n.y;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBUNY {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"bunyan\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09614329\", \"10891343\"]}");
	add("{\"term\":\"bunyaviridae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01333986\"]}");
	add("{\"term\":\"bunyavirus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01334163\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }