package org.swtk.commons.dict.wordnet.index.name.instance.r.o.s.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceROST {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"rostand\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11291849\"]}");
	add("{\"term\":\"roster\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06506991\"]}");
	add("{\"term\":\"rostock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08792537\"]}");
	add("{\"term\":\"rostov\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09031860\"]}");
	add("{\"term\":\"rostrum\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02455444\", \"03164306\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }