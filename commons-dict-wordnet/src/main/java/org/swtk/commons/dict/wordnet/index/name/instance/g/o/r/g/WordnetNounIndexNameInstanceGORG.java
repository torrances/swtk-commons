package org.swtk.commons.dict.wordnet.index.name.instance.g.o.r.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGORG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"gorgas\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11028458\"]}");
	add("{\"term\":\"gorge\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05541581\", \"09286818\", \"09313350\"]}");
	add("{\"term\":\"gorger\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10581041\"]}");
	add("{\"term\":\"gorgerin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03453435\"]}");
	add("{\"term\":\"gorget\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03453534\"]}");
	add("{\"term\":\"gorgon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09518234\"]}");
	add("{\"term\":\"gorgonacea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01918651\"]}");
	add("{\"term\":\"gorgoniacea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01918651\"]}");
	add("{\"term\":\"gorgonian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01918828\"]}");
	add("{\"term\":\"gorgonocephalus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02321450\"]}");
	add("{\"term\":\"gorgonzola\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07868352\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }