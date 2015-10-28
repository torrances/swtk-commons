package org.swtk.commons.dict.wordnet.indexbyname.instance.h.e.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHES {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"heshvan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15239435\"]}");
	add("{\"term\":\"hesiod\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11067328\"]}");
	add("{\"term\":\"hesitance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07538724\"]}");
	add("{\"term\":\"hesitancy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04653300\", \"07538724\"]}");
	add("{\"term\":\"hesitater\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10622936\"]}");
	add("{\"term\":\"hesitation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01065274\", \"04653300\", \"05707399\"]}");
	add("{\"term\":\"hesitator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10622936\"]}");
	add("{\"term\":\"hesperides\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09572345\"]}");
	add("{\"term\":\"hesperiphona\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01543073\"]}");
	add("{\"term\":\"hesperis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11909090\"]}");
	add("{\"term\":\"hesperus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09299778\"]}");
	add("{\"term\":\"hess\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"11067516\", \"11067696\", \"11067956\", \"11068104\"]}");
	add("{\"term\":\"hesse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11068200\"]}");
	add("{\"term\":\"hessian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03522007\"]}");
	add("{\"term\":\"hessonite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14927617\"]}");
	add("{\"term\":\"hestia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09587127\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }