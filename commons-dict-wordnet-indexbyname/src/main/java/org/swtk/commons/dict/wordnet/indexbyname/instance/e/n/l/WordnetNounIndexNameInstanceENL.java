package org.swtk.commons.dict.wordnet.indexbyname.instance.e.n.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceENL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"enl\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14250497\"]}");
	add("{\"term\":\"enlarged heart\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14358036\"]}");
	add("{\"term\":\"enlargement\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03294373\", \"07187407\", \"14338498\", \"00366535\"]}");
	add("{\"term\":\"enlarger\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03294571\"]}");
	add("{\"term\":\"enlightened\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07965104\"]}");
	add("{\"term\":\"enlightenment\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08489601\", \"14011709\", \"05995280\"]}");
	add("{\"term\":\"enlil\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09541155\"]}");
	add("{\"term\":\"enlisted man\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10078393\"]}");
	add("{\"term\":\"enlisted officer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10380446\"]}");
	add("{\"term\":\"enlisted person\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10078585\"]}");
	add("{\"term\":\"enlisted woman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10078770\"]}");
	add("{\"term\":\"enlistee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10531794\"]}");
	add("{\"term\":\"enlisting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01266204\"]}");
	add("{\"term\":\"enlistment\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01209476\", \"15318833\"]}");
	add("{\"term\":\"enlivener\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09425579\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }