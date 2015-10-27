package org.swtk.commons.dict.wordnet.index.name.instance.s.c.r.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSCRI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"scriabin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11309820\"]}");
	add("{\"term\":\"scribble\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04162371\", \"06415790\"]}");
	add("{\"term\":\"scribbler\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10583368\", \"10584088\"]}");
	add("{\"term\":\"scribe\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04162518\", \"09984335\", \"10584088\", \"11309989\"]}");
	add("{\"term\":\"scriber\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04162518\"]}");
	add("{\"term\":\"scrim\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04162686\"]}");
	add("{\"term\":\"scrimmage\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00555237\", \"00899825\"]}");
	add("{\"term\":\"scrimshanker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10584228\"]}");
	add("{\"term\":\"scrimshaw\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04162796\"]}");
	add("{\"term\":\"scrip\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13438070\"]}");
	add("{\"term\":\"scripps\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11310097\", \"11310262\"]}");
	add("{\"term\":\"script\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06363020\", \"06415036\", \"07023062\"]}");
	add("{\"term\":\"scriptorium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04162950\"]}");
	add("{\"term\":\"scripture\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06442055\", \"06443410\"]}");
	add("{\"term\":\"scriptwriter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10584333\"]}");
	add("{\"term\":\"scrivener\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09984335\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }