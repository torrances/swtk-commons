package org.swtk.commons.dict.wordnet.indexbyname.instance.z.e.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceZEA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"zea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12164089\"]}");
	add("{\"term\":\"zea mays\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12164193\"]}");
	add("{\"term\":\"zea mays amylacea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12165842\"]}");
	add("{\"term\":\"zea mays everta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12165994\"]}");
	add("{\"term\":\"zea mays indentata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12165504\"]}");
	add("{\"term\":\"zea mays indurata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12165665\"]}");
	add("{\"term\":\"zea mays rugosa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12165259\"]}");
	add("{\"term\":\"zea saccharata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12165259\"]}");
	add("{\"term\":\"zeal\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04652076\", \"07496925\", \"07570967\"]}");
	add("{\"term\":\"zealand\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08779530\"]}");
	add("{\"term\":\"zealander\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09719413\"]}");
	add("{\"term\":\"zealot\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10421831\", \"10824878\"]}");
	add("{\"term\":\"zealotry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06216069\"]}");
	add("{\"term\":\"zeaxanthin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14745942\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }