package org.swtk.commons.dict.wordnet.indexbyname.instance.a.b.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceABC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"abc\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05881364\"]}");
	add("{\"term\":\"abcoulomb\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13658345\"]}");
	add("{\"term\":\"abcs\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05881364\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }