package org.swtk.commons.dict.wordnet.indexbyname.instance.k.o.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceKOP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ko punch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00136457\"]}");
	add("{\"term\":\"kopeck\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13721294\"]}");
	add("{\"term\":\"kopek\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13721294\"]}");
	add("{\"term\":\"kopiyka\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13725363\"]}");
	add("{\"term\":\"kopje\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09349983\"]}");
	add("{\"term\":\"koppie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09349983\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }