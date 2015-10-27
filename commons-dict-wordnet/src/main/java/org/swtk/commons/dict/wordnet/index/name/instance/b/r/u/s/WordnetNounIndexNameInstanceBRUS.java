package org.swtk.commons.dict.wordnet.index.name.instance.b.r.u.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBRUS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"brusa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09064688\"]}");
	add("{\"term\":\"brush\", \"synsetCount\":9, \"upperType\":\"NOUN\", \"ids\":[\"00040283\", \"00257487\", \"00657629\", \"00961487\", \"02160606\", \"02911930\", \"07428314\", \"02911542\", \"08454507\"]}");
	add("{\"term\":\"brushing\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00257487\", \"00657629\"]}");
	add("{\"term\":\"brushup\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00899509\"]}");
	add("{\"term\":\"brushwood\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08454507\", \"14809356\"]}");
	add("{\"term\":\"brushwork\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05651336\"]}");
	add("{\"term\":\"brusqueness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04922639\"]}");
	add("{\"term\":\"brussels\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08869442\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }