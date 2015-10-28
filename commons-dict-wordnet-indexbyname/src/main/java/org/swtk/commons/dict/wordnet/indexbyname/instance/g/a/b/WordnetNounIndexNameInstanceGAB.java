package org.swtk.commons.dict.wordnet.indexbyname.instance.g.a.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGAB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"gab\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07149788\"]}");
	add("{\"term\":\"gaba\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14630468\"]}");
	add("{\"term\":\"gabapentin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03413980\"]}");
	add("{\"term\":\"gabardine\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03263433\", \"03361927\", \"03414207\"]}");
	add("{\"term\":\"gabble\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06623345\"]}");
	add("{\"term\":\"gabbro\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14956783\"]}");
	add("{\"term\":\"gaberdine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03263433\"]}");
	add("{\"term\":\"gabfest\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07149788\"]}");
	add("{\"term\":\"gable\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11006433\", \"03414303\"]}");
	add("{\"term\":\"gabon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08965302\"]}");
	add("{\"term\":\"gabonese\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09729437\"]}");
	add("{\"term\":\"gabor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11006558\"]}");
	add("{\"term\":\"gaboriau\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11006706\"]}");
	add("{\"term\":\"gaborone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08871677\"]}");
	add("{\"term\":\"gabriel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09562505\"]}");
	add("{\"term\":\"gabun\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08965302\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }