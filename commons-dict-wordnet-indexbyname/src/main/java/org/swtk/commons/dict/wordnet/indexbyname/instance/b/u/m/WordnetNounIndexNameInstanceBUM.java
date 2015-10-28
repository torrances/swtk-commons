package org.swtk.commons.dict.wordnet.indexbyname.instance.b.u.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBUM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"bum\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"05566889\", \"10217586\", \"10742949\", \"10559272\"]}");
	add("{\"term\":\"bumblebee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02212276\"]}");
	add("{\"term\":\"bumbler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09899210\"]}");
	add("{\"term\":\"bumboat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02921839\"]}");
	add("{\"term\":\"bumelia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12793317\"]}");
	add("{\"term\":\"bumf\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06610597\"]}");
	add("{\"term\":\"bummer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14335136\", \"14430304\"]}");
	add("{\"term\":\"bump\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07353281\", \"13917127\", \"14313006\"]}");
	add("{\"term\":\"bumper\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02921979\", \"02922215\"]}");
	add("{\"term\":\"bumph\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06610597\"]}");
	add("{\"term\":\"bumpiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04956858\"]}");
	add("{\"term\":\"bumpkin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10823706\"]}");
	add("{\"term\":\"bumptiousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05174939\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }