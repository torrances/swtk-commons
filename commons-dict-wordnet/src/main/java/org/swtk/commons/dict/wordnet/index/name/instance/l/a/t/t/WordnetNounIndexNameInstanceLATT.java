package org.swtk.commons.dict.wordnet.index.name.instance.l.a.t.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLATT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"latte\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07936462\"]}");
	add("{\"term\":\"latten\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14954962\"]}");
	add("{\"term\":\"latter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13868905\"]}");
	add("{\"term\":\"lattice\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03652230\", \"04589740\", \"05737820\"]}");
	add("{\"term\":\"latticework\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03652230\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }