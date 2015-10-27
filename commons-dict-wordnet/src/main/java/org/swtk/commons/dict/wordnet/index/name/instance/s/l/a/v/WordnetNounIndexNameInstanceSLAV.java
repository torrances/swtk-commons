package org.swtk.commons.dict.wordnet.index.name.instance.s.l.a.v;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSLAV {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"slav\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09696262\"]}");
	add("{\"term\":\"slave\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10629202\", \"10629072\", \"10628841\"]}");
	add("{\"term\":\"slaveholder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10629612\"]}");
	add("{\"term\":\"slaveholding\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00416455\"]}");
	add("{\"term\":\"slaver\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10629612\", \"10629717\"]}");
	add("{\"term\":\"slavery\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00624785\", \"00416455\", \"14020738\"]}");
	add("{\"term\":\"slavey\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10627449\"]}");
	add("{\"term\":\"slavic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06956533\"]}");
	add("{\"term\":\"slavonic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06956533\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }