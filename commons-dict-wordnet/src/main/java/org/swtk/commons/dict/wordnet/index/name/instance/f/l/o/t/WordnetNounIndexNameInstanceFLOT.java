package org.swtk.commons.dict.wordnet.index.name.instance.f.l.o.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFLOT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"flotation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01102052\", \"11548418\"]}");
	add("{\"term\":\"flotilla\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03372509\", \"03372586\"]}");
	add("{\"term\":\"flotsam\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03372721\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }