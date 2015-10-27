package org.swtk.commons.dict.wordnet.index.name.instance.s.c.a.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSCAN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"scan\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04149614\", \"00645186\"]}");
	add("{\"term\":\"scandal\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07320870\", \"07238471\"]}");
	add("{\"term\":\"scandalisation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01227886\", \"14603034\"]}");
	add("{\"term\":\"scandalization\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01227886\", \"14603034\"]}");
	add("{\"term\":\"scandalmonger\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10574487\"]}");
	add("{\"term\":\"scandalmongering\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07150335\"]}");
	add("{\"term\":\"scandalousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04815768\"]}");
	add("{\"term\":\"scandentia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02497169\"]}");
	add("{\"term\":\"scandinavia\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08778343\", \"08778689\"]}");
	add("{\"term\":\"scandinavian\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06966471\", \"09749546\"]}");
	add("{\"term\":\"scandium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14678010\"]}");
	add("{\"term\":\"scanner\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04149796\", \"04150064\", \"04150205\", \"10574584\"]}");
	add("{\"term\":\"scanning\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00645399\", \"13574286\"]}");
	add("{\"term\":\"scansion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07109174\"]}");
	add("{\"term\":\"scantiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05120762\"]}");
	add("{\"term\":\"scantling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04150430\"]}");
	add("{\"term\":\"scantness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05120762\"]}");
	add("{\"term\":\"scanty\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03890725\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }