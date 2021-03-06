package org.swtk.commons.dict.wordnet.indexbyname.instance.g.n.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGNA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"gnaeus julius agricola\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10829279\"]}");
	add("{\"term\":\"gnaeus pompeius magnus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11261844\"]}");
	add("{\"term\":\"gnaphalium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11993038\"]}");
	add("{\"term\":\"gnaphalium sylvaticum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11993428\"]}");
	add("{\"term\":\"gnarl\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13908529\"]}");
	add("{\"term\":\"gnat\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02203282\", \"02204939\"]}");
	add("{\"term\":\"gnatcatcher\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01566090\"]}");
	add("{\"term\":\"gnathion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05240302\"]}");
	add("{\"term\":\"gnathostomata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01482284\"]}");
	add("{\"term\":\"gnathostome\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01482461\"]}");
	add("{\"term\":\"gnawer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02332053\"]}");
	add("{\"term\":\"gnawing mammal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02326101\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }