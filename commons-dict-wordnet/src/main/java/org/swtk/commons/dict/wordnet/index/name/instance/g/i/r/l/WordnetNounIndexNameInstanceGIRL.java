package org.swtk.commons.dict.wordnet.index.name.instance.g.i.r.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGIRL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"girl\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"10149967\", \"10150206\", \"10012375\", \"10104064\", \"10149362\"]}");
	add("{\"term\":\"girlfriend\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10150206\", \"10150397\"]}");
	add("{\"term\":\"girlhood\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15172290\"]}");
	add("{\"term\":\"girlishness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04675390\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }