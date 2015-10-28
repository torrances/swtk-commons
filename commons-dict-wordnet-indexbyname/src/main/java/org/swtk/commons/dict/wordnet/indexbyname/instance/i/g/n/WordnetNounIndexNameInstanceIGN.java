package org.swtk.commons.dict.wordnet.indexbyname.instance.i.g.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceIGN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ignatius\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11090984\"]}");
	add("{\"term\":\"igniter\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03671917\", \"15125928\"]}");
	add("{\"term\":\"ignition\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00379287\", \"03565747\", \"13517076\"]}");
	add("{\"term\":\"ignitor\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03671917\", \"15125928\"]}");
	add("{\"term\":\"ignobility\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04880999\"]}");
	add("{\"term\":\"ignobleness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04880999\"]}");
	add("{\"term\":\"ignominiousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04815533\"]}");
	add("{\"term\":\"ignominy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14463603\"]}");
	add("{\"term\":\"ignoramus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10218577\"]}");
	add("{\"term\":\"ignorance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05997167\"]}");
	add("{\"term\":\"ignorantness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05997628\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }