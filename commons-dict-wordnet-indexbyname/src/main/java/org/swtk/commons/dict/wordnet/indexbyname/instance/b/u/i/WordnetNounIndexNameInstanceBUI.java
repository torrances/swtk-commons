package org.swtk.commons.dict.wordnet.indexbyname.instance.b.u.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBUI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"build\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05224424\", \"05005695\"]}");
	add("{\"term\":\"builder\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09897741\", \"09898025\", \"15121776\"]}");
	add("{\"term\":\"building\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"07989688\", \"01106542\", \"00912746\", \"02916498\"]}");
	add("{\"term\":\"buildup\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07262119\", \"13463341\", \"00373034\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }