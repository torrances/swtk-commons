package org.swtk.commons.dict.wordnet.index.name.instance.s.h.e.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSHEE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sheen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04961860\"]}");
	add("{\"term\":\"sheeny\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09701518\"]}");
	add("{\"term\":\"sheep\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10607302\", \"10607482\", \"02414351\"]}");
	add("{\"term\":\"sheepcote\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03381005\"]}");
	add("{\"term\":\"sheepdog\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02107175\"]}");
	add("{\"term\":\"sheepfold\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03381005\"]}");
	add("{\"term\":\"sheepherder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10607013\"]}");
	add("{\"term\":\"sheepishness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07522799\"]}");
	add("{\"term\":\"sheepman\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10607013\", \"10607214\"]}");
	add("{\"term\":\"sheeprun\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04195107\"]}");
	add("{\"term\":\"sheepshank\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04194928\"]}");
	add("{\"term\":\"sheepshead\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02594685\"]}");
	add("{\"term\":\"sheepshearing\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00361230\", \"00519611\", \"15263168\"]}");
	add("{\"term\":\"sheepskin\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06490253\", \"14783182\", \"14787687\"]}");
	add("{\"term\":\"sheepwalk\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04195107\"]}");
	add("{\"term\":\"sheesha\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03538194\"]}");
	add("{\"term\":\"sheet\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"04135005\", \"04195411\", \"04195686\", \"06278546\", \"13883265\", \"04195222\", \"06266354\", \"09454964\"]}");
	add("{\"term\":\"sheeting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04196325\"]}");
	add("{\"term\":\"sheetrock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04196859\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }