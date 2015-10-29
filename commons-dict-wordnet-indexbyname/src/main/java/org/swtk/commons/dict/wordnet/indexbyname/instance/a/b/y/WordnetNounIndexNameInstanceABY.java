package org.swtk.commons.dict.wordnet.indexbyname.instance.a.b.y;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceABY {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"aby moritz warburg\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11393545\"]}");
	add("{\"term\":\"aby warburg\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11393545\"]}");
	add("{\"term\":\"abydos\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09062774\"]}");
	add("{\"term\":\"abyla\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09344600\"]}");
	add("{\"term\":\"abysm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09209256\"]}");
	add("{\"term\":\"abyss\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09209256\"]}");
	add("{\"term\":\"abyssal zone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09209489\"]}");
	add("{\"term\":\"abyssinia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08795913\"]}");
	add("{\"term\":\"abyssinian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02126965\"]}");
	add("{\"term\":\"abyssinian banana\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12374271\"]}");
	add("{\"term\":\"abyssinian cat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02126965\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }