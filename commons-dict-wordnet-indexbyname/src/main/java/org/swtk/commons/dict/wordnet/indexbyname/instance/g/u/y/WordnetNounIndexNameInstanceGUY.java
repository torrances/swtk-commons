package org.swtk.commons.dict.wordnet.indexbyname.instance.g.u.y;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGUY {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"guy\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03476902\", \"03477097\", \"10172934\"]}");
	add("{\"term\":\"guy cable\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03476902\"]}");
	add("{\"term\":\"guy de maupassant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11185329\"]}");
	add("{\"term\":\"guy fawkes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10987864\"]}");
	add("{\"term\":\"guy fawkes day\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15183957\"]}");
	add("{\"term\":\"guy fawkes night\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15184099\"]}");
	add("{\"term\":\"guy of burgundy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10899541\"]}");
	add("{\"term\":\"guy rope\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03476902\"]}");
	add("{\"term\":\"guy wire\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03476902\"]}");
	add("{\"term\":\"guyana\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08968119\"]}");
	add("{\"term\":\"guyana dollar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13695467\"]}");
	add("{\"term\":\"guyanese\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09731720\"]}");
	add("{\"term\":\"guyot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09323465\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }