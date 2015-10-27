package org.swtk.commons.dict.wordnet.index.name.instance.r.u.b.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRUBE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"rube\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10823706\"]}");
	add("{\"term\":\"rubefacient\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04124183\"]}");
	add("{\"term\":\"rubel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13722161\"]}");
	add("{\"term\":\"rubella\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14146741\"]}");
	add("{\"term\":\"rubens\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11293094\"]}");
	add("{\"term\":\"rubeola\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14146526\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }