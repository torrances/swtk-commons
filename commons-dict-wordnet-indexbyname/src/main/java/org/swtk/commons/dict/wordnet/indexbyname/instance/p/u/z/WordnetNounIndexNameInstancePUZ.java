package org.swtk.commons.dict.wordnet.indexbyname.instance.p.u.z;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePUZ {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"puzzle\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04034791\", \"06797496\"]}");
	add("{\"term\":\"puzzlement\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05692835\"]}");
	add("{\"term\":\"puzzler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06797496\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }