package org.swtk.commons.dict.wordnet.indexbyname.instance.b.i.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBID {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"bid\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"06749861\", \"07179737\", \"00788541\", \"07182782\"]}");
	add("{\"term\":\"bid price\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13325208\"]}");
	add("{\"term\":\"bida\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09009632\"]}");
	add("{\"term\":\"bidder\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09872592\", \"09872495\"]}");
	add("{\"term\":\"bidding\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06749861\", \"07201188\", \"07182782\"]}");
	add("{\"term\":\"bidding contest\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01171602\"]}");
	add("{\"term\":\"biddy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01794683\", \"01795281\"]}");
	add("{\"term\":\"bidens\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11960356\"]}");
	add("{\"term\":\"bidens bipinnata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11960818\"]}");
	add("{\"term\":\"bidens connata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11961384\"]}");
	add("{\"term\":\"bidens coronata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11961068\"]}");
	add("{\"term\":\"bidens trichosperma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11961068\"]}");
	add("{\"term\":\"bidens tripartita\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11961219\"]}");
	add("{\"term\":\"bidet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02839379\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }