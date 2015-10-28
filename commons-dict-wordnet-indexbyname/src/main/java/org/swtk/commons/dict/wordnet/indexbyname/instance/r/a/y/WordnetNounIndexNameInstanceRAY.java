package org.swtk.commons.dict.wordnet.indexbyname.instance.r.a.y;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRAY {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ray\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"01498342\", \"01903360\", \"06881495\", \"11448493\", \"13936442\", \"13152275\", \"11448137\"]}");
	add("{\"term\":\"rayleigh\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11275201\"]}");
	add("{\"term\":\"rayon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04064044\"]}");
	add("{\"term\":\"rayons\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03842496\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }