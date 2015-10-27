package org.swtk.commons.dict.wordnet.index.name.instance.n.a.s.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceNAST {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"nast\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11220939\"]}");
	add("{\"term\":\"nastiness\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04788030\", \"04849746\", \"14519345\"]}");
	add("{\"term\":\"nasturtium\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07835745\", \"11913473\", \"12740444\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }