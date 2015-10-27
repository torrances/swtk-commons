package org.swtk.commons.dict.wordnet.index.name.instance.a.m.p.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAMPU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ampul\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03929501\"]}");
	add("{\"term\":\"ampule\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03929501\"]}");
	add("{\"term\":\"ampulla\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02709080\", \"05261661\"]}");
	add("{\"term\":\"amputation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00667593\", \"14574061\"]}");
	add("{\"term\":\"amputator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09808890\"]}");
	add("{\"term\":\"amputee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09809007\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }