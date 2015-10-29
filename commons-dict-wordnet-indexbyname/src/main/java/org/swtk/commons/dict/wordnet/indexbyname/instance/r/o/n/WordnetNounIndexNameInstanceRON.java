package org.swtk.commons.dict.wordnet.indexbyname.instance.r.o.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRON {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ron\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06995774\"]}");
	add("{\"term\":\"ronald george wreyford norrish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11229665\"]}");
	add("{\"term\":\"ronald reagan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11275450\"]}");
	add("{\"term\":\"ronald wilson reagan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11275450\"]}");
	add("{\"term\":\"rondeau\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06392502\", \"07057714\"]}");
	add("{\"term\":\"rondel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06392502\"]}");
	add("{\"term\":\"rondelet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06392897\"]}");
	add("{\"term\":\"rondo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07057714\"]}");
	add("{\"term\":\"roneo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03772994\"]}");
	add("{\"term\":\"roneograph\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03772994\"]}");
	add("{\"term\":\"rontgen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11288316\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }