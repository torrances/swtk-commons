package org.swtk.commons.dict.wordnet.index.name.instance.p.h.y.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePHYC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"phycobilin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01401877\"]}");
	add("{\"term\":\"phycocyanin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01402091\"]}");
	add("{\"term\":\"phycoerythrin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01402007\"]}");
	add("{\"term\":\"phycology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06084057\"]}");
	add("{\"term\":\"phycomycetes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12997432\"]}");
	add("{\"term\":\"phycomycosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14205814\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }