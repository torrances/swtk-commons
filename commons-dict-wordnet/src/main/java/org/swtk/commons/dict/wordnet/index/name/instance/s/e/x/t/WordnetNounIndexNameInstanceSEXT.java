package org.swtk.commons.dict.wordnet.index.name.instance.s.e.x.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSEXT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sext\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15254770\"]}");
	add("{\"term\":\"sextant\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04187949\", \"13633793\"]}");
	add("{\"term\":\"sextet\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"08004131\", \"08004811\", \"08264737\", \"13766862\", \"07055648\"]}");
	add("{\"term\":\"sextette\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"07055648\", \"08004131\", \"08004811\", \"08264737\"]}");
	add("{\"term\":\"sextillion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13775570\"]}");
	add("{\"term\":\"sexton\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10604669\", \"11314572\"]}");
	add("{\"term\":\"sextuplet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13766862\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }