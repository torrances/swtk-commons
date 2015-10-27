package org.swtk.commons.dict.wordnet.index.name.instance.t.i.d.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTIDE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tide\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"15300713\", \"07459095\", \"07417119\"]}");
	add("{\"term\":\"tideland\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09481399\"]}");
	add("{\"term\":\"tidemark\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04440076\"]}");
	add("{\"term\":\"tidewater\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09074354\", \"09481502\"]}");
	add("{\"term\":\"tideway\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09481624\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }