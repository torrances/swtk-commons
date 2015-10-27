package org.swtk.commons.dict.wordnet.index.name.instance.c.y.b.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCYBE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cybele\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09617267\"]}");
	add("{\"term\":\"cyberart\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03159721\"]}");
	add("{\"term\":\"cybercafe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03159844\"]}");
	add("{\"term\":\"cybercrime\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00769972\"]}");
	add("{\"term\":\"cyberculture\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06204471\"]}");
	add("{\"term\":\"cybernation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00103599\"]}");
	add("{\"term\":\"cybernaut\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10005213\"]}");
	add("{\"term\":\"cybernetics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06152049\"]}");
	add("{\"term\":\"cyberphobia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14406849\"]}");
	add("{\"term\":\"cyberpunk\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06380437\", \"10005339\", \"10174791\"]}");
	add("{\"term\":\"cybersex\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14061298\"]}");
	add("{\"term\":\"cyberspace\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03585784\"]}");
	add("{\"term\":\"cyberwar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00764983\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }