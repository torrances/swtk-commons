package org.swtk.commons.dict.wordnet.index.name.instance.w.h.i.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceWHIS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"whisk\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04586087\", \"04586220\"]}");
	add("{\"term\":\"whisker\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01904469\", \"13783743\"]}");
	add("{\"term\":\"whiskers\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05269065\"]}");
	add("{\"term\":\"whiskey\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07922524\"]}");
	add("{\"term\":\"whisky\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07922524\"]}");
	add("{\"term\":\"whisper\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07407383\", \"07145049\"]}");
	add("{\"term\":\"whisperer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10796967\"]}");
	add("{\"term\":\"whispering\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07145049\", \"07407383\"]}");
	add("{\"term\":\"whist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00497178\"]}");
	add("{\"term\":\"whistle\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"03918337\", \"04586718\", \"04586953\", \"06818956\", \"07414756\"]}");
	add("{\"term\":\"whistleblower\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10797068\"]}");
	add("{\"term\":\"whistler\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"01559155\", \"01853014\", \"02364358\", \"10797436\", \"11403420\"]}");
	add("{\"term\":\"whistling\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06818956\", \"00548491\", \"07414756\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }