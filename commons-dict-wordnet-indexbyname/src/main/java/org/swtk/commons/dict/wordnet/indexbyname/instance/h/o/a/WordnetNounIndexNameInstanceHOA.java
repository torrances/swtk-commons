package org.swtk.commons.dict.wordnet.indexbyname.instance.h.o.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHOA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"hoactzin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01812393\"]}");
	add("{\"term\":\"hoagie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07713570\"]}");
	add("{\"term\":\"hoagland\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11072838\"]}");
	add("{\"term\":\"hoagy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07713570\"]}");
	add("{\"term\":\"hoar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14939773\"]}");
	add("{\"term\":\"hoard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13388085\"]}");
	add("{\"term\":\"hoarder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10198242\"]}");
	add("{\"term\":\"hoarding\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02842339\"]}");
	add("{\"term\":\"hoarfrost\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14939773\"]}");
	add("{\"term\":\"hoariness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04933485\", \"04968760\"]}");
	add("{\"term\":\"hoarseness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04996097\"]}");
	add("{\"term\":\"hoatzin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01812393\"]}");
	add("{\"term\":\"hoax\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00755028\"]}");
	add("{\"term\":\"hoaxer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10483280\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }