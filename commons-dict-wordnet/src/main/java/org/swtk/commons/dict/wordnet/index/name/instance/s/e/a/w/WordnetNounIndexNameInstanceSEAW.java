package org.swtk.commons.dict.wordnet.index.name.instance.s.e.a.w;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSEAW {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"seawall\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02897867\"]}");
	add("{\"term\":\"seaward\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13852283\"]}");
	add("{\"term\":\"seawater\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15033414\"]}");
	add("{\"term\":\"seaway\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04170425\"]}");
	add("{\"term\":\"seaweed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01400138\"]}");
	add("{\"term\":\"seaworthiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14570638\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }