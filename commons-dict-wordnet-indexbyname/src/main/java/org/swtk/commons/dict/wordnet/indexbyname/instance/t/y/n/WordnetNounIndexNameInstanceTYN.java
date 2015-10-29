package org.swtk.commons.dict.wordnet.indexbyname.instance.t.y.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTYN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tyndale\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11374328\"]}");
	add("{\"term\":\"tyndall\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11374738\"]}");
	add("{\"term\":\"tyndall effect\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11548878\"]}");
	add("{\"term\":\"tyne\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09487935\"]}");
	add("{\"term\":\"tyne river\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09487935\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }