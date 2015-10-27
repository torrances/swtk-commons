package org.swtk.commons.dict.wordnet.index.name.instance.q.u.o.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceQUOT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"quota\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06673141\", \"13310767\", \"13620591\"]}");
	add("{\"term\":\"quotability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04814741\"]}");
	add("{\"term\":\"quotation\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01032674\", \"06768978\", \"06625409\", \"06776392\"]}");
	add("{\"term\":\"quote\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06625409\", \"06857249\"]}");
	add("{\"term\":\"quoter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10521789\"]}");
	add("{\"term\":\"quotient\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13755456\", \"13847027\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }