package org.swtk.commons.dict.wordnet.indexbyname.instance.p.u.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePUE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"puebla\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08762844\"]}");
	add("{\"term\":\"puebla de zaragoza\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08762844\"]}");
	add("{\"term\":\"pueblo\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08691011\", \"09090805\", \"09686327\"]}");
	add("{\"term\":\"pueraria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12587314\"]}");
	add("{\"term\":\"pueraria lobata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12587459\"]}");
	add("{\"term\":\"puerility\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04935937\", \"14450469\"]}");
	add("{\"term\":\"puerpera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10511671\"]}");
	add("{\"term\":\"puerperal fever\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14213975\"]}");
	add("{\"term\":\"puerperium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15167528\"]}");
	add("{\"term\":\"puerto rican\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09766056\"]}");
	add("{\"term\":\"puerto rico\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08770647\", \"08770807\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }