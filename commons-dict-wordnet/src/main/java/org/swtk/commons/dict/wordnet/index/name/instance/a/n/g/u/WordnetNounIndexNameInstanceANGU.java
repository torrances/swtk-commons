package org.swtk.commons.dict.wordnet.index.name.instance.a.n.g.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceANGU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"anguidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01691867\"]}");
	add("{\"term\":\"anguilla\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02529304\", \"08726575\"]}");
	add("{\"term\":\"anguillan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09710260\"]}");
	add("{\"term\":\"anguillidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02529117\"]}");
	add("{\"term\":\"anguilliformes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02528497\"]}");
	add("{\"term\":\"anguillula\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01934625\"]}");
	add("{\"term\":\"anguis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01692646\"]}");
	add("{\"term\":\"anguish\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14472488\", \"07511895\"]}");
	add("{\"term\":\"angularity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05078018\", \"13887384\"]}");
	add("{\"term\":\"angulation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00405927\", \"01000456\"]}");
	add("{\"term\":\"angus\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02408581\", \"09531041\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }