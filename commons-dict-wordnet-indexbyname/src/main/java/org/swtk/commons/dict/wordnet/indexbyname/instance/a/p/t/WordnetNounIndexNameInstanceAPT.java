package org.swtk.commons.dict.wordnet.indexbyname.instance.a.p.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAPT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"aptenodytes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02059075\"]}");
	add("{\"term\":\"apterygidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01522925\"]}");
	add("{\"term\":\"apterygiformes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01522699\"]}");
	add("{\"term\":\"apteryx\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01523217\"]}");
	add("{\"term\":\"aptitude\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05630239\"]}");
	add("{\"term\":\"aptness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04723767\", \"04950331\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }