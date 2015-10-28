package org.swtk.commons.dict.wordnet.indexbyname.instance.w.r.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceWRI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"wrick\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14384587\"]}");
	add("{\"term\":\"wriggle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00350531\"]}");
	add("{\"term\":\"wriggler\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02203161\", \"10800912\"]}");
	add("{\"term\":\"wright\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"10813210\", \"11418339\", \"11418484\", \"11418606\", \"11418778\", \"11418950\", \"11419118\"]}");
	add("{\"term\":\"wring\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07365631\"]}");
	add("{\"term\":\"wringer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04614600\"]}");
	add("{\"term\":\"wrinkle\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06261425\", \"06261554\", \"13928798\"]}");
	add("{\"term\":\"wrist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05592578\"]}");
	add("{\"term\":\"wristband\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04563490\", \"04614756\"]}");
	add("{\"term\":\"wristlet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04614890\"]}");
	add("{\"term\":\"wristwatch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04615227\"]}");
	add("{\"term\":\"writ\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06564975\"]}");
	add("{\"term\":\"writer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10820913\", \"10813654\"]}");
	add("{\"term\":\"writing\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00615511\", \"06371284\", \"06375185\", \"06374360\", \"00931533\"]}");
	add("{\"term\":\"writings\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06464994\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }