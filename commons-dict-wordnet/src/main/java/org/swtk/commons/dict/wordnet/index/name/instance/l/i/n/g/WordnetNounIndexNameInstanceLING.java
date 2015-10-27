package org.swtk.commons.dict.wordnet.index.name.instance.l.i.n.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLING {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ling\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"02526058\", \"02527559\", \"02527751\", \"12254046\", \"12369152\"]}");
	add("{\"term\":\"lingam\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06821266\"]}");
	add("{\"term\":\"lingberry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12270059\"]}");
	add("{\"term\":\"lingcod\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02555659\", \"07800967\"]}");
	add("{\"term\":\"lingenberry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12270059\"]}");
	add("{\"term\":\"lingerer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10289929\"]}");
	add("{\"term\":\"lingerie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03678776\"]}");
	add("{\"term\":\"lingering\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01070347\"]}");
	add("{\"term\":\"lingo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07171981\"]}");
	add("{\"term\":\"lingonberry\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07760033\", \"12270059\"]}");
	add("{\"term\":\"lingua\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05308571\"]}");
	add("{\"term\":\"lingual\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07134229\"]}");
	add("{\"term\":\"lingualumina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06909737\"]}");
	add("{\"term\":\"linguica\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07693810\"]}");
	add("{\"term\":\"linguine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07716284\"]}");
	add("{\"term\":\"linguini\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07716284\"]}");
	add("{\"term\":\"linguist\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10283916\", \"10284134\"]}");
	add("{\"term\":\"linguistics\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06180756\", \"06182505\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }