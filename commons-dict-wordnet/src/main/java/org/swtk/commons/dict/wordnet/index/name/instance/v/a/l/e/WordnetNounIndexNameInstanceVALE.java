package org.swtk.commons.dict.wordnet.index.name.instance.v.a.l.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceVALE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"vale\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09491734\"]}");
	add("{\"term\":\"valediction\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00054345\", \"07258225\"]}");
	add("{\"term\":\"valedictorian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10764674\"]}");
	add("{\"term\":\"valedictory\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07258225\"]}");
	add("{\"term\":\"valence\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05041628\", \"05042144\"]}");
	add("{\"term\":\"valencia\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09050847\", \"09185870\"]}");
	add("{\"term\":\"valenciennes\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04525938\", \"08958251\"]}");
	add("{\"term\":\"valency\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05041628\", \"05042144\", \"11456605\"]}");
	add("{\"term\":\"valentine\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06640323\", \"10764849\"]}");
	add("{\"term\":\"valerian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12970886\"]}");
	add("{\"term\":\"valeriana\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12970715\"]}");
	add("{\"term\":\"valerianaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12970482\"]}");
	add("{\"term\":\"valerianella\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12971261\"]}");
	add("{\"term\":\"valet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10765000\"]}");
	add("{\"term\":\"valetta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08988998\"]}");
	add("{\"term\":\"valetudinarian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10765281\"]}");
	add("{\"term\":\"valetudinarianism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14571235\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }