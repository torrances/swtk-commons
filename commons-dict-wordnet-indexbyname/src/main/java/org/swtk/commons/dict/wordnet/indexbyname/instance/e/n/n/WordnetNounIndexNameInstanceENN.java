package org.swtk.commons.dict.wordnet.indexbyname.instance.e.n.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceENN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ennead\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13767410\"]}");
	add("{\"term\":\"ennoblement\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00065918\", \"14456971\"]}");
	add("{\"term\":\"ennui\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07555178\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }