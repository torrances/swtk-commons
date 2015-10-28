package org.swtk.commons.dict.wordnet.indexbyname.instance.a.l.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceALM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"almanac\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06437949\", \"06438325\"]}");
	add("{\"term\":\"almandine\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14700647\", \"15075868\"]}");
	add("{\"term\":\"almandite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14700647\"]}");
	add("{\"term\":\"almaty\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09042669\"]}");
	add("{\"term\":\"almighty\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09559474\"]}");
	add("{\"term\":\"almond\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07766562\", \"12665935\"]}");
	add("{\"term\":\"almoner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09804677\"]}");
	add("{\"term\":\"almoravid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09702363\"]}");
	add("{\"term\":\"alms\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01092041\"]}");
	add("{\"term\":\"almsgiver\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09805021\"]}");
	add("{\"term\":\"almsgiving\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01092149\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }