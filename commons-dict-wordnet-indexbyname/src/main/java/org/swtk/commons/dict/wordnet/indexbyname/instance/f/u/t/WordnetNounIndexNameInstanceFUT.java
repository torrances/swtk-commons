package org.swtk.commons.dict.wordnet.indexbyname.instance.f.u.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFUT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"futility\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05158102\"]}");
	add("{\"term\":\"futon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03413354\"]}");
	add("{\"term\":\"futtock shroud\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03413531\"]}");
	add("{\"term\":\"future\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03413631\", \"06341394\", \"15146567\"]}");
	add("{\"term\":\"future date\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15185123\"]}");
	add("{\"term\":\"future perfect\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13829390\"]}");
	add("{\"term\":\"future perfect tense\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13829390\"]}");
	add("{\"term\":\"future progressive\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13829615\"]}");
	add("{\"term\":\"future progressive tense\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13829615\"]}");
	add("{\"term\":\"future tense\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06341394\"]}");
	add("{\"term\":\"futures contract\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06492394\"]}");
	add("{\"term\":\"futures exchange\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03413828\"]}");
	add("{\"term\":\"futures market\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03413828\"]}");
	add("{\"term\":\"futurism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06218977\", \"08485095\"]}");
	add("{\"term\":\"futurist\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10098309\", \"10136359\"]}");
	add("{\"term\":\"futuristics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06145556\"]}");
	add("{\"term\":\"futurity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05057081\", \"15146567\"]}");
	add("{\"term\":\"futurology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06145556\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }