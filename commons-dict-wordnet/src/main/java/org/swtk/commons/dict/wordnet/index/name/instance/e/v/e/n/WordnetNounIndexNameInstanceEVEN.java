package org.swtk.commons.dict.wordnet.index.name.instance.e.v.e.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEVEN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"even\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15191509\"]}");
	add("{\"term\":\"evenfall\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15194468\"]}");
	add("{\"term\":\"evening\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"15192953\", \"15292923\", \"15191509\"]}");
	add("{\"term\":\"eveningwear\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03389737\"]}");
	add("{\"term\":\"evenk\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09756838\"]}");
	add("{\"term\":\"evenki\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06941387\", \"09664075\"]}");
	add("{\"term\":\"evenness\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04755738\", \"04776695\", \"13812704\"]}");
	add("{\"term\":\"evensong\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06468429\", \"15254976\"]}");
	add("{\"term\":\"event\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"11430739\", \"11474277\", \"13966452\", \"00029677\"]}");
	add("{\"term\":\"eventide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15191509\"]}");
	add("{\"term\":\"eventration\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14319644\"]}");
	add("{\"term\":\"eventuality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07305484\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }