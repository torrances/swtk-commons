package org.swtk.commons.dict.wordnet.indexbyname.instance.e.r.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceERE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"erebus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09582702\"]}");
	add("{\"term\":\"erecting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00913583\"]}");
	add("{\"term\":\"erection\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00913583\", \"03300069\", \"14061667\"]}");
	add("{\"term\":\"erectness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05086845\", \"05090261\"]}");
	add("{\"term\":\"eremite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10538538\"]}");
	add("{\"term\":\"eremitism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04889633\"]}");
	add("{\"term\":\"ereshkigal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09541280\"]}");
	add("{\"term\":\"ereshkigel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09541280\"]}");
	add("{\"term\":\"erethism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14117205\"]}");
	add("{\"term\":\"erethizon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02350688\"]}");
	add("{\"term\":\"erethizontidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02350517\"]}");
	add("{\"term\":\"eretmochelys\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01667503\"]}");
	add("{\"term\":\"erewhon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07297770\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }