package org.swtk.commons.dict.wordnet.indexbyname.instance.g.o.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGOE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"goebbels\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11023720\"]}");
	add("{\"term\":\"goer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10024201\"]}");
	add("{\"term\":\"goering\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11028643\"]}");
	add("{\"term\":\"goeteborg\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08784500\"]}");
	add("{\"term\":\"goethals\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11023914\"]}");
	add("{\"term\":\"goethe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11024102\"]}");
	add("{\"term\":\"goethite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14701475\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }