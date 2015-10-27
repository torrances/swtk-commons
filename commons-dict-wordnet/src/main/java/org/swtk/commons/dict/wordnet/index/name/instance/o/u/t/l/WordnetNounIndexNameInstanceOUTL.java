package org.swtk.commons.dict.wordnet.index.name.instance.o.u.t.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceOUTL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"outlander\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10123254\"]}");
	add("{\"term\":\"outlandishness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04805760\"]}");
	add("{\"term\":\"outlaw\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09997190\"]}");
	add("{\"term\":\"outlawry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04818378\"]}");
	add("{\"term\":\"outlay\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13296311\", \"01124470\"]}");
	add("{\"term\":\"outlet\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01266940\", \"03308910\", \"04556057\", \"03753653\"]}");
	add("{\"term\":\"outlier\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06032718\", \"10407535\"]}");
	add("{\"term\":\"outline\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05900179\", \"06480622\", \"08630343\"]}");
	add("{\"term\":\"outlook\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00883223\", \"05953807\", \"06205574\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }