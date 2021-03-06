package org.swtk.commons.dict.wordnet.indexbyname.instance.p.o.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePOG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pogey\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01090228\"]}");
	add("{\"term\":\"pogge\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02650665\"]}");
	add("{\"term\":\"pogo stick\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03980428\"]}");
	add("{\"term\":\"pogonia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12100464\"]}");
	add("{\"term\":\"pogonia divaricata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12071983\"]}");
	add("{\"term\":\"pogonia rosea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12072261\"]}");
	add("{\"term\":\"pogonion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05242067\"]}");
	add("{\"term\":\"pogonip\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11487943\"]}");
	add("{\"term\":\"pogonophora\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01931378\"]}");
	add("{\"term\":\"pogonophoran\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01931506\"]}");
	add("{\"term\":\"pogostemon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12883408\"]}");
	add("{\"term\":\"pogostemon cablin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12883588\"]}");
	add("{\"term\":\"pogrom\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00422205\"]}");
	add("{\"term\":\"pogy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01090228\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }