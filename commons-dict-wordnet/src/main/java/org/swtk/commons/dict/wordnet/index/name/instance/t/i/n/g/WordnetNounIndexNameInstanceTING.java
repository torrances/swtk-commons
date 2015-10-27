package org.swtk.commons.dict.wordnet.index.name.instance.t.i.n.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTING {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07412697\"]}");
	add("{\"term\":\"tinge\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04966744\", \"13796315\"]}");
	add("{\"term\":\"tingidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02241126\"]}");
	add("{\"term\":\"tingle\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05730815\", \"07535351\"]}");
	add("{\"term\":\"tingling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05730815\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }