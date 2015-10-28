package org.swtk.commons.dict.wordnet.indexbyname.instance.h.e.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHEC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"hecate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09584884\"]}");
	add("{\"term\":\"hecatomb\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00228715\"]}");
	add("{\"term\":\"hecht\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11057962\"]}");
	add("{\"term\":\"heckelphone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03516010\"]}");
	add("{\"term\":\"heckle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03504010\"]}");
	add("{\"term\":\"heckler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10187158\"]}");
	add("{\"term\":\"heckling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01070557\"]}");
	add("{\"term\":\"hectare\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13635266\"]}");
	add("{\"term\":\"hectogram\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13746584\"]}");
	add("{\"term\":\"hectograph\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03516131\"]}");
	add("{\"term\":\"hectoliter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13646100\"]}");
	add("{\"term\":\"hectolitre\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13646100\"]}");
	add("{\"term\":\"hectometer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13681602\"]}");
	add("{\"term\":\"hectometre\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13681602\"]}");
	add("{\"term\":\"hector\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09623205\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }