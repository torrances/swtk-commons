package org.swtk.commons.dict.wordnet.index.name.instance.d.a.r.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDARK {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"dark\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"05997383\", \"15192074\", \"08663881\", \"14587156\", \"14007000\"]}");
	add("{\"term\":\"darkening\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00275281\"]}");
	add("{\"term\":\"darkness\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"04985483\", \"04987119\", \"05997383\", \"14587156\", \"08663881\", \"14007000\"]}");
	add("{\"term\":\"darkroom\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03167126\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }