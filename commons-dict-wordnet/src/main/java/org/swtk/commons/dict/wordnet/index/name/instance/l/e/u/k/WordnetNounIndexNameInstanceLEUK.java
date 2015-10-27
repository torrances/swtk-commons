package org.swtk.commons.dict.wordnet.index.name.instance.l.e.u.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLEUK {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"leukaemia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14266404\"]}");
	add("{\"term\":\"leukemia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14266404\"]}");
	add("{\"term\":\"leukeran\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03025214\"]}");
	add("{\"term\":\"leukocyte\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05457535\"]}");
	add("{\"term\":\"leukocytosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14219703\"]}");
	add("{\"term\":\"leukoderma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14252730\"]}");
	add("{\"term\":\"leukoencephalitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14366707\"]}");
	add("{\"term\":\"leukoma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14281065\"]}");
	add("{\"term\":\"leukopenia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14219887\"]}");
	add("{\"term\":\"leukorrhea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05425165\"]}");
	add("{\"term\":\"leukotomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00685381\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }