package org.swtk.commons.dict.wordnet.indexbyname.instance.e.c.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceECC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ecc\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06368831\"]}");
	add("{\"term\":\"eccentric\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09928518\", \"10062653\"]}");
	add("{\"term\":\"eccentricity\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05081057\", \"13899768\", \"04806130\"]}");
	add("{\"term\":\"ecchymosis\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13492071\", \"14312581\"]}");
	add("{\"term\":\"eccles\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10967914\"]}");
	add("{\"term\":\"ecclesiastes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06449201\"]}");
	add("{\"term\":\"ecclesiastic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09947594\"]}");
	add("{\"term\":\"ecclesiasticism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05957583\", \"01215724\"]}");
	add("{\"term\":\"ecclesiasticus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06471965\"]}");
	add("{\"term\":\"ecclesiology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06192720\"]}");
	add("{\"term\":\"eccm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00997442\"]}");
	add("{\"term\":\"eccyesis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14071222\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }