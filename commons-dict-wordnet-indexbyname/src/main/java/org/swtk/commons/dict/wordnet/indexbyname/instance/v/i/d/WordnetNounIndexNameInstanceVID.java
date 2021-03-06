package org.swtk.commons.dict.wordnet.indexbyname.instance.v.i.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceVID {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"vidal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11386104\"]}");
	add("{\"term\":\"vidalia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09100613\"]}");
	add("{\"term\":\"vidalia onion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07738411\"]}");
	add("{\"term\":\"vidar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09607393\"]}");
	add("{\"term\":\"video\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"06287933\", \"06288645\", \"04541422\", \"06288456\"]}");
	add("{\"term\":\"video digitizing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13594702\"]}");
	add("{\"term\":\"video display\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03215838\"]}");
	add("{\"term\":\"video equipment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04412675\"]}");
	add("{\"term\":\"video game\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00459914\"]}");
	add("{\"term\":\"video ipod\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03589569\"]}");
	add("{\"term\":\"video recording\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04541422\"]}");
	add("{\"term\":\"videocassette\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04540995\"]}");
	add("{\"term\":\"videocassette recorder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04541097\"]}");
	add("{\"term\":\"videodisc\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04541241\"]}");
	add("{\"term\":\"videodisk\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04541241\"]}");
	add("{\"term\":\"videotape\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04541654\", \"04541815\"]}");
	add("{\"term\":\"vidua\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01545913\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }