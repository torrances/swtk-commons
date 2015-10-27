package org.swtk.commons.dict.wordnet.index.name.instance.s.p.o.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSPOK {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"spokane\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09177371\"]}");
	add("{\"term\":\"spoke\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04126845\", \"04290516\"]}");
	add("{\"term\":\"spokeshave\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04290723\"]}");
	add("{\"term\":\"spokesman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10657708\"]}");
	add("{\"term\":\"spokesperson\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10657783\"]}");
	add("{\"term\":\"spokeswoman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10658132\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }