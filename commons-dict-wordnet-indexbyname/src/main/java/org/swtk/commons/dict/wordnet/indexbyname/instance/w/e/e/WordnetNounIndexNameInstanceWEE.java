package org.swtk.commons.dict.wordnet.indexbyname.instance.w.e.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceWEE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"wee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15271069\"]}");
	add("{\"term\":\"weed\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03997192\", \"04577966\", \"13105873\"]}");
	add("{\"term\":\"weeder\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04577702\", \"10792605\"]}");
	add("{\"term\":\"weedkiller\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14931001\"]}");
	add("{\"term\":\"weeds\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04577818\"]}");
	add("{\"term\":\"week\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"15161099\", \"15160948\", \"15194920\"]}");
	add("{\"term\":\"weekday\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15188204\"]}");
	add("{\"term\":\"weekend\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15195551\"]}");
	add("{\"term\":\"weekender\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04578101\", \"10792140\"]}");
	add("{\"term\":\"weekly\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06606462\"]}");
	add("{\"term\":\"weeknight\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15192722\"]}");
	add("{\"term\":\"weeness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05114228\"]}");
	add("{\"term\":\"weenie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07692347\"]}");
	add("{\"term\":\"weeper\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10792708\", \"10792794\"]}");
	add("{\"term\":\"weepiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07549666\"]}");
	add("{\"term\":\"weeping\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00869874\"]}");
	add("{\"term\":\"weevil\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02180624\"]}");
	add("{\"term\":\"weewee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14879875\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }