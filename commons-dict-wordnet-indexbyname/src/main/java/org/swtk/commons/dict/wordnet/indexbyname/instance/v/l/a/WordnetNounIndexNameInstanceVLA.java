package org.swtk.commons.dict.wordnet.indexbyname.instance.v.l.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceVLA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"vladimir horowitz\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11080932\"]}");
	add("{\"term\":\"vladimir ilich lenin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11146480\"]}");
	add("{\"term\":\"vladimir ilich ulyanov\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11146480\"]}");
	add("{\"term\":\"vladimir ilyich lenin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11146480\"]}");
	add("{\"term\":\"vladimir ilyich ulyanov\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11146480\"]}");
	add("{\"term\":\"vladimir kosma zworykin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11428409\"]}");
	add("{\"term\":\"vladimir lenin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11146480\"]}");
	add("{\"term\":\"vladimir nabokov\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11218971\"]}");
	add("{\"term\":\"vladimir putin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11269312\"]}");
	add("{\"term\":\"vladimir vladimirovich mayakovski\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11186722\"]}");
	add("{\"term\":\"vladimir vladimirovich nabokov\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11218971\"]}");
	add("{\"term\":\"vladimir vladimirovich putin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11269312\"]}");
	add("{\"term\":\"vladivostok\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09033040\"]}");
	add("{\"term\":\"vlaminck\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11388235\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }