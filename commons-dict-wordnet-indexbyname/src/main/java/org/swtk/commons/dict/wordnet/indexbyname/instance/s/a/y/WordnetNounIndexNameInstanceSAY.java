package org.swtk.commons.dict.wordnet.indexbyname.instance.s.a.y;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSAY {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"say\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14509110\"]}");
	add("{\"term\":\"say hey kid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11187259\"]}");
	add("{\"term\":\"sayan mountains\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09448037\"]}");
	add("{\"term\":\"sayanci\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06996076\"]}");
	add("{\"term\":\"sayda\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08977985\"]}");
	add("{\"term\":\"sayeret\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08362697\"]}");
	add("{\"term\":\"sayeret matkal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08362697\"]}");
	add("{\"term\":\"sayers\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11303672\"]}");
	add("{\"term\":\"saying\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07166088\"]}");
	add("{\"term\":\"sayonara\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06642117\"]}");
	add("{\"term\":\"sayornis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01552410\"]}");
	add("{\"term\":\"sayornis phoebe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01552527\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }