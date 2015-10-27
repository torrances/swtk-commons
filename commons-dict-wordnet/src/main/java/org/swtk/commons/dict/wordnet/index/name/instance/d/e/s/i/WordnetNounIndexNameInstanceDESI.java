package org.swtk.commons.dict.wordnet.index.name.instance.d.e.s.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDESI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"desiccant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14803955\"]}");
	add("{\"term\":\"desiccation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13481771\", \"14560433\"]}");
	add("{\"term\":\"desideratum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09288816\"]}");
	add("{\"term\":\"design\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"05641230\", \"03183984\", \"05991037\", \"03183448\", \"05910921\", \"05736623\", \"00929892\"]}");
	add("{\"term\":\"designation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00152838\", \"00164600\", \"06350278\"]}");
	add("{\"term\":\"designatum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06616280\"]}");
	add("{\"term\":\"designer\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"09991687\", \"10027463\", \"10163575\", \"09824898\", \"10230249\"]}");
	add("{\"term\":\"designing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00929892\"]}");
	add("{\"term\":\"desipramine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03184819\"]}");
	add("{\"term\":\"desirability\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04694284\", \"05149087\"]}");
	add("{\"term\":\"desirableness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04694284\", \"05149087\"]}");
	add("{\"term\":\"desire\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"14062475\", \"04952234\", \"07499405\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }