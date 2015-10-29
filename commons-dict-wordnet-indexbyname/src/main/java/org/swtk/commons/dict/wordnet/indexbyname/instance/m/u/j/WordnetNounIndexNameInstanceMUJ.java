package org.swtk.commons.dict.wordnet.indexbyname.instance.m.u.j;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMUJ {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"mujahadeen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08223584\"]}");
	add("{\"term\":\"mujahadein\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08223584\"]}");
	add("{\"term\":\"mujahadin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08223584\"]}");
	add("{\"term\":\"mujahedeen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08223584\"]}");
	add("{\"term\":\"mujahedeen khalq\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08223922\"]}");
	add("{\"term\":\"mujahedeen kompak\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08051332\"]}");
	add("{\"term\":\"mujahedin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08223584\"]}");
	add("{\"term\":\"mujahid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10357502\"]}");
	add("{\"term\":\"mujahideen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08223584\"]}");
	add("{\"term\":\"mujahidin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08223584\"]}");
	add("{\"term\":\"mujik\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10362501\"]}");
	add("{\"term\":\"mujtihad\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10357626\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }