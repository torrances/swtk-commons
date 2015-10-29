package org.swtk.commons.dict.wordnet.indexbyname.instance.f.u.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFUG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"fug\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14545556\"]}");
	add("{\"term\":\"fugaciousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05062654\"]}");
	add("{\"term\":\"fugacity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05062654\", \"05063029\"]}");
	add("{\"term\":\"fugard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11004975\"]}");
	add("{\"term\":\"fugitive\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10134554\", \"10134739\"]}");
	add("{\"term\":\"fugitive from justice\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10134554\"]}");
	add("{\"term\":\"fugleman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10134928\"]}");
	add("{\"term\":\"fugo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02785455\"]}");
	add("{\"term\":\"fugu\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07798180\"]}");
	add("{\"term\":\"fugue\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07057421\", \"14053773\", \"14417884\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }