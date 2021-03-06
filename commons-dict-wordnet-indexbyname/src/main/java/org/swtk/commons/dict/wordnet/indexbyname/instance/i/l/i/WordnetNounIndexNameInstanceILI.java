package org.swtk.commons.dict.wordnet.indexbyname.instance.i.l.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceILI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"iliac artery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05354694\"]}");
	add("{\"term\":\"iliac vein\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05377468\"]}");
	add("{\"term\":\"iliad\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06393695\"]}");
	add("{\"term\":\"iliamna\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12201664\"]}");
	add("{\"term\":\"iliamna acerifolia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12202129\"]}");
	add("{\"term\":\"iliamna remota\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12201869\"]}");
	add("{\"term\":\"iliamna ruvularis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12202129\"]}");
	add("{\"term\":\"ilich ramirez sanchez\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11221376\"]}");
	add("{\"term\":\"ilich sanchez\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11221376\"]}");
	add("{\"term\":\"iliolumbar artery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05355419\"]}");
	add("{\"term\":\"iliolumbar vein\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05377636\"]}");
	add("{\"term\":\"ilion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08806739\"]}");
	add("{\"term\":\"ilium\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05282814\", \"08806739\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }