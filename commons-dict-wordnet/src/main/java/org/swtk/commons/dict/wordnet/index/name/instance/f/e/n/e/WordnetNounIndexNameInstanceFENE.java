package org.swtk.commons.dict.wordnet.index.name.instance.f.e.n.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFENE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"fenestella\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03702999\"]}");
	add("{\"term\":\"fenestra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05332926\"]}");
	add("{\"term\":\"fenestration\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00675805\", \"05083878\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }