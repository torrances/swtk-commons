package org.swtk.commons.dict.wordnet.indexbyname.instance.e.l.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceELB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"el beda\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09009632\"]}");
	add("{\"term\":\"elbe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09294464\"]}");
	add("{\"term\":\"elbe river\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09294464\"]}");
	add("{\"term\":\"elbow\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"02470999\", \"03273222\", \"03273464\", \"03273381\", \"05587575\"]}");
	add("{\"term\":\"elbow bone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05601231\"]}");
	add("{\"term\":\"elbow grease\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00622867\"]}");
	add("{\"term\":\"elbow joint\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05587575\"]}");
	add("{\"term\":\"elbow pad\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03273556\"]}");
	add("{\"term\":\"elbow room\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13799976\"]}");
	add("{\"term\":\"elbowing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00115118\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }