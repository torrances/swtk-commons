package org.swtk.commons.dict.wordnet.index.name.instance.d.u.c.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDUCK {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"duck\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03257774\", \"07662187\", \"13617087\", \"01848972\"]}");
	add("{\"term\":\"duckbill\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01875951\", \"02642235\"]}");
	add("{\"term\":\"duckboard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03257890\"]}");
	add("{\"term\":\"ducking\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00278413\", \"00454420\"]}");
	add("{\"term\":\"duckling\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01849811\", \"07662327\"]}");
	add("{\"term\":\"duckpin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03257982\"]}");
	add("{\"term\":\"duckpins\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00463618\"]}");
	add("{\"term\":\"duckweed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11814988\"]}");
	add("{\"term\":\"ducky\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10011405\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }