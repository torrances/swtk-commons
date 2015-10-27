package org.swtk.commons.dict.wordnet.index.name.instance.s.a.l.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSALL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sallet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04137990\"]}");
	add("{\"term\":\"sallow\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12748061\"]}");
	add("{\"term\":\"sallowness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04985213\"]}");
	add("{\"term\":\"sally\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00803627\", \"00973413\", \"06780568\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }