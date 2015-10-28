package org.swtk.commons.dict.wordnet.indexbyname.instance.y.o.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceYOR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"yore\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15146030\"]}");
	add("{\"term\":\"york\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08176823\"]}");
	add("{\"term\":\"yorkshire\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08905438\"]}");
	add("{\"term\":\"yorktown\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01302733\", \"09175325\"]}");
	add("{\"term\":\"yoruba\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07010028\", \"09757624\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }