package org.swtk.commons.dict.wordnet.index.name.instance.a.b.s.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceABSC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"abscess\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14335599\"]}");
	add("{\"term\":\"abscissa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06020938\"]}");
	add("{\"term\":\"abscission\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00393517\", \"13444952\"]}");
	add("{\"term\":\"absconder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09774572\"]}");
	add("{\"term\":\"abscondment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00056453\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }