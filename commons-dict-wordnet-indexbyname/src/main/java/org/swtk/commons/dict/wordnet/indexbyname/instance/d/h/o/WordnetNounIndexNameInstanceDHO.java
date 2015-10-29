package org.swtk.commons.dict.wordnet.indexbyname.instance.d.h.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDHO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"dhobi itch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14149256\"]}");
	add("{\"term\":\"dhodhekanisos\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08801138\"]}");
	add("{\"term\":\"dhole\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02118565\"]}");
	add("{\"term\":\"dhoti\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03190883\"]}");
	add("{\"term\":\"dhow\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03190969\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }