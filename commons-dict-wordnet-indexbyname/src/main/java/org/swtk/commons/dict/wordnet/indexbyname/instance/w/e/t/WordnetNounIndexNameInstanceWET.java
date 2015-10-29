package org.swtk.commons.dict.wordnet.indexbyname.instance.w.e.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceWET {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"wet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14559033\"]}");
	add("{\"term\":\"wet bar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04580799\"]}");
	add("{\"term\":\"wet blanket\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10657534\"]}");
	add("{\"term\":\"wet cell\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04581118\"]}");
	add("{\"term\":\"wet dream\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05777153\"]}");
	add("{\"term\":\"wet fly\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04581223\"]}");
	add("{\"term\":\"wet lung\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14078534\"]}");
	add("{\"term\":\"wet nurse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10794538\"]}");
	add("{\"term\":\"wet suit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04581353\"]}");
	add("{\"term\":\"wetback\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09742312\"]}");
	add("{\"term\":\"wether\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02414856\"]}");
	add("{\"term\":\"wetland\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09501020\"]}");
	add("{\"term\":\"wetness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14558298\"]}");
	add("{\"term\":\"wetnurse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10794538\"]}");
	add("{\"term\":\"wetter\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09865994\", \"10794671\", \"15121350\"]}");
	add("{\"term\":\"wetting\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13527930\", \"00278220\"]}");
	add("{\"term\":\"wetting agent\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15121350\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }