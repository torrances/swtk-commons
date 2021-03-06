package org.swtk.commons.dict.wordnet.indexbyname.instance.l.e.y;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLEY {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ley\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08633625\"]}");
	add("{\"term\":\"leycesteria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12693604\"]}");
	add("{\"term\":\"leycesteria formosa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12693773\"]}");
	add("{\"term\":\"leyden\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08970850\"]}");
	add("{\"term\":\"leyden jar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03660796\"]}");
	add("{\"term\":\"leydig cell\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05467033\"]}");
	add("{\"term\":\"leymus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12144875\"]}");
	add("{\"term\":\"leymus arenaria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12140056\"]}");
	add("{\"term\":\"leymus condensatus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12139907\"]}");
	add("{\"term\":\"leyte\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01286617\"]}");
	add("{\"term\":\"leyte invasion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01286617\"]}");
	add("{\"term\":\"leyte island\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01286617\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }