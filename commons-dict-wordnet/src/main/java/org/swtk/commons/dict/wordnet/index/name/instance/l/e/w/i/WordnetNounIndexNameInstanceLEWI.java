package org.swtk.commons.dict.wordnet.index.name.instance.l.e.w.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLEWI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lewis\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"11150281\", \"11150464\", \"11150651\", \"11150930\", \"11151125\", \"11151348\"]}");
	add("{\"term\":\"lewisia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11880450\"]}");
	add("{\"term\":\"lewiston\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09104486\", \"09115765\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }