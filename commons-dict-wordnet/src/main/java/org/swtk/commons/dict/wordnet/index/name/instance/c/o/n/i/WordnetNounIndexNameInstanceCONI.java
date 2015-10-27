package org.swtk.commons.dict.wordnet.index.name.instance.c.o.n.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCONI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"conic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13895614\"]}");
	add("{\"term\":\"conidiophore\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11569589\"]}");
	add("{\"term\":\"conidiospore\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11569460\"]}");
	add("{\"term\":\"conidium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11569460\"]}");
	add("{\"term\":\"conifer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13129600\"]}");
	add("{\"term\":\"coniferales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11627843\"]}");
	add("{\"term\":\"coniferophyta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11626159\"]}");
	add("{\"term\":\"coniferophytina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11626159\"]}");
	add("{\"term\":\"coniferopsida\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11626159\"]}");
	add("{\"term\":\"conilurus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02336989\"]}");
	add("{\"term\":\"conima\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14844811\"]}");
	add("{\"term\":\"coniogramme\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13230545\"]}");
	add("{\"term\":\"conium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12956217\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }