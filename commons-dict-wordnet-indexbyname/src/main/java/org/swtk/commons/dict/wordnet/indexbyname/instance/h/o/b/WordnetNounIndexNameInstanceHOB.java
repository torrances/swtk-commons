package org.swtk.commons.dict.wordnet.indexbyname.instance.h.o.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHOB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"hob\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03528451\", \"03528561\", \"09563850\", \"09566877\"]}");
	add("{\"term\":\"hobart\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08853272\"]}");
	add("{\"term\":\"hobbes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11072950\"]}");
	add("{\"term\":\"hobbit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09512125\"]}");
	add("{\"term\":\"hobble\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00287600\", \"03335892\"]}");
	add("{\"term\":\"hobbledehoy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10198452\"]}");
	add("{\"term\":\"hobbler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10198548\"]}");
	add("{\"term\":\"hobbs\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11073213\"]}");
	add("{\"term\":\"hobby\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01615117\", \"03528796\", \"00433629\"]}");
	add("{\"term\":\"hobbyhorse\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03528796\", \"05713530\"]}");
	add("{\"term\":\"hobbyism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01209400\"]}");
	add("{\"term\":\"hobbyist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10198700\"]}");
	add("{\"term\":\"hobgoblin\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05819688\", \"09566877\"]}");
	add("{\"term\":\"hobnail\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03529012\"]}");
	add("{\"term\":\"hobo\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10719072\", \"10742949\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }