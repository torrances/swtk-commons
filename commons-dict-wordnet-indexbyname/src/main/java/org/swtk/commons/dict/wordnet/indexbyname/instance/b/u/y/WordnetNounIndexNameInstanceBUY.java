package org.swtk.commons.dict.wordnet.indexbyname.instance.b.u.y;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBUY {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"buy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13274650\"]}");
	add("{\"term\":\"buyback\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00080032\"]}");
	add("{\"term\":\"buyer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09904597\"]}");
	add("{\"term\":\"buyi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06949067\"]}");
	add("{\"term\":\"buying\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00082392\"]}");
	add("{\"term\":\"buyout\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00791195\"]}");
	add("{\"term\":\"buyout bid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07180061\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }