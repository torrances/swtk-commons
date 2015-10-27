package org.swtk.commons.dict.wordnet.index.name.instance.g.a.m.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGAME {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"game\", \"synsetCount\":11, \"upperType\":\"NOUN\", \"ids\":[\"00514100\", \"00584126\", \"03418738\", \"05916276\", \"07666058\", \"13617478\", \"15281378\", \"02155643\", \"00431591\", \"00457223\", \"00456623\"]}");
	add("{\"term\":\"gamebag\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03418939\"]}");
	add("{\"term\":\"gameboard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02860303\"]}");
	add("{\"term\":\"gamecock\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10189271\", \"01517393\"]}");
	add("{\"term\":\"gamekeeper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10139008\"]}");
	add("{\"term\":\"gamelan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08265442\"]}");
	add("{\"term\":\"gameness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14573529\"]}");
	add("{\"term\":\"gamesmanship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04847108\"]}");
	add("{\"term\":\"gametangium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13114388\"]}");
	add("{\"term\":\"gamete\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05464521\"]}");
	add("{\"term\":\"gametocyte\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05465988\"]}");
	add("{\"term\":\"gametoecium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13114484\"]}");
	add("{\"term\":\"gametogenesis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13507318\"]}");
	add("{\"term\":\"gametophore\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13114762\"]}");
	add("{\"term\":\"gametophyte\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11707540\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }