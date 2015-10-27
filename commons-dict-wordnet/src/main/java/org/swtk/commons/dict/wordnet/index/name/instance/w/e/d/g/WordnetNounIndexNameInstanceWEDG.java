package org.swtk.commons.dict.wordnet.index.name.instance.w.e.d.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceWEDG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"wedge\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"03027561\", \"04576806\", \"04577108\", \"04577269\", \"06836139\", \"07713570\", \"13942580\"]}");
	add("{\"term\":\"wedgie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04577404\"]}");
	add("{\"term\":\"wedgwood\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04577500\", \"11399431\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }