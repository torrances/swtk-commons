package org.swtk.commons.dict.wordnet.index.name.instance.f.i.n.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFINE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"fine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13322350\"]}");
	add("{\"term\":\"fineness\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04820315\", \"04955246\", \"05144243\", \"04735862\"]}");
	add("{\"term\":\"finery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03345868\"]}");
	add("{\"term\":\"finesse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04849260\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }