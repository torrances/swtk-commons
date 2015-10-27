package org.swtk.commons.dict.wordnet.index.name.instance.t.a.x.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTAXO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"taxodiaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11660060\"]}");
	add("{\"term\":\"taxodium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11662239\"]}");
	add("{\"term\":\"taxon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08008892\"]}");
	add("{\"term\":\"taxonomer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10713320\"]}");
	add("{\"term\":\"taxonomist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10713320\"]}");
	add("{\"term\":\"taxonomy\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01015712\", \"06162674\", \"08395087\"]}");
	add("{\"term\":\"taxophytina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11680988\"]}");
	add("{\"term\":\"taxopsida\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11680988\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }