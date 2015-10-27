package org.swtk.commons.dict.wordnet.index.name.instance.a.b.o.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceABOM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"abomasum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02402594\"]}");
	add("{\"term\":\"abomination\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00746729\", \"07518669\", \"09776292\"]}");
	add("{\"term\":\"abominator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09774111\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }