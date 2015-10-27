package org.swtk.commons.dict.wordnet.index.name.instance.d.u.r.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDURI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"durian\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07778889\", \"12211386\"]}");
	add("{\"term\":\"durio\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12211229\"]}");
	add("{\"term\":\"durion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12211386\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }