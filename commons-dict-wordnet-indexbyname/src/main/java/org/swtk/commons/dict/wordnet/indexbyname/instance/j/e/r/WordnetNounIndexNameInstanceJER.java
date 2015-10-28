package org.swtk.commons.dict.wordnet.indexbyname.instance.j.e.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceJER {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"jerboa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02354522\"]}");
	add("{\"term\":\"jeremiad\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07226034\"]}");
	add("{\"term\":\"jeremiah\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06449960\", \"11102832\"]}");
	add("{\"term\":\"jerevan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09040400\"]}");
	add("{\"term\":\"jerez\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09048574\"]}");
	add("{\"term\":\"jericho\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08947609\"]}");
	add("{\"term\":\"jerk\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00116320\", \"00627663\", \"07680515\", \"15304501\", \"00336814\", \"10240710\"]}");
	add("{\"term\":\"jerker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10821751\"]}");
	add("{\"term\":\"jerkin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03600457\"]}");
	add("{\"term\":\"jerkiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04777774\"]}");
	add("{\"term\":\"jerking\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00336814\"]}");
	add("{\"term\":\"jerky\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07680515\"]}");
	add("{\"term\":\"jeroboam\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03600602\", \"11102642\"]}");
	add("{\"term\":\"jerome\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11103054\"]}");
	add("{\"term\":\"jerry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09767570\"]}");
	add("{\"term\":\"jersey\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"02409401\", \"03600716\", \"03600807\", \"08907465\", \"09134928\"]}");
	add("{\"term\":\"jerusalem\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08812650\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }