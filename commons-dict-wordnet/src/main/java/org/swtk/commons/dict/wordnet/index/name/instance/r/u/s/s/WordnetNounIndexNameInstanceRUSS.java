package org.swtk.commons.dict.wordnet.index.name.instance.r.u.s.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRUSS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"russell\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"11294802\", \"11295025\", \"11295160\", \"11295334\", \"11295485\", \"11295626\", \"11295762\"]}");
	add("{\"term\":\"russet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04128436\"]}");
	add("{\"term\":\"russia\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"09028783\", \"09025184\", \"09030093\", \"09025654\"]}");
	add("{\"term\":\"russian\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06957110\", \"09747745\"]}");
	add("{\"term\":\"russula\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13030540\"]}");
	add("{\"term\":\"russulaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13030824\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }