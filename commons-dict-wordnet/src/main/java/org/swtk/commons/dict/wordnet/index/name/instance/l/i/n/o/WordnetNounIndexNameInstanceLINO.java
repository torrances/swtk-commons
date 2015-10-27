package org.swtk.commons.dict.wordnet.index.name.instance.l.i.n.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLINO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lino\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14962527\"]}");
	add("{\"term\":\"linocut\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03680168\", \"03680272\"]}");
	add("{\"term\":\"linoleum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14962527\"]}");
	add("{\"term\":\"linotype\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03680561\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }