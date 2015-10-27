package org.swtk.commons.dict.wordnet.index.name.instance.b.o.r.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBORE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"bore\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"02878475\", \"05110583\", \"07418520\", \"09886843\"]}");
	add("{\"term\":\"boreas\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09580044\", \"11508350\"]}");
	add("{\"term\":\"borecole\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11897445\"]}");
	add("{\"term\":\"boredom\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07555178\"]}");
	add("{\"term\":\"borer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01925666\", \"02878678\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }