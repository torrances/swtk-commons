package org.swtk.commons.dict.wordnet.index.name.instance.g.r.e.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGREA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"grease\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14521680\", \"14915096\"]}");
	add("{\"term\":\"greaseball\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09735835\"]}");
	add("{\"term\":\"greasepaint\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03461389\"]}");
	add("{\"term\":\"greaser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09742312\"]}");
	add("{\"term\":\"greasewood\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11855720\"]}");
	add("{\"term\":\"greasiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05007281\"]}");
	add("{\"term\":\"great\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10164601\"]}");
	add("{\"term\":\"greatcoat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03461607\"]}");
	add("{\"term\":\"greatness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05111848\", \"05177128\"]}");
	add("{\"term\":\"greave\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03462393\"]}");
	add("{\"term\":\"greaves\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14701646\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }