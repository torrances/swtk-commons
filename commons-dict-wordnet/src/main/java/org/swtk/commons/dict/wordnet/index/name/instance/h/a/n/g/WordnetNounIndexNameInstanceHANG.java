package org.swtk.commons.dict.wordnet.index.name.instance.h.a.n.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHANG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"hang\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00437279\", \"04939014\", \"05632037\"]}");
	add("{\"term\":\"hangar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02690680\"]}");
	add("{\"term\":\"hangbird\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01575130\"]}");
	add("{\"term\":\"hangchow\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08745439\"]}");
	add("{\"term\":\"hanger\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03495985\", \"10179027\"]}");
	add("{\"term\":\"hanging\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01019643\", \"01167364\", \"03496279\"]}");
	add("{\"term\":\"hangman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10179208\"]}");
	add("{\"term\":\"hangnail\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05592396\"]}");
	add("{\"term\":\"hangout\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08599031\"]}");
	add("{\"term\":\"hangover\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01024234\", \"10200422\", \"14470631\"]}");
	add("{\"term\":\"hangzhou\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08745439\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }