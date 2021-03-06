package org.swtk.commons.dict.wordnet.indexbyname.instance.j.e.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceJEL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"jellaba\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03600248\"]}");
	add("{\"term\":\"jello\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07629424\"]}");
	add("{\"term\":\"jelly\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"14949336\", \"07658915\", \"07659590\"]}");
	add("{\"term\":\"jelly bean\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07622278\"]}");
	add("{\"term\":\"jelly doughnut\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07654953\"]}");
	add("{\"term\":\"jelly egg\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07622278\"]}");
	add("{\"term\":\"jelly fungus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13080950\"]}");
	add("{\"term\":\"jelly roll morton\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11213048\"]}");
	add("{\"term\":\"jellyfish\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01913388\", \"01915807\"]}");
	add("{\"term\":\"jellyleaf\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12207071\"]}");
	add("{\"term\":\"jellyroll\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07647966\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }