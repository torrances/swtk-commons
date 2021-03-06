package org.swtk.commons.dict.wordnet.indexbyname.instance.n.u.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceNUD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"nuda\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01921740\"]}");
	add("{\"term\":\"nude\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03840838\", \"10385098\", \"14479883\", \"03840737\"]}");
	add("{\"term\":\"nude dancing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00532238\"]}");
	add("{\"term\":\"nude mouse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02335606\"]}");
	add("{\"term\":\"nude painting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03840737\"]}");
	add("{\"term\":\"nude person\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10385098\"]}");
	add("{\"term\":\"nude sculpture\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03840838\"]}");
	add("{\"term\":\"nude statue\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03840838\"]}");
	add("{\"term\":\"nudeness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14479586\"]}");
	add("{\"term\":\"nudge\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00113817\"]}");
	add("{\"term\":\"nudger\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10385213\"]}");
	add("{\"term\":\"nudibranch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01953372\"]}");
	add("{\"term\":\"nudibranchia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01953098\"]}");
	add("{\"term\":\"nudism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01033595\"]}");
	add("{\"term\":\"nudist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10385400\"]}");
	add("{\"term\":\"nudity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14479586\"]}");
	add("{\"term\":\"nudnick\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10385545\"]}");
	add("{\"term\":\"nudnik\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10385545\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }