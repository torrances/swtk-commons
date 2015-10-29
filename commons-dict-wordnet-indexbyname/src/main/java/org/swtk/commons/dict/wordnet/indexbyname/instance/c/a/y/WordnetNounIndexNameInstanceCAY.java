package org.swtk.commons.dict.wordnet.indexbyname.instance.c.a.y;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCAY {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cay\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09348301\"]}");
	add("{\"term\":\"cayenne\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07737687\", \"07838494\", \"12921747\"]}");
	add("{\"term\":\"cayenne jasmine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11792877\"]}");
	add("{\"term\":\"cayenne pepper\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07737687\", \"07838494\", \"12921747\"]}");
	add("{\"term\":\"cayman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01701681\"]}");
	add("{\"term\":\"cayman islands\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08727232\"]}");
	add("{\"term\":\"cayman islands dollar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13695072\"]}");
	add("{\"term\":\"cayuga\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06928993\", \"09671358\"]}");
	add("{\"term\":\"cayuga lake\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09262487\"]}");
	add("{\"term\":\"cayuse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02384691\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }