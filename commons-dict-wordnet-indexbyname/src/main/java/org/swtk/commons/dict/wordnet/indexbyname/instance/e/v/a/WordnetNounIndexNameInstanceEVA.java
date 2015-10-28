package org.swtk.commons.dict.wordnet.indexbyname.instance.e.v.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEVA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"evacuation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"13494300\", \"00055641\", \"00396605\"]}");
	add("{\"term\":\"evacuee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10086431\"]}");
	add("{\"term\":\"evaluation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05744094\", \"00876484\"]}");
	add("{\"term\":\"evaluator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10086539\"]}");
	add("{\"term\":\"evanescence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07350517\"]}");
	add("{\"term\":\"evangel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06466808\"]}");
	add("{\"term\":\"evangelicalism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06241149\"]}");
	add("{\"term\":\"evangelism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07259273\"]}");
	add("{\"term\":\"evangelist\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10087112\", \"10086818\"]}");
	add("{\"term\":\"evans\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10983246\", \"10983459\"]}");
	add("{\"term\":\"evansville\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09107754\"]}");
	add("{\"term\":\"evaporation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13481771\", \"13593639\"]}");
	add("{\"term\":\"evaporite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15033759\"]}");
	add("{\"term\":\"evaporometer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02755922\"]}");
	add("{\"term\":\"evasion\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00059947\", \"00742010\", \"01123176\", \"06773810\"]}");
	add("{\"term\":\"evasiveness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04832614\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }