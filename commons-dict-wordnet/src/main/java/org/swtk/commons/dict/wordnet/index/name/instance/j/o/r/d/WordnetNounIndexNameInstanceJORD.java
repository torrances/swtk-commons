package org.swtk.commons.dict.wordnet.index.name.instance.j.o.r.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceJORD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"jordan\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08946959\", \"09344807\"]}");
	add("{\"term\":\"jordanella\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01450463\"]}");
	add("{\"term\":\"jordanian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09738207\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }