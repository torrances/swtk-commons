package org.swtk.commons.dict.wordnet.index.name.instance.k.e.y.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceKEYN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"keynes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11123387\"]}");
	add("{\"term\":\"keynesian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10249653\"]}");
	add("{\"term\":\"keynesianism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06004258\"]}");
	add("{\"term\":\"keynote\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06870776\", \"05934681\", \"07254938\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }