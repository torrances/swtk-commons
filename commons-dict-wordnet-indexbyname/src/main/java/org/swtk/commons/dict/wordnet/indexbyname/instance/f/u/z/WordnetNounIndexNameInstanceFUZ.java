package org.swtk.commons.dict.wordnet.indexbyname.instance.f.u.z;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFUZ {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"fuze\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03412032\"]}");
	add("{\"term\":\"fuzee\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03412032\", \"03412526\", \"03412654\"]}");
	add("{\"term\":\"fuzz\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"05269393\", \"05949132\", \"09898610\", \"13110851\"]}");
	add("{\"term\":\"fuzziness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04711694\"]}");
	add("{\"term\":\"fuzzy logic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06176210\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }