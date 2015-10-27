package org.swtk.commons.dict.wordnet.index.name.instance.f.i.l.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFILI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"filiation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04929964\", \"13835254\"]}");
	add("{\"term\":\"filibuster\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01069936\", \"10107637\"]}");
	add("{\"term\":\"filibusterer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10107637\"]}");
	add("{\"term\":\"filicales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13190572\"]}");
	add("{\"term\":\"filicide\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00223022\", \"10107870\"]}");
	add("{\"term\":\"filicinae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13190117\"]}");
	add("{\"term\":\"filicopsida\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13190117\"]}");
	add("{\"term\":\"filigree\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03342767\"]}");
	add("{\"term\":\"filing\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00813152\", \"00927303\", \"09302251\", \"07182605\"]}");
	add("{\"term\":\"filipino\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06952518\", \"09746782\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }