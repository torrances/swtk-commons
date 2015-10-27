package org.swtk.commons.dict.wordnet.index.name.instance.m.a.n.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMANG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"manga\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06379605\"]}");
	add("{\"term\":\"mangabey\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02488619\"]}");
	add("{\"term\":\"manganate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14971583\"]}");
	add("{\"term\":\"manganese\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14668832\"]}");
	add("{\"term\":\"manganite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14705261\"]}");
	add("{\"term\":\"mange\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14297719\"]}");
	add("{\"term\":\"manger\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03722670\"]}");
	add("{\"term\":\"mangifera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12781883\"]}");
	add("{\"term\":\"manginess\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04823992\"]}");
	add("{\"term\":\"mangle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03722824\"]}");
	add("{\"term\":\"mangler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10361686\"]}");
	add("{\"term\":\"manglietia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11732440\"]}");
	add("{\"term\":\"mango\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07780131\", \"12782044\"]}");
	add("{\"term\":\"mangold\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11853368\"]}");
	add("{\"term\":\"mangonel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02985366\"]}");
	add("{\"term\":\"mangosteen\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07779963\", \"12387192\"]}");
	add("{\"term\":\"mangrove\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12366416\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }