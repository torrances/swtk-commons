package org.swtk.commons.dict.wordnet.indexbyname.instance.a.b.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceABB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"abb\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08027998\"]}");
	add("{\"term\":\"abbacy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08567939\"]}");
	add("{\"term\":\"abbe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09773483\"]}");
	add("{\"term\":\"abbe condenser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02669874\"]}");
	add("{\"term\":\"abbess\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09773548\"]}");
	add("{\"term\":\"abbey\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02670009\", \"02670108\", \"02670206\"]}");
	add("{\"term\":\"abbot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09773735\"]}");
	add("{\"term\":\"abbott lawrence lowell\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11162358\"]}");
	add("{\"term\":\"abbreviation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00359961\", \"07105779\"]}");
	add("{\"term\":\"abbreviator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09774238\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }