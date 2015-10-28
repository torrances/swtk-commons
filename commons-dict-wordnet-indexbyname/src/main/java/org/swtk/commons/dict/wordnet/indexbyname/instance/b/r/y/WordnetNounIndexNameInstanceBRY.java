package org.swtk.commons.dict.wordnet.indexbyname.instance.b.r.y;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBRY {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"brya\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11769405\"]}");
	add("{\"term\":\"bryaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11561421\"]}");
	add("{\"term\":\"bryales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11560451\"]}");
	add("{\"term\":\"bryan\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09166286\", \"10888972\"]}");
	add("{\"term\":\"bryanthus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12253766\"]}");
	add("{\"term\":\"brynhild\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09613669\"]}");
	add("{\"term\":\"bryony\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12183552\"]}");
	add("{\"term\":\"bryophyta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11557229\"]}");
	add("{\"term\":\"bryophyte\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11557778\"]}");
	add("{\"term\":\"bryopsida\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11559386\"]}");
	add("{\"term\":\"bryozoa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02316147\"]}");
	add("{\"term\":\"bryozoan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02316361\"]}");
	add("{\"term\":\"brythonic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06974139\"]}");
	add("{\"term\":\"bryum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11561562\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }