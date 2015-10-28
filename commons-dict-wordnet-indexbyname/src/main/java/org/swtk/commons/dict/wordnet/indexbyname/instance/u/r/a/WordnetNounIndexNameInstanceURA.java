package org.swtk.commons.dict.wordnet.indexbyname.instance.u.r.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceURA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"uracil\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15108924\"]}");
	add("{\"term\":\"uraemia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14234453\"]}");
	add("{\"term\":\"uralic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06968869\"]}");
	add("{\"term\":\"urals\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09490315\"]}");
	add("{\"term\":\"uranalysis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00647575\"]}");
	add("{\"term\":\"urania\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09578256\", \"09590438\"]}");
	add("{\"term\":\"uraninite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15109112\"]}");
	add("{\"term\":\"uranium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14684622\"]}");
	add("{\"term\":\"uranologist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09837748\"]}");
	add("{\"term\":\"uranology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06104629\"]}");
	add("{\"term\":\"uranoplasty\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00695831\"]}");
	add("{\"term\":\"uranoscopidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02614397\"]}");
	add("{\"term\":\"uranus\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09490547\", \"09591180\"]}");
	add("{\"term\":\"uranyl\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15109566\"]}");
	add("{\"term\":\"urarthritis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14212286\"]}");
	add("{\"term\":\"urate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15110403\"]}");
	add("{\"term\":\"uratemia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14595898\"]}");
	add("{\"term\":\"uraturia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14596048\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }