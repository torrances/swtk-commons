package org.swtk.commons.dict.wordnet.indexbyname.instance.e.r.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceERA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"era\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07275968\", \"15272831\", \"15273375\"]}");
	add("{\"term\":\"eradication\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07345613\"]}");
	add("{\"term\":\"eradicator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10094127\"]}");
	add("{\"term\":\"eragrostis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12140464\"]}");
	add("{\"term\":\"eranthis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11753893\"]}");
	add("{\"term\":\"eraser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03299762\"]}");
	add("{\"term\":\"erasmus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10979849\"]}");
	add("{\"term\":\"erastianism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06198456\"]}");
	add("{\"term\":\"erasure\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00398568\", \"06400873\", \"06440316\"]}");
	add("{\"term\":\"erato\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09589673\"]}");
	add("{\"term\":\"eratosthenes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10980222\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }