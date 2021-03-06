package org.swtk.commons.dict.wordnet.indexbyname.instance.e.s.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceESS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"essay\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00788872\", \"06421205\"]}");
	add("{\"term\":\"essayer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10748650\"]}");
	add("{\"term\":\"essayist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10084212\"]}");
	add("{\"term\":\"esselen\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06933869\", \"09674918\"]}");
	add("{\"term\":\"essen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08790627\"]}");
	add("{\"term\":\"essence\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03922150\", \"06616419\", \"15134663\", \"05929717\"]}");
	add("{\"term\":\"essene\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09675059\"]}");
	add("{\"term\":\"essential\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09390100\"]}");
	add("{\"term\":\"essential amino acid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14629965\"]}");
	add("{\"term\":\"essential condition\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05901868\"]}");
	add("{\"term\":\"essential hypertension\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14128127\"]}");
	add("{\"term\":\"essential oil\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14916806\"]}");
	add("{\"term\":\"essential thrombocytopenia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14221262\"]}");
	add("{\"term\":\"essential tremor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14028787\"]}");
	add("{\"term\":\"essentiality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05178572\"]}");
	add("{\"term\":\"essentialness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05178572\"]}");
	add("{\"term\":\"essex\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08902288\"]}");
	add("{\"term\":\"essonite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14927617\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }