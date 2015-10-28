package org.swtk.commons.dict.wordnet.indexbyname.instance.j.u.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceJUG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"jug\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13790096\", \"03608935\"]}");
	add("{\"term\":\"jugale\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05240750\"]}");
	add("{\"term\":\"jugful\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13790096\"]}");
	add("{\"term\":\"juggernaut\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03609091\", \"09553647\", \"10246226\"]}");
	add("{\"term\":\"juggle\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00100619\", \"00339820\"]}");
	add("{\"term\":\"juggler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10246083\"]}");
	add("{\"term\":\"jugglery\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00563216\", \"00755461\"]}");
	add("{\"term\":\"juggling\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00100619\", \"00339820\"]}");
	add("{\"term\":\"juglandaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12338436\"]}");
	add("{\"term\":\"juglandales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12338280\"]}");
	add("{\"term\":\"juglans\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12338681\"]}");
	add("{\"term\":\"jugoslav\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09770222\"]}");
	add("{\"term\":\"jugoslavian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09770222\"]}");
	add("{\"term\":\"jugoslavija\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08834088\"]}");
	add("{\"term\":\"jugular\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05049727\", \"05378261\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }