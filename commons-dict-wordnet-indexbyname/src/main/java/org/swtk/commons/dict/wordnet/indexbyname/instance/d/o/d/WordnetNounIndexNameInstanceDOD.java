package org.swtk.commons.dict.wordnet.indexbyname.instance.d.o.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDOD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"dod\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08148512\"]}");
	add("{\"term\":\"dodder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12846257\"]}");
	add("{\"term\":\"dodderer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10042370\"]}");
	add("{\"term\":\"doddle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00576694\"]}");
	add("{\"term\":\"dodecagon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13905540\"]}");
	add("{\"term\":\"dodecahedron\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13938817\"]}");
	add("{\"term\":\"dodecanese\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08801138\"]}");
	add("{\"term\":\"dodge\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06769391\", \"00060715\", \"05914396\"]}");
	add("{\"term\":\"dodgem\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02922348\"]}");
	add("{\"term\":\"dodger\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07704502\", \"10042484\"]}");
	add("{\"term\":\"dodging\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00204602\", \"06769391\", \"00742010\"]}");
	add("{\"term\":\"dodgson\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10903813\"]}");
	add("{\"term\":\"dodo\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01813884\", \"10042633\"]}");
	add("{\"term\":\"dodoma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09057628\"]}");
	add("{\"term\":\"dodonaea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12761839\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }