package org.swtk.commons.dict.wordnet.index.name.instance.c.u.t.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCUTL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cutlas\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03157912\"]}");
	add("{\"term\":\"cutlass\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03157912\"]}");
	add("{\"term\":\"cutlassfish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02625585\"]}");
	add("{\"term\":\"cutler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10004737\"]}");
	add("{\"term\":\"cutlery\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03158041\", \"03158739\"]}");
	add("{\"term\":\"cutlet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07670495\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }