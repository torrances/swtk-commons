package org.swtk.commons.dict.wordnet.index.name.instance.b.l.e.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBLEA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"bleach\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00274853\", \"14803364\", \"04968313\"]}");
	add("{\"term\":\"bleacher\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09879090\"]}");
	add("{\"term\":\"bleachers\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02853790\"]}");
	add("{\"term\":\"bleakness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14549150\"]}");
	add("{\"term\":\"bleat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07392531\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }