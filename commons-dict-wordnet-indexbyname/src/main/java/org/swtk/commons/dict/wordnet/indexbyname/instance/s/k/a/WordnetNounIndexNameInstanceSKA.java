package org.swtk.commons.dict.wordnet.indexbyname.instance.s.k.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSKA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"skag\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02840630\"]}");
	add("{\"term\":\"skagerak\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09459203\"]}");
	add("{\"term\":\"skagerrak\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09459203\"]}");
	add("{\"term\":\"skagit\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06927107\", \"09689647\"]}");
	add("{\"term\":\"skagway\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09078939\"]}");
	add("{\"term\":\"skanda\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09552135\"]}");
	add("{\"term\":\"skank\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00528356\", \"14880903\"]}");
	add("{\"term\":\"skate\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01503801\", \"04232791\"]}");
	add("{\"term\":\"skateboard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04233049\"]}");
	add("{\"term\":\"skateboarder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10623788\"]}");
	add("{\"term\":\"skateboarding\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00450039\"]}");
	add("{\"term\":\"skater\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10623899\"]}");
	add("{\"term\":\"skating\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00449451\"]}");
	add("{\"term\":\"skaw\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09459036\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }