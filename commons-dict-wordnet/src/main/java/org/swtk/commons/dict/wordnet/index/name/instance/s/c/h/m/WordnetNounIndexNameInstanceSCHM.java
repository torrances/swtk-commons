package org.swtk.commons.dict.wordnet.index.name.instance.s.c.h.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSCHM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"schmaltz\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04635293\"]}");
	add("{\"term\":\"schmalz\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04635293\"]}");
	add("{\"term\":\"schmear\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08417562\"]}");
	add("{\"term\":\"schmeer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08417562\"]}");
	add("{\"term\":\"schmegegge\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06622138\"]}");
	add("{\"term\":\"schmidt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11305272\"]}");
	add("{\"term\":\"schmo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10576832\"]}");
	add("{\"term\":\"schmoose\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07149558\"]}");
	add("{\"term\":\"schmooze\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07149558\"]}");
	add("{\"term\":\"schmoozer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09981478\"]}");
	add("{\"term\":\"schmuck\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10576832\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }