package org.swtk.commons.dict.wordnet.indexbyname.instance.l.a.y;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLAY {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lay\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06389921\", \"07063753\"]}");
	add("{\"term\":\"layabout\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10217586\"]}");
	add("{\"term\":\"layby\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04027138\"]}");
	add("{\"term\":\"layer\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"01465900\", \"01795800\", \"06257026\", \"08609236\", \"03655499\"]}");
	add("{\"term\":\"layette\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03655877\"]}");
	add("{\"term\":\"layia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12008888\"]}");
	add("{\"term\":\"laying\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13527680\"]}");
	add("{\"term\":\"layman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10270224\"]}");
	add("{\"term\":\"layoff\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00230681\"]}");
	add("{\"term\":\"layout\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01012843\", \"05845595\"]}");
	add("{\"term\":\"layover\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01058335\"]}");
	add("{\"term\":\"layperson\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10270224\"]}");
	add("{\"term\":\"layup\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00112480\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }