package org.swtk.commons.dict.wordnet.index.name.instance.m.e.t.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMETO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"metonym\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06304679\"]}");
	add("{\"term\":\"metonymy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07122361\"]}");
	add("{\"term\":\"metopion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05241346\"]}");
	add("{\"term\":\"metoprolol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03762386\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }