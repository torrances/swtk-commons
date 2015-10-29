package org.swtk.commons.dict.wordnet.indexbyname.instance.a.u.x;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAUX {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"auxesis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13457855\"]}");
	add("{\"term\":\"auxiliary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09799690\"]}");
	add("{\"term\":\"auxiliary airfield\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02765614\"]}");
	add("{\"term\":\"auxiliary boiler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02765730\"]}");
	add("{\"term\":\"auxiliary cell\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08376508\"]}");
	add("{\"term\":\"auxiliary engine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02765914\"]}");
	add("{\"term\":\"auxiliary equipment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03847897\"]}");
	add("{\"term\":\"auxiliary operation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13457982\"]}");
	add("{\"term\":\"auxiliary pump\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02766088\"]}");
	add("{\"term\":\"auxiliary research submarine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02766203\"]}");
	add("{\"term\":\"auxiliary storage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02766311\"]}");
	add("{\"term\":\"auxiliary verb\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06329506\"]}");
	add("{\"term\":\"auxin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14769236\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }