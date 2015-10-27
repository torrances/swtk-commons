package org.swtk.commons.dict.wordnet.index.name.instance.p.a.c.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePACI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pacific\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09405883\"]}");
	add("{\"term\":\"pacification\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00965860\", \"06786777\", \"01153592\"]}");
	add("{\"term\":\"pacificism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05955255\", \"05974453\"]}");
	add("{\"term\":\"pacificist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10409898\"]}");
	add("{\"term\":\"pacifier\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03079772\", \"03876139\", \"09971642\"]}");
	add("{\"term\":\"pacifism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05955255\", \"05974453\"]}");
	add("{\"term\":\"pacifist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10409898\"]}");
	add("{\"term\":\"pacing\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00290399\", \"15289174\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }