package org.swtk.commons.dict.wordnet.index.name.instance.f.o.o.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFOOL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"fool\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10240982\", \"09940867\", \"10120530\"]}");
	add("{\"term\":\"foolery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00513854\"]}");
	add("{\"term\":\"foolhardiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04669283\"]}");
	add("{\"term\":\"foolishness\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01250622\", \"05655001\", \"04898528\"]}");
	add("{\"term\":\"foolscap\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06270140\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }