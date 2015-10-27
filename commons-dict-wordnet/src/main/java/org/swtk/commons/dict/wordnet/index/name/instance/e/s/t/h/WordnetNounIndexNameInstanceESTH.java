package org.swtk.commons.dict.wordnet.index.name.instance.e.s.t.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceESTH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"esther\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06448387\", \"10981364\"]}");
	add("{\"term\":\"esthesia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05685989\"]}");
	add("{\"term\":\"esthesis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05720023\"]}");
	add("{\"term\":\"esthete\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10084344\"]}");
	add("{\"term\":\"esthetic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05977838\"]}");
	add("{\"term\":\"esthetician\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10084476\", \"10084638\"]}");
	add("{\"term\":\"esthetics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06170939\"]}");
	add("{\"term\":\"esthonia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09034667\"]}");
	add("{\"term\":\"esthonian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06970636\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }