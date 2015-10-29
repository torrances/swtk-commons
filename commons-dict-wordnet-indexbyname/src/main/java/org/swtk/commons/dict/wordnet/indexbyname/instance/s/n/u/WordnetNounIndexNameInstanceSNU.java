package org.swtk.commons.dict.wordnet.indexbyname.instance.s.n.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSNU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"snub\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01228486\", \"07222660\"]}");
	add("{\"term\":\"snuff\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00884817\", \"04260049\", \"13796210\", \"15068583\"]}");
	add("{\"term\":\"snuff user\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10637330\"]}");
	add("{\"term\":\"snuffbox\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04260167\"]}");
	add("{\"term\":\"snuffbox fern\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13248915\"]}");
	add("{\"term\":\"snuffer\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10637330\", \"10637420\", \"04260278\"]}");
	add("{\"term\":\"snuffers\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04260414\"]}");
	add("{\"term\":\"snuffle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00837810\"]}");
	add("{\"term\":\"snuffler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10637523\"]}");
	add("{\"term\":\"snug\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03149031\"]}");
	add("{\"term\":\"snuggery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03149031\"]}");
	add("{\"term\":\"snuggle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00418656\"]}");
	add("{\"term\":\"snuggling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00855630\"]}");
	add("{\"term\":\"snugness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14469764\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }