package org.swtk.commons.dict.wordnet.index.name.instance.s.a.t.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSATA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"satan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09566482\"]}");
	add("{\"term\":\"satang\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13686038\"]}");
	add("{\"term\":\"satanism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05988462\"]}");
	add("{\"term\":\"satanist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10571914\"]}");
	add("{\"term\":\"satanophobia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14409139\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }