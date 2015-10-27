package org.swtk.commons.dict.wordnet.index.name.instance.i.n.d.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceINDE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"indebtedness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13804245\", \"14513903\"]}");
	add("{\"term\":\"indecency\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00738834\", \"04910102\"]}");
	add("{\"term\":\"indecision\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04874097\", \"05707137\"]}");
	add("{\"term\":\"indecisiveness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04874097\", \"05707137\"]}");
	add("{\"term\":\"indecorousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04909647\"]}");
	add("{\"term\":\"indecorum\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00738368\", \"04909647\"]}");
	add("{\"term\":\"indefatigability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04872055\"]}");
	add("{\"term\":\"indefatigableness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04872055\"]}");
	add("{\"term\":\"indefiniteness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04765119\"]}");
	add("{\"term\":\"indefinity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04765119\"]}");
	add("{\"term\":\"indelicacy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01227317\", \"04909342\"]}");
	add("{\"term\":\"indemnification\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00260737\", \"13311699\"]}");
	add("{\"term\":\"indemnity\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"13311699\", \"14553010\", \"14563428\"]}");
	add("{\"term\":\"indene\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14849076\"]}");
	add("{\"term\":\"indent\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06401396\", \"06541870\"]}");
	add("{\"term\":\"indentation\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00407760\", \"06401396\", \"13559097\", \"13931035\"]}");
	add("{\"term\":\"indention\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06401396\"]}");
	add("{\"term\":\"indenture\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"06401396\", \"06785638\", \"06785807\", \"13931035\"]}");
	add("{\"term\":\"independence\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09129392\", \"07489146\", \"14017633\"]}");
	add("{\"term\":\"independency\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14017633\"]}");
	add("{\"term\":\"independent\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10130190\", \"10357201\"]}");
	add("{\"term\":\"inderal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04017785\"]}");
	add("{\"term\":\"indestructibility\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05050775\"]}");
	add("{\"term\":\"indeterminacy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04765119\"]}");
	add("{\"term\":\"indeterminateness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04765119\"]}");
	add("{\"term\":\"indetermination\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04765119\"]}");
	add("{\"term\":\"index\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"05575014\", \"06503777\", \"06825275\", \"06652323\", \"13873264\"]}");
	add("{\"term\":\"indexation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00807529\"]}");
	add("{\"term\":\"indexer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10222635\"]}");
	add("{\"term\":\"indexing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01015098\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }