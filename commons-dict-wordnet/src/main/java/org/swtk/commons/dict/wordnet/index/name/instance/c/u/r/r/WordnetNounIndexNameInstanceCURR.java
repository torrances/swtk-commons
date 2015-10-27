package org.swtk.commons.dict.wordnet.index.name.instance.c.u.r.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCURR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"currajong\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12217211\"]}");
	add("{\"term\":\"currant\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07768942\", \"12825906\", \"07760222\"]}");
	add("{\"term\":\"currawong\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01586136\"]}");
	add("{\"term\":\"currency\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05057530\", \"04772841\", \"13407086\"]}");
	add("{\"term\":\"current\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08478606\", \"07421365\", \"11463628\"]}");
	add("{\"term\":\"currentness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05057530\"]}");
	add("{\"term\":\"curriculum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06689161\"]}");
	add("{\"term\":\"currier\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10003717\", \"10938110\"]}");
	add("{\"term\":\"curry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07839927\"]}");
	add("{\"term\":\"currycomb\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03155327\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }