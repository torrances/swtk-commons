package org.swtk.commons.dict.wordnet.indexbyname.instance.d.e.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDEE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"deed\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00030657\", \"06557128\"]}");
	add("{\"term\":\"deedbox\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04347828\"]}");
	add("{\"term\":\"deeds\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00578394\"]}");
	add("{\"term\":\"deep\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09286717\", \"09484445\", \"15292202\"]}");
	add("{\"term\":\"deepening\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13480171\"]}");
	add("{\"term\":\"deepfreeze\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03175301\"]}");
	add("{\"term\":\"deepness\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04993663\", \"05141812\", \"05142145\", \"05621745\"]}");
	add("{\"term\":\"deer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02432691\"]}");
	add("{\"term\":\"deerberry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12269811\"]}");
	add("{\"term\":\"deere\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10946855\"]}");
	add("{\"term\":\"deerhound\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02094654\"]}");
	add("{\"term\":\"deerskin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14786665\"]}");
	add("{\"term\":\"deerstalker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03175538\"]}");
	add("{\"term\":\"deerstalking\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00712980\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }