package org.swtk.commons.dict.wordnet.index.name.instance.a.t.o.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceATOM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"atom\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14609699\", \"14643403\"]}");
	add("{\"term\":\"atomisation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00219469\", \"00389018\"]}");
	add("{\"term\":\"atomiser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02757108\"]}");
	add("{\"term\":\"atomism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06112083\", \"06147550\"]}");
	add("{\"term\":\"atomization\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00219469\", \"00389018\"]}");
	add("{\"term\":\"atomizer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02757108\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }