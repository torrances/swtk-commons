package org.swtk.commons.dict.wordnet.indexbyname.instance.o.r.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceORL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"orlando\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09096645\"]}");
	add("{\"term\":\"orlando di lasso\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11138352\"]}");
	add("{\"term\":\"orleanais\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08964591\"]}");
	add("{\"term\":\"orleanism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06229558\"]}");
	add("{\"term\":\"orleanist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10403753\"]}");
	add("{\"term\":\"orleans\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01292323\", \"08957187\"]}");
	add("{\"term\":\"orlon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03861276\"]}");
	add("{\"term\":\"orlop\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03861428\"]}");
	add("{\"term\":\"orlop deck\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03861428\"]}");
	add("{\"term\":\"orly\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08953394\"]}");
	add("{\"term\":\"orly group\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08033138\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }