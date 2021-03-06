package org.swtk.commons.dict.wordnet.indexbyname.instance.k.a.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceKAU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"kauai\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09102400\"]}");
	add("{\"term\":\"kauai island\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09102400\"]}");
	add("{\"term\":\"kaufman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11117615\"]}");
	add("{\"term\":\"kaunas\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09036840\"]}");
	add("{\"term\":\"kaunda\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11117810\"]}");
	add("{\"term\":\"kauri\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"11667999\", \"11668154\", \"14919750\"]}");
	add("{\"term\":\"kauri copal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14919750\"]}");
	add("{\"term\":\"kauri gum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14919750\"]}");
	add("{\"term\":\"kauri pine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11667757\"]}");
	add("{\"term\":\"kauri resin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14919750\"]}");
	add("{\"term\":\"kaury\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11668154\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }