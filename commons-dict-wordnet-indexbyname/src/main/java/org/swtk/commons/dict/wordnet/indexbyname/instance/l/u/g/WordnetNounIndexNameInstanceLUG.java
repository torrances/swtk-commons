package org.swtk.commons.dict.wordnet.indexbyname.instance.l.u.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLUG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lug\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01939312\", \"03700942\", \"03701902\", \"09533437\"]}");
	add("{\"term\":\"luganda\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07006637\"]}");
	add("{\"term\":\"luge\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03701079\"]}");
	add("{\"term\":\"luger\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10295637\", \"03701183\"]}");
	add("{\"term\":\"luggage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02777635\"]}");
	add("{\"term\":\"lugger\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03701779\"]}");
	add("{\"term\":\"lugh\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09533437\"]}");
	add("{\"term\":\"luging\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00448346\"]}");
	add("{\"term\":\"lugosi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11164421\"]}");
	add("{\"term\":\"lugsail\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03701902\"]}");
	add("{\"term\":\"lugubriousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04638827\"]}");
	add("{\"term\":\"lugworm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01939312\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }