package org.swtk.commons.dict.wordnet.indexbyname.instance.e.g.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEGG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"egg\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05532266\", \"07856780\", \"01463098\"]}");
	add("{\"term\":\"eggar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02309477\"]}");
	add("{\"term\":\"eggbeater\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03271282\", \"03517291\"]}");
	add("{\"term\":\"eggcup\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03271409\"]}");
	add("{\"term\":\"egger\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02309477\"]}");
	add("{\"term\":\"eggfruit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07771238\"]}");
	add("{\"term\":\"egghead\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10066838\"]}");
	add("{\"term\":\"eggnog\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07948279\"]}");
	add("{\"term\":\"eggplant\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12916760\", \"07728819\"]}");
	add("{\"term\":\"eggs\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07856780\"]}");
	add("{\"term\":\"eggshake\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07939735\"]}");
	add("{\"term\":\"eggshell\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09455334\"]}");
	add("{\"term\":\"eggwhisk\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03271282\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }