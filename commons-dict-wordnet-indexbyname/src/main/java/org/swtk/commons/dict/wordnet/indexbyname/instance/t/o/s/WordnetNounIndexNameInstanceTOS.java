package org.swtk.commons.dict.wordnet.indexbyname.instance.t.o.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTOS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"toscana\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08829834\"]}");
	add("{\"term\":\"toscanini\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11366252\"]}");
	add("{\"term\":\"tosh\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06623500\"]}");
	add("{\"term\":\"tosk\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06955312\"]}");
	add("{\"term\":\"tosk dialect\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06955312\"]}");
	add("{\"term\":\"toss\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00346643\", \"00106640\", \"01248633\"]}");
	add("{\"term\":\"toss bombing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00981434\"]}");
	add("{\"term\":\"tossed salad\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07822609\"]}");
	add("{\"term\":\"tosser\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10736704\", \"10736845\"]}");
	add("{\"term\":\"tossup\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11540232\"]}");
	add("{\"term\":\"tostada\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07897285\", \"07897379\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }