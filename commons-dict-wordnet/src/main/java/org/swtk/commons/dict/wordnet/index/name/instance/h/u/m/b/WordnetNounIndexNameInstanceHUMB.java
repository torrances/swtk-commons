package org.swtk.commons.dict.wordnet.index.name.instance.h.u.m.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHUMB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"humber\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09330046\"]}");
	add("{\"term\":\"humblebee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02212276\"]}");
	add("{\"term\":\"humbleness\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04896722\", \"07524370\", \"14459904\"]}");
	add("{\"term\":\"humboldt\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11085933\", \"11086204\"]}");
	add("{\"term\":\"humbug\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00755028\", \"06623132\", \"06623500\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }