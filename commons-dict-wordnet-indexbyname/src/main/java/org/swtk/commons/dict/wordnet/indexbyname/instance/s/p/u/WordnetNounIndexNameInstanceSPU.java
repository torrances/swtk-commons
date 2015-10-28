package org.swtk.commons.dict.wordnet.indexbyname.instance.s.p.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSPU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"spud\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04297102\", \"07726361\"]}");
	add("{\"term\":\"spume\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09466545\"]}");
	add("{\"term\":\"spunk\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04864721\", \"15126153\"]}");
	add("{\"term\":\"spur\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"02894671\", \"04297397\", \"13109895\", \"13935854\", \"07267046\"]}");
	add("{\"term\":\"spurge\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12938661\"]}");
	add("{\"term\":\"spuriousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13984119\"]}");
	add("{\"term\":\"spurner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10660949\"]}");
	add("{\"term\":\"spurring\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07267046\"]}");
	add("{\"term\":\"spurt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07450700\"]}");
	add("{\"term\":\"sputnik\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04297753\"]}");
	add("{\"term\":\"sputter\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07144891\", \"07409414\"]}");
	add("{\"term\":\"sputtering\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07409414\"]}");
	add("{\"term\":\"sputum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05423159\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }