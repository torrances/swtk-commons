package org.swtk.commons.dict.wordnet.index.name.instance.r.h.o.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRHOD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"rhodanthe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12028235\"]}");
	add("{\"term\":\"rhodes\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08801664\", \"11279044\"]}");
	add("{\"term\":\"rhodesia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09189894\"]}");
	add("{\"term\":\"rhodium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14676802\"]}");
	add("{\"term\":\"rhodochrosite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14720196\"]}");
	add("{\"term\":\"rhododendron\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12264670\"]}");
	add("{\"term\":\"rhodolite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15025961\"]}");
	add("{\"term\":\"rhodomontade\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07244749\"]}");
	add("{\"term\":\"rhodonite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14720341\"]}");
	add("{\"term\":\"rhodophyceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01416385\"]}");
	add("{\"term\":\"rhodophyta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01416192\"]}");
	add("{\"term\":\"rhodopsin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15113436\"]}");
	add("{\"term\":\"rhodosphaera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12783005\"]}");
	add("{\"term\":\"rhodymenia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01417627\"]}");
	add("{\"term\":\"rhodymeniaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01417482\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }