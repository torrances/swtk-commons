package org.swtk.commons.dict.wordnet.index.name.instance.r.e.f.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceREFO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"refocusing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00376746\"]}");
	add("{\"term\":\"reforestation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00401257\"]}");
	add("{\"term\":\"reform\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00262248\", \"00802601\", \"00261465\"]}");
	add("{\"term\":\"reformation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00096791\", \"08492940\", \"14447491\"]}");
	add("{\"term\":\"reformatory\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04076889\"]}");
	add("{\"term\":\"reformer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04077115\", \"10534787\"]}");
	add("{\"term\":\"reformism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05975964\"]}");
	add("{\"term\":\"reformist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10534787\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }