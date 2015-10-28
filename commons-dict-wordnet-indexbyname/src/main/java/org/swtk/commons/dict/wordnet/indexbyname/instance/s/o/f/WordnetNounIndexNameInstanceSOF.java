package org.swtk.commons.dict.wordnet.indexbyname.instance.s.o.f;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSOF {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sofa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04263630\"]}");
	add("{\"term\":\"soffit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04263868\"]}");
	add("{\"term\":\"sofia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08732291\"]}");
	add("{\"term\":\"softback\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03892129\"]}");
	add("{\"term\":\"softball\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00476798\", \"04264001\"]}");
	add("{\"term\":\"softener\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15080503\"]}");
	add("{\"term\":\"softening\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13578969\"]}");
	add("{\"term\":\"softheartedness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07520586\"]}");
	add("{\"term\":\"softie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10641100\"]}");
	add("{\"term\":\"softness\", \"synsetCount\":10, \"upperType\":\"NOUN\", \"ids\":[\"04646214\", \"04675496\", \"04711694\", \"04918150\", \"04963596\", \"04997999\", \"14513443\", \"14546172\", \"14570961\", \"04945405\"]}");
	add("{\"term\":\"software\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06578068\"]}");
	add("{\"term\":\"softwood\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15124824\"]}");
	add("{\"term\":\"softy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10641100\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }