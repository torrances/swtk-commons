package org.swtk.commons.dict.wordnet.indexbyname.instance.a.a.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAAR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"aar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09208961\"]}");
	add("{\"term\":\"aardvark\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02085443\"]}");
	add("{\"term\":\"aardwolf\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02120828\"]}");
	add("{\"term\":\"aare\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09208961\"]}");
	add("{\"term\":\"aare river\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09208961\"]}");
	add("{\"term\":\"aarhus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08779937\"]}");
	add("{\"term\":\"aaron\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10826445\", \"10826620\"]}");
	add("{\"term\":\"aaron burr\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10893749\"]}");
	add("{\"term\":\"aaron copland\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10929681\"]}");
	add("{\"term\":\"aaron montgomery ward\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11393892\"]}");
	add("{\"term\":\"aarp\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08504159\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }