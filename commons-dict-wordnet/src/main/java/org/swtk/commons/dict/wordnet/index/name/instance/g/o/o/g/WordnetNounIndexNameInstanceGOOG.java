package org.swtk.commons.dict.wordnet.index.name.instance.g.o.o.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGOOG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"google\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06591081\"]}");
	add("{\"term\":\"googly\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00478108\"]}");
	add("{\"term\":\"googol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13619651\"]}");
	add("{\"term\":\"googolplex\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13619799\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }