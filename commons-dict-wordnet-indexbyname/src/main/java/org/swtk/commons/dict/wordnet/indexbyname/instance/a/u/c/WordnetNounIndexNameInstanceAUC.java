package org.swtk.commons.dict.wordnet.indexbyname.instance.a.u.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAUC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"auc\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08063784\"]}");
	add("{\"term\":\"auchincloss\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10847695\"]}");
	add("{\"term\":\"auckland\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08995271\"]}");
	add("{\"term\":\"auction\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00093186\", \"00492172\"]}");
	add("{\"term\":\"auction block\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02759606\"]}");
	add("{\"term\":\"auction bridge\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00492172\"]}");
	add("{\"term\":\"auction house\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08093782\"]}");
	add("{\"term\":\"auction pitch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00499569\"]}");
	add("{\"term\":\"auction sale\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00093186\"]}");
	add("{\"term\":\"auctioneer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09631407\"]}");
	add("{\"term\":\"aucuba\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12967192\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }