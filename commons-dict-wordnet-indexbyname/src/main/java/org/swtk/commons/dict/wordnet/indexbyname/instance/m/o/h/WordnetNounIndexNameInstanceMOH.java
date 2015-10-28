package org.swtk.commons.dict.wordnet.indexbyname.instance.m.o.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMOH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"mohair\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03784661\"]}");
	add("{\"term\":\"mohammad\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11204082\"]}");
	add("{\"term\":\"mohammed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11204082\"]}");
	add("{\"term\":\"mohammedan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10346668\"]}");
	add("{\"term\":\"mohammedanism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06244979\"]}");
	add("{\"term\":\"moharram\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15242104\"]}");
	add("{\"term\":\"mohave\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06935959\", \"09193893\", \"09681248\"]}");
	add("{\"term\":\"mohawk\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05268427\", \"06929089\", \"09681436\"]}");
	add("{\"term\":\"mohican\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06923734\", \"09681578\"]}");
	add("{\"term\":\"moho\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09379977\"]}");
	add("{\"term\":\"mohorovicic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11204521\"]}");
	add("{\"term\":\"mohria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12977551\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }