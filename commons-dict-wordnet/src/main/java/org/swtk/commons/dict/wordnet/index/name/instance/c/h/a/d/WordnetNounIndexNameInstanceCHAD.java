package org.swtk.commons.dict.wordnet.index.name.instance.c.h.a.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCHAD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"chad\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"06998936\", \"08737870\", \"09353373\", \"14829846\"]}");
	add("{\"term\":\"chadar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03002448\"]}");
	add("{\"term\":\"chaddar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03002448\"]}");
	add("{\"term\":\"chadian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09717046\"]}");
	add("{\"term\":\"chadic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06998936\"]}");
	add("{\"term\":\"chadlock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11917191\"]}");
	add("{\"term\":\"chador\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03002448\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }