package org.swtk.commons.dict.wordnet.indexbyname.instance.d.e.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDEI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"deicer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03176877\"]}");
	add("{\"term\":\"deictic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06300473\"]}");
	add("{\"term\":\"deification\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01031146\", \"10438322\", \"14598608\"]}");
	add("{\"term\":\"deimos\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09286927\"]}");
	add("{\"term\":\"deinocheirus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01719235\"]}");
	add("{\"term\":\"deinonychus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01720737\"]}");
	add("{\"term\":\"deipnosophist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10015367\"]}");
	add("{\"term\":\"deism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06233684\"]}");
	add("{\"term\":\"deist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10019979\"]}");
	add("{\"term\":\"deity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09528550\"]}");
	add("{\"term\":\"deixis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06189701\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }