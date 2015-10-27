package org.swtk.commons.dict.wordnet.index.name.instance.i.n.g.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceINGE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"inge\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11091564\", \"11091667\"]}");
	add("{\"term\":\"ingeniousness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04737625\", \"05641517\"]}");
	add("{\"term\":\"ingenue\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05938566\", \"10226125\", \"10226248\"]}");
	add("{\"term\":\"ingenuity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04737625\", \"05641517\"]}");
	add("{\"term\":\"ingenuousness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04879726\", \"04888025\"]}");
	add("{\"term\":\"inger\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09725944\"]}");
	add("{\"term\":\"ingerman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09725944\"]}");
	add("{\"term\":\"ingesta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07575987\"]}");
	add("{\"term\":\"ingestion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00839759\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }