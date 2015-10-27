package org.swtk.commons.dict.wordnet.index.name.instance.s.e.p.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSEPA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sepal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11711081\"]}");
	add("{\"term\":\"separability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14441397\"]}");
	add("{\"term\":\"separate\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04179965\", \"06280438\"]}");
	add("{\"term\":\"separateness\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04750006\", \"14024698\", \"14437907\"]}");
	add("{\"term\":\"separation\", \"synsetCount\":9, \"upperType\":\"NOUN\", \"ids\":[\"00384414\", \"01203919\", \"07310009\", \"08664696\", \"01203511\", \"01256840\", \"05097154\", \"07346000\", \"14437698\"]}");
	add("{\"term\":\"separationism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01205155\"]}");
	add("{\"term\":\"separationist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10599482\"]}");
	add("{\"term\":\"separatism\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01205155\", \"04950881\", \"08397071\"]}");
	add("{\"term\":\"separatist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10599482\"]}");
	add("{\"term\":\"separator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02999605\"]}");
	add("{\"term\":\"separatrix\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06857953\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }