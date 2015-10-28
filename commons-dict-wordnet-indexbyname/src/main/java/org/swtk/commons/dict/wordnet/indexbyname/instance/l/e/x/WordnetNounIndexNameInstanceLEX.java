package org.swtk.commons.dict.wordnet.indexbyname.instance.l.e.x;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLEX {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lexeme\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06317024\"]}");
	add("{\"term\":\"lexicalisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13528675\"]}");
	add("{\"term\":\"lexicalization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13528675\"]}");
	add("{\"term\":\"lexicographer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10275777\"]}");
	add("{\"term\":\"lexicography\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00933536\"]}");
	add("{\"term\":\"lexicologist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10275777\"]}");
	add("{\"term\":\"lexicology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06188528\"]}");
	add("{\"term\":\"lexicon\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06430544\", \"05659087\"]}");
	add("{\"term\":\"lexicostatistics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06189290\"]}");
	add("{\"term\":\"lexington\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01286428\", \"09112347\", \"09119875\"]}");
	add("{\"term\":\"lexis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05658913\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }