package org.swtk.commons.dict.wordnet.index.name.instance.b.a.r.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBARG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"bargain\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13274650\", \"06783960\"]}");
	add("{\"term\":\"bargainer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09858555\", \"10740102\"]}");
	add("{\"term\":\"bargaining\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07164544\"]}");
	add("{\"term\":\"barge\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02795575\"]}");
	add("{\"term\":\"bargee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10281085\"]}");
	add("{\"term\":\"bargello\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02795845\"]}");
	add("{\"term\":\"bargeman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10281085\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }