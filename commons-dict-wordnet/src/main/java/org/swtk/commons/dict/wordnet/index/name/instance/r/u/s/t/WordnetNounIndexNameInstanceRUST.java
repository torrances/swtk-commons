package org.swtk.commons.dict.wordnet.index.name.instance.r.u.s.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRUST {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"rust\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"13084029\", \"13573473\", \"14301157\", \"14913630\"]}");
	add("{\"term\":\"rustbelt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08582535\"]}");
	add("{\"term\":\"rustic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10563789\"]}");
	add("{\"term\":\"rustication\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00209543\", \"00210150\", \"00213400\", \"00915105\", \"14602760\"]}");
	add("{\"term\":\"rusticism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07169374\"]}");
	add("{\"term\":\"rusticity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04823356\"]}");
	add("{\"term\":\"rustiness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05656601\", \"14602910\"]}");
	add("{\"term\":\"rusting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13573473\"]}");
	add("{\"term\":\"rustle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07407383\"]}");
	add("{\"term\":\"rustler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10564037\"]}");
	add("{\"term\":\"rustling\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07407383\", \"00968608\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }