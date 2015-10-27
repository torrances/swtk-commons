package org.swtk.commons.dict.wordnet.index.name.instance.r.o.t.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceROTT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"rottenness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04798804\", \"14584694\"]}");
	add("{\"term\":\"rottenstone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14960612\"]}");
	add("{\"term\":\"rotter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10559272\"]}");
	add("{\"term\":\"rotterdam\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08970680\"]}");
	add("{\"term\":\"rotting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13479192\"]}");
	add("{\"term\":\"rottweiler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02109202\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }