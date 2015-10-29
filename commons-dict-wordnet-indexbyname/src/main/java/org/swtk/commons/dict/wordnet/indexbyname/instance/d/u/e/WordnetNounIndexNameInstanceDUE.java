package org.swtk.commons.dict.wordnet.indexbyname.instance.d.u.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDUE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"due\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13418034\", \"05183609\"]}");
	add("{\"term\":\"due care\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01134115\"]}");
	add("{\"term\":\"due date\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15178185\"]}");
	add("{\"term\":\"due east\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13854554\"]}");
	add("{\"term\":\"due north\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13853375\"]}");
	add("{\"term\":\"due process\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01183965\"]}");
	add("{\"term\":\"due process of law\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01183965\"]}");
	add("{\"term\":\"due south\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13855574\"]}");
	add("{\"term\":\"due west\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13856598\"]}");
	add("{\"term\":\"duel\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00790898\", \"01175274\"]}");
	add("{\"term\":\"dueler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10058654\"]}");
	add("{\"term\":\"duelist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10058654\"]}");
	add("{\"term\":\"dueller\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10058654\"]}");
	add("{\"term\":\"duellist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10058654\"]}");
	add("{\"term\":\"duenna\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10058889\"]}");
	add("{\"term\":\"duet\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00530261\", \"07055197\", \"08002070\", \"08263942\", \"13765745\"]}");
	add("{\"term\":\"duette\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07055197\", \"08263942\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }