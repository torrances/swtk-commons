package org.swtk.commons.dict.wordnet.indexbyname.instance.e.a.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEAT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"eatable\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07572202\"]}");
	add("{\"term\":\"eatage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07817067\"]}");
	add("{\"term\":\"eater\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07724005\", \"10062108\"]}");
	add("{\"term\":\"eatery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04088393\"]}");
	add("{\"term\":\"eating\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00840028\"]}");
	add("{\"term\":\"eating apple\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07755482\"]}");
	add("{\"term\":\"eating away\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13496741\"]}");
	add("{\"term\":\"eating disorder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14079105\"]}");
	add("{\"term\":\"eating house\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04088393\"]}");
	add("{\"term\":\"eating place\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04088393\"]}");
	add("{\"term\":\"eating utensil\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03158041\"]}");
	add("{\"term\":\"eats\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07580726\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }