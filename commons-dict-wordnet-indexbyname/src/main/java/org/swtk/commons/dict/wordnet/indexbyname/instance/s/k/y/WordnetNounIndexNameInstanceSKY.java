package org.swtk.commons.dict.wordnet.indexbyname.instance.s.k.y;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSKY {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sky\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09459612\"]}");
	add("{\"term\":\"skybox\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04239421\"]}");
	add("{\"term\":\"skycap\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10627589\"]}");
	add("{\"term\":\"skydiver\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10627704\"]}");
	add("{\"term\":\"skydiving\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00304866\"]}");
	add("{\"term\":\"skyhook\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04239546\", \"04239652\"]}");
	add("{\"term\":\"skylab\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04239800\"]}");
	add("{\"term\":\"skylark\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01530558\"]}");
	add("{\"term\":\"skylight\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04239909\"]}");
	add("{\"term\":\"skyline\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08603184\", \"08669310\"]}");
	add("{\"term\":\"skyrocket\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04240011\", \"07277721\"]}");
	add("{\"term\":\"skysail\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04240136\"]}");
	add("{\"term\":\"skyscraper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04240233\"]}");
	add("{\"term\":\"skywalk\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04240404\"]}");
	add("{\"term\":\"skyway\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08509556\"]}");
	add("{\"term\":\"skywriting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06415495\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }