package org.swtk.commons.dict.wordnet.indexbyname.instance.l.y.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLYR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lyra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09367456\"]}");
	add("{\"term\":\"lyrate leaf\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13179503\"]}");
	add("{\"term\":\"lyre\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03704614\"]}");
	add("{\"term\":\"lyre snake\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01742288\"]}");
	add("{\"term\":\"lyrebird\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01548215\"]}");
	add("{\"term\":\"lyreflower\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11930740\"]}");
	add("{\"term\":\"lyric\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06392349\", \"07066015\"]}");
	add("{\"term\":\"lyric poem\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06392349\"]}");
	add("{\"term\":\"lyricality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04990937\"]}");
	add("{\"term\":\"lyricism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04642096\", \"04990937\"]}");
	add("{\"term\":\"lyricist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10297609\"]}");
	add("{\"term\":\"lyrist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10297609\"]}");
	add("{\"term\":\"lyrurus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01798066\"]}");
	add("{\"term\":\"lyrurus mlokosiewiczi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01798541\"]}");
	add("{\"term\":\"lyrurus tetrix\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01798376\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }