package org.swtk.commons.dict.wordnet.index.name.instance.g.r.o.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGROS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"grosbeak\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01542874\"]}");
	add("{\"term\":\"groschen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13728173\"]}");
	add("{\"term\":\"grosgrain\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03467042\"]}");
	add("{\"term\":\"gross\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13277590\", \"13772644\"]}");
	add("{\"term\":\"grossbeak\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01542874\"]}");
	add("{\"term\":\"grossness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04824511\"]}");
	add("{\"term\":\"grossulariaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12825381\"]}");
	add("{\"term\":\"grosz\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13732986\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }