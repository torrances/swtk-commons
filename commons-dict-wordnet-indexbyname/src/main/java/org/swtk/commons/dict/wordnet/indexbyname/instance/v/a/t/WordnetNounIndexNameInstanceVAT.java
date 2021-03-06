package org.swtk.commons.dict.wordnet.indexbyname.instance.v.a.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceVAT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"vat\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04500676\", \"13337744\"]}");
	add("{\"term\":\"vat color\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15026454\"]}");
	add("{\"term\":\"vat dye\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15026454\"]}");
	add("{\"term\":\"vatican\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04530675\"]}");
	add("{\"term\":\"vatican city\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09184245\"]}");
	add("{\"term\":\"vatican council\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08334815\"]}");
	add("{\"term\":\"vatican i\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08334962\"]}");
	add("{\"term\":\"vatican ii\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08335146\"]}");
	add("{\"term\":\"vatican palace\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04530675\"]}");
	add("{\"term\":\"vaticination\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05783404\"]}");
	add("{\"term\":\"vaticinator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10503115\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }