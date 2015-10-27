package org.swtk.commons.dict.wordnet.index.name.instance.m.u.l.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMULL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"mull\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08914238\", \"09385842\"]}");
	add("{\"term\":\"mulla\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10357944\"]}");
	add("{\"term\":\"mullah\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10357944\"]}");
	add("{\"term\":\"mullein\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12909666\"]}");
	add("{\"term\":\"muller\", \"synsetCount\":9, \"upperType\":\"NOUN\", \"ids\":[\"03803687\", \"03925552\", \"10359217\", \"11215285\", \"11215442\", \"11215609\", \"11215761\", \"11215903\", \"11216036\"]}");
	add("{\"term\":\"mullet\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02602588\", \"02603974\", \"07800343\"]}");
	add("{\"term\":\"mullidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02602414\"]}");
	add("{\"term\":\"mulligan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07605639\"]}");
	add("{\"term\":\"mulligatawny\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07601889\"]}");
	add("{\"term\":\"mullion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03803790\"]}");
	add("{\"term\":\"mulloidichthys\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02603287\"]}");
	add("{\"term\":\"mulloway\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02598697\"]}");
	add("{\"term\":\"mullus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02602765\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }