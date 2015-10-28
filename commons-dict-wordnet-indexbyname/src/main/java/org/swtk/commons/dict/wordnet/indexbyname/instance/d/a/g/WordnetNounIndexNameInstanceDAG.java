package org.swtk.commons.dict.wordnet.indexbyname.instance.d.a.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDAG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"dag\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03597088\", \"13746460\"]}");
	add("{\"term\":\"dagame\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12682835\"]}");
	add("{\"term\":\"dagan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09540344\"]}");
	add("{\"term\":\"dagda\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09531798\"]}");
	add("{\"term\":\"dagestani\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08500661\"]}");
	add("{\"term\":\"dagga\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12871666\"]}");
	add("{\"term\":\"dagger\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06841579\", \"03163551\"]}");
	add("{\"term\":\"daggerboard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03163842\"]}");
	add("{\"term\":\"dago\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09735835\"]}");
	add("{\"term\":\"dagon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09540192\"]}");
	add("{\"term\":\"daguerre\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10940584\"]}");
	add("{\"term\":\"daguerreotype\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03163997\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }