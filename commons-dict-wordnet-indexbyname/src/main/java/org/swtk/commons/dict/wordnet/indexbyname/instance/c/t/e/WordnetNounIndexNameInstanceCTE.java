package org.swtk.commons.dict.wordnet.indexbyname.instance.c.t.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCTE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ctene\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01921226\"]}");
	add("{\"term\":\"ctenidium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01956518\"]}");
	add("{\"term\":\"ctenizidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01778233\"]}");
	add("{\"term\":\"ctenocephalides\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02189486\"]}");
	add("{\"term\":\"ctenocephalides canis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02189802\"]}");
	add("{\"term\":\"ctenocephalides felis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02189931\"]}");
	add("{\"term\":\"ctenocephalus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02189674\"]}");
	add("{\"term\":\"ctenophora\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01920951\"]}");
	add("{\"term\":\"ctenophore\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01921385\"]}");
	add("{\"term\":\"ctenophore family\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01920651\"]}");
	add("{\"term\":\"ctenophore genus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01920793\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }