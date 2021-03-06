package org.swtk.commons.dict.wordnet.indexbyname.instance.m.e.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMEE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"meed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13305379\"]}");
	add("{\"term\":\"meekness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04896974\", \"07524564\"]}");
	add("{\"term\":\"meerestone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07274106\"]}");
	add("{\"term\":\"meerkat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02141093\"]}");
	add("{\"term\":\"meerschaum\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03747907\", \"14705606\"]}");
	add("{\"term\":\"meet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07482986\"]}");
	add("{\"term\":\"meeter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09631032\"]}");
	add("{\"term\":\"meeting\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"08560197\", \"00147676\", \"01233454\", \"07429522\", \"08327319\", \"08324519\"]}");
	add("{\"term\":\"meeting house\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11747827\"]}");
	add("{\"term\":\"meeting of minds\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13995249\"]}");
	add("{\"term\":\"meeting place\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03391266\"]}");
	add("{\"term\":\"meetinghouse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03104273\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }