package org.swtk.commons.dict.wordnet.index.name.instance.j.a.b.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceJABB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"jabber\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06623345\"]}");
	add("{\"term\":\"jabberer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10054510\"]}");
	add("{\"term\":\"jabbering\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06623345\"]}");
	add("{\"term\":\"jabberwocky\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06621649\"]}");
	add("{\"term\":\"jabbing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00335761\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }