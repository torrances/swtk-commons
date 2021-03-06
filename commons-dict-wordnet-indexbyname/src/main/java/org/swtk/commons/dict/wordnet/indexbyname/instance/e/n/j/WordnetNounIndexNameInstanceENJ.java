package org.swtk.commons.dict.wordnet.indexbyname.instance.e.n.j;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceENJ {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"enjambement\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07099402\"]}");
	add("{\"term\":\"enjambment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07099402\"]}");
	add("{\"term\":\"enjoining\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06554821\"]}");
	add("{\"term\":\"enjoinment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06554821\"]}");
	add("{\"term\":\"enjoyableness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04786575\"]}");
	add("{\"term\":\"enjoyer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10078219\"]}");
	add("{\"term\":\"enjoyment\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05197374\", \"01073996\", \"07506848\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }