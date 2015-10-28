package org.swtk.commons.dict.wordnet.indexbyname.instance.c.a.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCAK {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cakchiquel\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06938889\", \"09671123\"]}");
	add("{\"term\":\"cake\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07644479\", \"07679644\", \"02940853\"]}");
	add("{\"term\":\"cakehole\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05309806\"]}");
	add("{\"term\":\"cakewalk\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00037301\", \"00531911\"]}");
	add("{\"term\":\"cakile\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11900687\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }