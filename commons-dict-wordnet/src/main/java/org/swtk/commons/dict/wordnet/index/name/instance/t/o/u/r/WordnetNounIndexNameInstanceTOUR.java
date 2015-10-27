package org.swtk.commons.dict.wordnet.index.name.instance.t.o.u.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTOUR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tour\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"15318833\", \"15317305\", \"00311492\"]}");
	add("{\"term\":\"touraco\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01827919\"]}");
	add("{\"term\":\"tourer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04466357\", \"10737780\"]}");
	add("{\"term\":\"tourette\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11366563\"]}");
	add("{\"term\":\"tourism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00298987\"]}");
	add("{\"term\":\"tourist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10737780\"]}");
	add("{\"term\":\"touristry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00298987\"]}");
	add("{\"term\":\"tourmaline\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15101186\"]}");
	add("{\"term\":\"tournament\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07487467\", \"07479682\"]}");
	add("{\"term\":\"tournedos\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07676335\"]}");
	add("{\"term\":\"tourney\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07479682\"]}");
	add("{\"term\":\"tourniquet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03086660\"]}");
	add("{\"term\":\"tours\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08958124\"]}");
	add("{\"term\":\"tourtiere\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07888357\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }