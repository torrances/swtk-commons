package org.swtk.commons.dict.wordnet.indexbyname.instance.o.m.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceOME {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"omega\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06849649\", \"07369614\"]}");
	add("{\"term\":\"omega centauri\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09401713\"]}");
	add("{\"term\":\"omelet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07858729\"]}");
	add("{\"term\":\"omelet pan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03852197\"]}");
	add("{\"term\":\"omelette\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07858729\"]}");
	add("{\"term\":\"omelette pan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03852197\"]}");
	add("{\"term\":\"omen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07301073\"]}");
	add("{\"term\":\"omental bursa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05435713\"]}");
	add("{\"term\":\"omentum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05437102\"]}");
	add("{\"term\":\"omeprazole\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14801765\"]}");
	add("{\"term\":\"omerta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06681758\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }