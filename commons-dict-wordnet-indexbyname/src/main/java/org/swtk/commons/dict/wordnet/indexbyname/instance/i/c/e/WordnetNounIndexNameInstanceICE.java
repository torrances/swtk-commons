package org.swtk.commons.dict.wordnet.indexbyname.instance.i.c.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceICE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ice\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"03563356\", \"03585151\", \"03759824\", \"07629807\", \"07636431\", \"13393296\", \"09331304\", \"14939335\"]}");
	add("{\"term\":\"iceberg\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07740014\", \"09331478\"]}");
	add("{\"term\":\"iceboat\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03561991\", \"03562172\"]}");
	add("{\"term\":\"icebox\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04077839\"]}");
	add("{\"term\":\"icebreaker\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00240633\", \"03562172\"]}");
	add("{\"term\":\"icecap\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09331649\"]}");
	add("{\"term\":\"icecream\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07630109\"]}");
	add("{\"term\":\"icefall\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09331824\"]}");
	add("{\"term\":\"icehouse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03562692\"]}");
	add("{\"term\":\"iceland\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08972924\", \"08973097\"]}");
	add("{\"term\":\"icelander\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09733516\"]}");
	add("{\"term\":\"icelandic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06966923\"]}");
	add("{\"term\":\"iceman\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10181609\", \"10216023\"]}");
	add("{\"term\":\"icepick\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03563187\"]}");
	add("{\"term\":\"icetray\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03563919\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }