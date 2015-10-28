package org.swtk.commons.dict.wordnet.indexbyname.instance.o.n.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceONE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"one\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05878677\", \"13764713\"]}");
	add("{\"term\":\"onega\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09355504\"]}");
	add("{\"term\":\"oneida\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06929281\", \"09683704\"]}");
	add("{\"term\":\"oneirism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05777468\"]}");
	add("{\"term\":\"oneiromancer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10397431\"]}");
	add("{\"term\":\"oneiromancy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05785596\"]}");
	add("{\"term\":\"oneness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04750610\"]}");
	add("{\"term\":\"onerousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04718307\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }