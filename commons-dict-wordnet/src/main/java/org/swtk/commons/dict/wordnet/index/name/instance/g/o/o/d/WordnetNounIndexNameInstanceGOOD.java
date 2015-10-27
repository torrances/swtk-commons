package org.swtk.commons.dict.wordnet.index.name.instance.g.o.o.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGOOD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"good\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03080712\", \"05149427\", \"04856472\", \"05167108\"]}");
	add("{\"term\":\"goodall\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11027177\"]}");
	add("{\"term\":\"goodby\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06642117\"]}");
	add("{\"term\":\"goodbye\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06642117\"]}");
	add("{\"term\":\"goodenia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12188472\"]}");
	add("{\"term\":\"goodeniaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12188266\"]}");
	add("{\"term\":\"goodman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11027328\"]}");
	add("{\"term\":\"goodness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04856472\", \"05149427\"]}");
	add("{\"term\":\"goodwill\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04647713\", \"07515169\", \"13353835\"]}");
	add("{\"term\":\"goody\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07572730\"]}");
	add("{\"term\":\"goodyear\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11027616\"]}");
	add("{\"term\":\"goodyera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12083915\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }