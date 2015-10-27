package org.swtk.commons.dict.wordnet.index.name.instance.j.u.n.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceJUNK {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"junk\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03608807\", \"14882048\"]}");
	add("{\"term\":\"junker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09768101\"]}");
	add("{\"term\":\"junkers\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11114770\"]}");
	add("{\"term\":\"junket\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00309507\", \"00312635\", \"07627342\"]}");
	add("{\"term\":\"junketing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00312986\"]}");
	add("{\"term\":\"junkie\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09788499\", \"10055677\"]}");
	add("{\"term\":\"junky\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09788499\", \"10055677\"]}");
	add("{\"term\":\"junkyard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08604533\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }