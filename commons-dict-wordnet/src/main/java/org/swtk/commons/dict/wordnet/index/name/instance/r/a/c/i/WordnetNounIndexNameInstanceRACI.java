package org.swtk.commons.dict.wordnet.index.name.instance.r.a.c.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRACI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"racialism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01157531\"]}");
	add("{\"term\":\"racialist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10522535\"]}");
	add("{\"term\":\"racine\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09181287\", \"11271778\"]}");
	add("{\"term\":\"raciness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04909460\", \"05000012\"]}");
	add("{\"term\":\"racing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00450280\"]}");
	add("{\"term\":\"racism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01157531\", \"06213493\"]}");
	add("{\"term\":\"racist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10522535\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }