package org.swtk.commons.dict.wordnet.index.name.instance.r.a.n.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRAND {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"rand\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09024251\", \"11273620\", \"13718628\"]}");
	add("{\"term\":\"randomisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01010943\"]}");
	add("{\"term\":\"randomization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01010943\"]}");
	add("{\"term\":\"randomness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04778571\", \"05019769\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }