package org.swtk.commons.dict.wordnet.index.name.instance.c.h.i.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCHIT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"chit\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06529933\", \"09938909\"]}");
	add("{\"term\":\"chitchat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07149788\"]}");
	add("{\"term\":\"chitin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14756901\"]}");
	add("{\"term\":\"chitlings\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07687467\"]}");
	add("{\"term\":\"chitlins\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07687467\"]}");
	add("{\"term\":\"chiton\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01957725\", \"03024804\"]}");
	add("{\"term\":\"chittagong\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08868364\"]}");
	add("{\"term\":\"chittamwood\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"12781076\", \"12793902\", \"13162341\"]}");
	add("{\"term\":\"chitterlings\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07687467\"]}");
	add("{\"term\":\"chittimwood\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12793902\", \"13162341\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }