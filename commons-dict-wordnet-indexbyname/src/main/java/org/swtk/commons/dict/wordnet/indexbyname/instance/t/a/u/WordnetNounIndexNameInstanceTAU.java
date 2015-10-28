package org.swtk.commons.dict.wordnet.indexbyname.instance.t.a.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTAU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tau\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06849109\"]}");
	add("{\"term\":\"taunt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01225348\"]}");
	add("{\"term\":\"taunting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01225348\"]}");
	add("{\"term\":\"tauon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09478336\"]}");
	add("{\"term\":\"taupe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04982041\"]}");
	add("{\"term\":\"taurine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14681105\"]}");
	add("{\"term\":\"tauromachy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00453020\"]}");
	add("{\"term\":\"taurotragus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02429280\"]}");
	add("{\"term\":\"taurus\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"08704070\", \"09478436\", \"09771712\", \"11221376\"]}");
	add("{\"term\":\"tautness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04784179\", \"14567937\"]}");
	add("{\"term\":\"tautog\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02612696\"]}");
	add("{\"term\":\"tautoga\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02612581\"]}");
	add("{\"term\":\"tautogolabrus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02612864\"]}");
	add("{\"term\":\"tautology\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07105406\", \"07105577\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }