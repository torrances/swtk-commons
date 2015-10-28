package org.swtk.commons.dict.wordnet.indexbyname.instance.r.e.w;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceREW {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"reward\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"05150110\", \"07180932\", \"01222041\", \"13304787\", \"07310247\"]}");
	add("{\"term\":\"rewording\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06440815\"]}");
	add("{\"term\":\"rewrite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06375556\"]}");
	add("{\"term\":\"rewriter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10532713\"]}");
	add("{\"term\":\"rewriting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06440462\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }