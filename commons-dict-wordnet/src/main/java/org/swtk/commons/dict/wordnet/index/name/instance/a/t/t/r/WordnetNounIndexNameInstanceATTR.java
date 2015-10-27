package org.swtk.commons.dict.wordnet.index.name.instance.a.t.t.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceATTR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"attracter\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05859350\", \"05874783\", \"10052401\"]}");
	add("{\"term\":\"attraction\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"10052401\", \"05859350\", \"04695595\", \"06627914\", \"11446644\"]}");
	add("{\"term\":\"attractiveness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04693352\", \"04695595\"]}");
	add("{\"term\":\"attractor\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05859350\", \"05874783\", \"10052401\"]}");
	add("{\"term\":\"attribute\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00024444\", \"05857567\"]}");
	add("{\"term\":\"attribution\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05742504\", \"05742854\"]}");
	add("{\"term\":\"attrition\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00362621\", \"07371570\", \"07550088\", \"11480462\", \"13444788\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }