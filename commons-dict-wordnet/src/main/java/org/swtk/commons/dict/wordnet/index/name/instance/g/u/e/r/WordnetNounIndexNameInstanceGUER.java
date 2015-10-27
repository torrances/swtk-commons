package org.swtk.commons.dict.wordnet.index.name.instance.g.u.e.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGUER {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"guerdon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13305306\"]}");
	add("{\"term\":\"guereza\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02491525\"]}");
	add("{\"term\":\"gueridon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03470358\"]}");
	add("{\"term\":\"guerilla\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10170076\"]}");
	add("{\"term\":\"guernsey\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02410173\", \"08907571\"]}");
	add("{\"term\":\"guerrilla\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10170076\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }