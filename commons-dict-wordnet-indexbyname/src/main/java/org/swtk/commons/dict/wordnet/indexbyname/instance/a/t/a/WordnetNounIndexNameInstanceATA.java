package org.swtk.commons.dict.wordnet.indexbyname.instance.a.t.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceATA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"atabrine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04041117\"]}");
	add("{\"term\":\"atakapa\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06920343\", \"09667518\"]}");
	add("{\"term\":\"atakapan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06920343\"]}");
	add("{\"term\":\"atar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14917140\"]}");
	add("{\"term\":\"ataractic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04477467\"]}");
	add("{\"term\":\"atarax\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03559311\"]}");
	add("{\"term\":\"ataraxia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04911737\"]}");
	add("{\"term\":\"ataraxis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07531029\"]}");
	add("{\"term\":\"ataturk\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10846556\"]}");
	add("{\"term\":\"atavism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07358174\"]}");
	add("{\"term\":\"atavist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09839265\"]}");
	add("{\"term\":\"ataxia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14114736\"]}");
	add("{\"term\":\"ataxy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14114736\"]}");
	add("{\"term\":\"atayalic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06953616\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }