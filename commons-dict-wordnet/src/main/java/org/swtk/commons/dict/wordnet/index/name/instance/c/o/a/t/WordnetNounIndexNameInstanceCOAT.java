package org.swtk.commons.dict.wordnet.index.name.instance.c.o.a.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCOAT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"coat\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01901372\", \"03062092\", \"03061006\"]}");
	add("{\"term\":\"coatdress\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03061709\"]}");
	add("{\"term\":\"coatee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03061826\"]}");
	add("{\"term\":\"coati\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02512146\"]}");
	add("{\"term\":\"coating\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00713478\", \"03062624\", \"04707990\", \"03062092\"]}");
	add("{\"term\":\"coatrack\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03063106\"]}");
	add("{\"term\":\"coatroom\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03049785\"]}");
	add("{\"term\":\"coattail\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03063239\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }