package org.swtk.commons.dict.wordnet.index.name.instance.s.a.n.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSANC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sanchez\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11221376\"]}");
	add("{\"term\":\"sanctification\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01041957\"]}");
	add("{\"term\":\"sanctimoniousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04875563\"]}");
	add("{\"term\":\"sanctimony\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04875563\"]}");
	add("{\"term\":\"sanction\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01141321\", \"05184134\", \"01126567\", \"06700103\"]}");
	add("{\"term\":\"sanctitude\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04862369\"]}");
	add("{\"term\":\"sanctity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04862369\"]}");
	add("{\"term\":\"sanctuary\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03008428\", \"04078214\", \"04140731\"]}");
	add("{\"term\":\"sanctum\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08602583\", \"08663146\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }