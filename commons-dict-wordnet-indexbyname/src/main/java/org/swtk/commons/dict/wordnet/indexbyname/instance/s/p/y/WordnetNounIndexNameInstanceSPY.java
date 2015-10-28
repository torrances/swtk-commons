package org.swtk.commons.dict.wordnet.indexbyname.instance.s.p.y;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSPY {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"spy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10661549\", \"10661153\"]}");
	add("{\"term\":\"spyeria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02280995\"]}");
	add("{\"term\":\"spyglass\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03338074\"]}");
	add("{\"term\":\"spyhole\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03911327\"]}");
	add("{\"term\":\"spying\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00151907\", \"00655477\", \"00883119\"]}");
	add("{\"term\":\"spymaster\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10661786\"]}");
	add("{\"term\":\"spyware\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06600156\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }