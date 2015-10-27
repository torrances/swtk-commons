package org.swtk.commons.dict.wordnet.index.name.instance.g.r.i.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGRIL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"grill\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03464523\", \"03464846\"]}");
	add("{\"term\":\"grille\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03464523\", \"03464707\", \"04589740\"]}");
	add("{\"term\":\"grilling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00247621\"]}");
	add("{\"term\":\"grillroom\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03464846\"]}");
	add("{\"term\":\"grillwork\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03464523\", \"04603089\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }