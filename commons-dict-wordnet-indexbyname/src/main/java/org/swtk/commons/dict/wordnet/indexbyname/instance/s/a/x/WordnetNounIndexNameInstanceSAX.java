package org.swtk.commons.dict.wordnet.indexbyname.instance.s.a.x;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSAX {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sax\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04148141\", \"11303148\"]}");
	add("{\"term\":\"saxe\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08787012\", \"11303290\"]}");
	add("{\"term\":\"saxegothea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11679519\"]}");
	add("{\"term\":\"saxhorn\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04148263\"]}");
	add("{\"term\":\"saxicola\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01563152\"]}");
	add("{\"term\":\"saxifraga\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12813398\"]}");
	add("{\"term\":\"saxifragaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12812801\"]}");
	add("{\"term\":\"saxifrage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12813775\"]}");
	add("{\"term\":\"saxist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10573671\"]}");
	add("{\"term\":\"saxitoxin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15044864\"]}");
	add("{\"term\":\"saxon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09722232\"]}");
	add("{\"term\":\"saxony\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08787012\"]}");
	add("{\"term\":\"saxophone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04148141\"]}");
	add("{\"term\":\"saxophonist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10573671\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }