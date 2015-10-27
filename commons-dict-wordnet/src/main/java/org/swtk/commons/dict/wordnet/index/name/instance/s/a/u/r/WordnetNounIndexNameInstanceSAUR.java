package org.swtk.commons.dict.wordnet.index.name.instance.s.a.u.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSAUR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"saurel\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02583310\", \"02583461\"]}");
	add("{\"term\":\"sauria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01676309\"]}");
	add("{\"term\":\"saurian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01676857\"]}");
	add("{\"term\":\"saurischia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01710536\"]}");
	add("{\"term\":\"saurischian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01710747\"]}");
	add("{\"term\":\"sauromalus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01680878\"]}");
	add("{\"term\":\"sauropod\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01711639\"]}");
	add("{\"term\":\"sauropoda\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01711419\"]}");
	add("{\"term\":\"sauropodomorpha\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01710973\"]}");
	add("{\"term\":\"sauropterygia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01727881\"]}");
	add("{\"term\":\"saurosuchus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01698667\"]}");
	add("{\"term\":\"saururaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13172345\"]}");
	add("{\"term\":\"saururus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13172597\"]}");
	add("{\"term\":\"saury\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02554299\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }