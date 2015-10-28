package org.swtk.commons.dict.wordnet.indexbyname.instance.h.e.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHEE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"heed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05710673\"]}");
	add("{\"term\":\"heedfulness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04671120\"]}");
	add("{\"term\":\"heedlessness\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04672900\", \"04901399\", \"05714322\"]}");
	add("{\"term\":\"heel\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"03516930\", \"03517093\", \"07699718\", \"09905672\", \"05585726\", \"03516570\"]}");
	add("{\"term\":\"heelbone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05282307\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }