package org.swtk.commons.dict.wordnet.index.name.instance.r.e.b.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceREBU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"rebuff\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07222660\", \"01228272\"]}");
	add("{\"term\":\"rebuilding\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00271030\"]}");
	add("{\"term\":\"rebuke\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06724794\"]}");
	add("{\"term\":\"rebuker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10759674\"]}");
	add("{\"term\":\"reburial\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01052687\"]}");
	add("{\"term\":\"reburying\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01052687\"]}");
	add("{\"term\":\"rebus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06799343\"]}");
	add("{\"term\":\"rebuttal\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06574984\", \"07215880\"]}");
	add("{\"term\":\"rebutter\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06574984\", \"10530139\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }