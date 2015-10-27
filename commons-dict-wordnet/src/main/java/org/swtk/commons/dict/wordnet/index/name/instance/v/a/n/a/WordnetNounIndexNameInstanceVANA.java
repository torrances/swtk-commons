package org.swtk.commons.dict.wordnet.index.name.instance.v.a.n.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceVANA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"vanadate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15111378\"]}");
	add("{\"term\":\"vanadinite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15111506\"]}");
	add("{\"term\":\"vanadium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14685199\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }