package org.swtk.commons.dict.wordnet.indexbyname.instance.a.p.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAPA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"apache\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06932210\", \"09630238\", \"09669631\"]}");
	add("{\"term\":\"apadana\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02729135\"]}");
	add("{\"term\":\"apalachicola\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09223527\"]}");
	add("{\"term\":\"apanage\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13275342\", \"13319310\"]}");
	add("{\"term\":\"apar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02457766\"]}");
	add("{\"term\":\"apartheid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06671913\"]}");
	add("{\"term\":\"apartment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02729230\"]}");
	add("{\"term\":\"apathy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04643967\", \"07498762\"]}");
	add("{\"term\":\"apatite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14690689\"]}");
	add("{\"term\":\"apatosaur\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01712125\"]}");
	add("{\"term\":\"apatosaurus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01712125\"]}");
	add("{\"term\":\"apatura\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02281356\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }