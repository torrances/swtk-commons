package org.swtk.commons.dict.wordnet.index.name.instance.s.c.o.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSCOT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"scot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09749875\"]}");
	add("{\"term\":\"scotch\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07923788\", \"13928411\"]}");
	add("{\"term\":\"scotchman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09749875\"]}");
	add("{\"term\":\"scotchwoman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09750074\"]}");
	add("{\"term\":\"scoter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01856139\"]}");
	add("{\"term\":\"scotland\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08910324\"]}");
	add("{\"term\":\"scotoma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14579795\"]}");
	add("{\"term\":\"scots\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06962971\"]}");
	add("{\"term\":\"scotsman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09749875\"]}");
	add("{\"term\":\"scotswoman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09750074\"]}");
	add("{\"term\":\"scott\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"11308920\", \"11309151\", \"11309297\", \"11309481\", \"11309699\"]}");
	add("{\"term\":\"scottie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02099950\"]}");
	add("{\"term\":\"scottish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06962971\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }