package org.swtk.commons.dict.wordnet.index.name.instance.b.e.r.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBERT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"berteroa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11894769\"]}");
	add("{\"term\":\"berth\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02834929\", \"08657686\", \"00587299\"]}");
	add("{\"term\":\"bertholletia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12348235\"]}");
	add("{\"term\":\"bertillon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10868809\"]}");
	add("{\"term\":\"bertolucci\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10868919\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }