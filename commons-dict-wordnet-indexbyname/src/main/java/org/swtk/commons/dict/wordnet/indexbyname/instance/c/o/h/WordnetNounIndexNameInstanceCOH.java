package org.swtk.commons.dict.wordnet.indexbyname.instance.c.o.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCOH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cohabitation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01056800\"]}");
	add("{\"term\":\"cohan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10924215\"]}");
	add("{\"term\":\"coherence\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04828508\", \"14443868\"]}");
	add("{\"term\":\"coherency\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04828508\", \"14443868\"]}");
	add("{\"term\":\"cohesion\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"11456699\", \"13470887\", \"14443868\"]}");
	add("{\"term\":\"cohesiveness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04943081\", \"14443868\"]}");
	add("{\"term\":\"cohn\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10924391\"]}");
	add("{\"term\":\"coho\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02539495\", \"07812444\"]}");
	add("{\"term\":\"cohoe\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02539495\", \"07812444\"]}");
	add("{\"term\":\"cohort\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07959756\", \"08268025\", \"08268134\"]}");
	add("{\"term\":\"cohosh\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11744239\"]}");
	add("{\"term\":\"cohune\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12613883\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }