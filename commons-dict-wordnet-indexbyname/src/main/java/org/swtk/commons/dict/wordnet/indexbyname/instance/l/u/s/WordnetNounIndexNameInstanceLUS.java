package org.swtk.commons.dict.wordnet.indexbyname.instance.l.u.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLUS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lusaka\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09188789\"]}");
	add("{\"term\":\"lusatian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06958106\"]}");
	add("{\"term\":\"luscinia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01562605\"]}");
	add("{\"term\":\"lusciousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05002958\"]}");
	add("{\"term\":\"lush\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09801608\"]}");
	add("{\"term\":\"lushness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05123543\"]}");
	add("{\"term\":\"lushun\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08745229\"]}");
	add("{\"term\":\"lusitania\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09189097\"]}");
	add("{\"term\":\"lust\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00760688\", \"07504854\"]}");
	add("{\"term\":\"luster\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04708510\", \"04961860\", \"04962097\"]}");
	add("{\"term\":\"lusterlessness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04963287\"]}");
	add("{\"term\":\"lusterware\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03703560\"]}");
	add("{\"term\":\"lustfulness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07504854\"]}");
	add("{\"term\":\"lustiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05038178\"]}");
	add("{\"term\":\"lustre\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04961860\", \"04962097\", \"04708510\"]}");
	add("{\"term\":\"lustrelessness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04963287\"]}");
	add("{\"term\":\"lustrum\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01029604\", \"15229703\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }