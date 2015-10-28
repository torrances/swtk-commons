package org.swtk.commons.dict.wordnet.indexbyname.instance.u.s.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceUST {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ustilaginaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13087391\"]}");
	add("{\"term\":\"ustilaginales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13086662\"]}");
	add("{\"term\":\"ustilaginoidea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13101810\"]}");
	add("{\"term\":\"ustilago\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13087563\"]}");
	add("{\"term\":\"ustinov\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11378060\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }