package org.swtk.commons.dict.wordnet.indexbyname.instance.i.v.y;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceIVY {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ivy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11819447\"]}");
	add("{\"term\":\"ivy arum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11809196\"]}");
	add("{\"term\":\"ivy family\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11817213\"]}");
	add("{\"term\":\"ivy geranium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12708718\"]}");
	add("{\"term\":\"ivy league\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08249627\"]}");
	add("{\"term\":\"ivy leaguer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10237713\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }