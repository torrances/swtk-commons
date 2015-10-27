package org.swtk.commons.dict.wordnet.index.name.instance.m.i.l.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMILI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"miliaria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14345533\"]}");
	add("{\"term\":\"milieu\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14537546\"]}");
	add("{\"term\":\"militainment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00516802\"]}");
	add("{\"term\":\"militance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04844846\"]}");
	add("{\"term\":\"militancy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04844846\"]}");
	add("{\"term\":\"militant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10335495\"]}");
	add("{\"term\":\"militarisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01158925\"]}");
	add("{\"term\":\"militarism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06231919\"]}");
	add("{\"term\":\"militarist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10335671\"]}");
	add("{\"term\":\"militarization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01158925\"]}");
	add("{\"term\":\"military\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08215965\"]}");
	add("{\"term\":\"militia\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08407688\", \"08407468\"]}");
	add("{\"term\":\"militiaman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10337375\"]}");
	add("{\"term\":\"milium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05252969\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }