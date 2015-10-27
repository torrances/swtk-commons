package org.swtk.commons.dict.wordnet.index.name.instance.s.c.o.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSCOU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"scoundrel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10773214\"]}");
	add("{\"term\":\"scour\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08665032\"]}");
	add("{\"term\":\"scourer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10581937\", \"10582073\"]}");
	add("{\"term\":\"scourge\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10722264\", \"14468692\", \"04157033\"]}");
	add("{\"term\":\"scourger\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10116733\"]}");
	add("{\"term\":\"scouring\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00252647\", \"00995574\"]}");
	add("{\"term\":\"scours\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14295849\"]}");
	add("{\"term\":\"scouse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07606901\"]}");
	add("{\"term\":\"scouser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09723905\"]}");
	add("{\"term\":\"scout\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"10582177\", \"10582396\", \"10582611\", \"10290913\"]}");
	add("{\"term\":\"scouter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10560541\"]}");
	add("{\"term\":\"scouting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00987192\"]}");
	add("{\"term\":\"scoutmaster\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10582742\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }