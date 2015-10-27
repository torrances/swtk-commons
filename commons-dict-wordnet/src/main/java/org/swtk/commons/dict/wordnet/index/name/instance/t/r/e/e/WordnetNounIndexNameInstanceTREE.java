package org.swtk.commons.dict.wordnet.index.name.instance.t.r.e.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTREE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tree\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"11368155\", \"13935275\", \"13124818\"]}");
	add("{\"term\":\"treehopper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02262360\"]}");
	add("{\"term\":\"treelet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13128566\"]}");
	add("{\"term\":\"treenail\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04485301\"]}");
	add("{\"term\":\"treetop\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13148762\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }