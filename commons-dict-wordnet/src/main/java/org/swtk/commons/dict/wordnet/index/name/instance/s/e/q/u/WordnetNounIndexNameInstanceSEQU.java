package org.swtk.commons.dict.wordnet.index.name.instance.s.e.q.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSEQU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sequel\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06411146\", \"07310125\"]}");
	add("{\"term\":\"sequela\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14574206\"]}");
	add("{\"term\":\"sequella\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07309457\"]}");
	add("{\"term\":\"sequenator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04180572\"]}");
	add("{\"term\":\"sequence\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"07356983\", \"01012400\", \"04180233\", \"05051973\", \"08476263\"]}");
	add("{\"term\":\"sequencer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04180405\", \"04180572\"]}");
	add("{\"term\":\"sequestration\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00088038\", \"06567561\", \"13575789\", \"01204674\"]}");
	add("{\"term\":\"sequin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04180759\"]}");
	add("{\"term\":\"sequoia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11661096\"]}");
	add("{\"term\":\"sequoiadendron\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11661726\"]}");
	add("{\"term\":\"sequoya\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11313147\"]}");
	add("{\"term\":\"sequoyah\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11313147\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }