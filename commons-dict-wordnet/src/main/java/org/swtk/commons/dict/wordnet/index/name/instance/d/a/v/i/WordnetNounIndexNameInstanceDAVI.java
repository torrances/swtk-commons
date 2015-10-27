package org.swtk.commons.dict.wordnet.index.name.instance.d.a.v.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDAVI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"david\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10943452\", \"10943824\", \"10943983\"]}");
	add("{\"term\":\"daviesia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12545449\"]}");
	add("{\"term\":\"davis\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"10944099\", \"10944204\", \"10944401\", \"10944580\", \"10944739\", \"10945154\"]}");
	add("{\"term\":\"davit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03169595\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }