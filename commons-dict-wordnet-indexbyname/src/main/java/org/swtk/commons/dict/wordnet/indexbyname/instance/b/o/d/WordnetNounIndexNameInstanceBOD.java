package org.swtk.commons.dict.wordnet.indexbyname.instance.b.o.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBOD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"bod\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05224424\"]}");
	add("{\"term\":\"boddhisatva\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09555495\"]}");
	add("{\"term\":\"bodega\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02864626\"]}");
	add("{\"term\":\"bodensee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09275672\"]}");
	add("{\"term\":\"bodhisattva\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09555495\"]}");
	add("{\"term\":\"bodice\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02864727\"]}");
	add("{\"term\":\"boding\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07537367\"]}");
	add("{\"term\":\"bodkin\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"02864849\", \"02864998\", \"02865117\", \"03987452\"]}");
	add("{\"term\":\"bodoni\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06839776\", \"10873861\"]}");
	add("{\"term\":\"body\", \"synsetCount\":11, \"upperType\":\"NOUN\", \"ids\":[\"02865226\", \"04268616\", \"05031782\", \"06406344\", \"04941723\", \"08453298\", \"05557463\", \"09247818\", \"05225115\", \"07981699\", \"05223633\"]}");
	add("{\"term\":\"bodybuilder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09882251\"]}");
	add("{\"term\":\"bodybuilding\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00627233\"]}");
	add("{\"term\":\"bodyguard\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08232722\", \"09882437\"]}");
	add("{\"term\":\"bodywork\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00714745\", \"02866766\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }