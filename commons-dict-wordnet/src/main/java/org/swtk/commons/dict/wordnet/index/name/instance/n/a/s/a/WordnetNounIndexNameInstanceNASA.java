package org.swtk.commons.dict.wordnet.index.name.instance.n.a.s.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceNASA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"nasa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08143272\"]}");
	add("{\"term\":\"nasal\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05285031\", \"07133919\"]}");
	add("{\"term\":\"nasalis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02491691\"]}");
	add("{\"term\":\"nasalisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07132710\"]}");
	add("{\"term\":\"nasality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04996598\"]}");
	add("{\"term\":\"nasalization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07132710\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }