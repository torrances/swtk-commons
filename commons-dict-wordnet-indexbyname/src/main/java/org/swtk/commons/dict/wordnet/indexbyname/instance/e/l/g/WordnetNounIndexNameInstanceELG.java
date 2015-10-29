package org.swtk.commons.dict.wordnet.indexbyname.instance.e.l.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceELG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"el giza\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08919376\"]}");
	add("{\"term\":\"el greco\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10976369\"]}");
	add("{\"term\":\"elgar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10976126\"]}");
	add("{\"term\":\"elgin marbles\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07975434\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }