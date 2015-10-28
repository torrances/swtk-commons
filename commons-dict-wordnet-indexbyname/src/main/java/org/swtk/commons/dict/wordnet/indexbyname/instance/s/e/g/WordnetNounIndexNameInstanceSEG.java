package org.swtk.commons.dict.wordnet.indexbyname.instance.s.e.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSEG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"segal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11311169\"]}");
	add("{\"term\":\"segment\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09452291\", \"04172050\"]}");
	add("{\"term\":\"segmentation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00398761\", \"13470329\"]}");
	add("{\"term\":\"segno\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06882321\"]}");
	add("{\"term\":\"segovia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11311274\"]}");
	add("{\"term\":\"segregate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10595667\"]}");
	add("{\"term\":\"segregation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01204674\", \"08397071\", \"13575324\"]}");
	add("{\"term\":\"segregationism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06226742\"]}");
	add("{\"term\":\"segregationist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10595760\"]}");
	add("{\"term\":\"segregator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10595760\"]}");
	add("{\"term\":\"segue\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00202246\"]}");
	add("{\"term\":\"segway\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04175260\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }