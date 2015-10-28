package org.swtk.commons.dict.wordnet.indexbyname.instance.k.a.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceKAM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"kama\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09549942\"]}");
	add("{\"term\":\"kamarupan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06944668\"]}");
	add("{\"term\":\"kamasutra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06636295\"]}");
	add("{\"term\":\"kamba\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07006008\"]}");
	add("{\"term\":\"kameez\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03613136\"]}");
	add("{\"term\":\"kamet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09345836\"]}");
	add("{\"term\":\"kami\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09558366\"]}");
	add("{\"term\":\"kamia\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06935652\", \"09678103\"]}");
	add("{\"term\":\"kamikaze\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10248863\", \"03613287\"]}");
	add("{\"term\":\"kampala\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09066401\"]}");
	add("{\"term\":\"kampong\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08690777\"]}");
	add("{\"term\":\"kampuchea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08734571\"]}");
	add("{\"term\":\"kampuchean\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09715676\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }