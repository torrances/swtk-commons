package org.swtk.commons.dict.wordnet.index.name.instance.c.o.r.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCORO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"corokia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12969393\"]}");
	add("{\"term\":\"corolla\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11711515\"]}");
	add("{\"term\":\"corollary\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05788560\", \"07308966\"]}");
	add("{\"term\":\"corona\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"03116134\", \"05614881\", \"11460787\", \"11460898\", \"11711801\", \"11447181\"]}");
	add("{\"term\":\"coronach\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07064659\"]}");
	add("{\"term\":\"coronal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04613372\"]}");
	add("{\"term\":\"coronary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14126313\"]}");
	add("{\"term\":\"coronation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07468248\"]}");
	add("{\"term\":\"coroner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09985515\"]}");
	add("{\"term\":\"coronet\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02464844\", \"03116215\"]}");
	add("{\"term\":\"coronilla\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12539384\"]}");
	add("{\"term\":\"coronion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05239404\"]}");
	add("{\"term\":\"coropuna\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09280186\"]}");
	add("{\"term\":\"corot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10931700\"]}");
	add("{\"term\":\"corozo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12609903\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }