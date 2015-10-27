package org.swtk.commons.dict.wordnet.index.name.instance.s.u.r.f;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSURF {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"surf\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07358833\"]}");
	add("{\"term\":\"surface\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"02691302\", \"05620592\", \"05862014\", \"09474647\", \"08677970\", \"04369112\"]}");
	add("{\"term\":\"surfacing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00061991\"]}");
	add("{\"term\":\"surfactant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15121350\"]}");
	add("{\"term\":\"surfbird\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02029283\"]}");
	add("{\"term\":\"surfboard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04370646\"]}");
	add("{\"term\":\"surfboarder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10698501\"]}");
	add("{\"term\":\"surfboarding\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00446040\"]}");
	add("{\"term\":\"surfboat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04370758\"]}");
	add("{\"term\":\"surfeit\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00843289\", \"05127137\", \"14475760\"]}");
	add("{\"term\":\"surfer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10698501\"]}");
	add("{\"term\":\"surffish\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02573469\", \"02599634\"]}");
	add("{\"term\":\"surfing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00446040\"]}");
	add("{\"term\":\"surfperch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02573469\"]}");
	add("{\"term\":\"surfriding\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00446040\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }