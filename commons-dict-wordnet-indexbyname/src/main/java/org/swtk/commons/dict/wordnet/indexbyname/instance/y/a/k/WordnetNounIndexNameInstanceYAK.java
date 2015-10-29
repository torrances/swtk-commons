package org.swtk.commons.dict.wordnet.indexbyname.instance.y.a.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceYAK {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"yak\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02407954\", \"07151648\"]}");
	add("{\"term\":\"yak butter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07872162\"]}");
	add("{\"term\":\"yakima\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09177963\"]}");
	add("{\"term\":\"yakut\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06940422\", \"09756546\"]}");
	add("{\"term\":\"yakuza\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08247827\", \"10821406\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }