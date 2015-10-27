package org.swtk.commons.dict.wordnet.index.name.instance.s.i.l.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSILK {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"silk\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"15066478\", \"04226491\"]}");
	add("{\"term\":\"silkgrass\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12147033\"]}");
	add("{\"term\":\"silkiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04954671\"]}");
	add("{\"term\":\"silks\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04226647\"]}");
	add("{\"term\":\"silkscreen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04226785\"]}");
	add("{\"term\":\"silkweed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13254625\"]}");
	add("{\"term\":\"silkwood\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12214664\"]}");
	add("{\"term\":\"silkworm\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02305272\", \"02303449\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }