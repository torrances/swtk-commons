package org.swtk.commons.dict.wordnet.indexbyname.instance.l.e.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLES {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lesbian\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09730926\", \"10274662\"]}");
	add("{\"term\":\"lesbianism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00859053\"]}");
	add("{\"term\":\"lesbos\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08801435\"]}");
	add("{\"term\":\"lescol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03377502\"]}");
	add("{\"term\":\"lesion\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14322317\", \"14234776\"]}");
	add("{\"term\":\"lesotho\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08978603\"]}");
	add("{\"term\":\"lespedeza\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12563415\"]}");
	add("{\"term\":\"lesquerella\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11911192\"]}");
	add("{\"term\":\"lessee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10271772\"]}");
	add("{\"term\":\"lessening\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07370487\"]}");
	add("{\"term\":\"lesseps\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11149276\"]}");
	add("{\"term\":\"lessing\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11149468\", \"11149655\"]}");
	add("{\"term\":\"lesson\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00730583\", \"06618397\", \"06685497\", \"00891150\"]}");
	add("{\"term\":\"lessor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10274793\"]}");
	add("{\"term\":\"lesvos\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08801435\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }