package org.swtk.commons.dict.wordnet.index.name.instance.m.u.r.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMURR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"murrain\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14298094\"]}");
	add("{\"term\":\"murray\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09386317\", \"11217089\", \"11217407\"]}");
	add("{\"term\":\"murre\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02049914\"]}");
	add("{\"term\":\"murrow\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11217733\"]}");
	add("{\"term\":\"murrumbidgee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09386517\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }