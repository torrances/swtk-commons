package org.swtk.commons.dict.wordnet.indexbyname.instance.o.p.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceOPT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"optative\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13824310\"]}");
	add("{\"term\":\"optez\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06910329\"]}");
	add("{\"term\":\"optic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05318579\"]}");
	add("{\"term\":\"optician\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10399699\"]}");
	add("{\"term\":\"optics\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04957203\", \"06110385\"]}");
	add("{\"term\":\"optimisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00260894\"]}");
	add("{\"term\":\"optimism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05219061\", \"07556946\"]}");
	add("{\"term\":\"optimist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10399825\"]}");
	add("{\"term\":\"optimization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00260894\"]}");
	add("{\"term\":\"optimum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05151111\"]}");
	add("{\"term\":\"option\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00162063\", \"05798949\", \"13262498\"]}");
	add("{\"term\":\"optometrist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10400004\"]}");
	add("{\"term\":\"optometry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00633959\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }