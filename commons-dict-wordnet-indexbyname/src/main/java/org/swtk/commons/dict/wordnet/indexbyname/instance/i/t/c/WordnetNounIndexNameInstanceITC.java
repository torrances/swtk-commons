package org.swtk.commons.dict.wordnet.indexbyname.instance.i.t.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceITC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"itch\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05731508\", \"07505591\", \"14203809\"]}");
	add("{\"term\":\"itch mite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01784339\"]}");
	add("{\"term\":\"itchiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05731508\"]}");
	add("{\"term\":\"itching\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05731508\"]}");
	add("{\"term\":\"itchy feet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09206037\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }