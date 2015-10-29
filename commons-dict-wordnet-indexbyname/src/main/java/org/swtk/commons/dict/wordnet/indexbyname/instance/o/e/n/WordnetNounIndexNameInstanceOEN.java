package org.swtk.commons.dict.wordnet.indexbyname.instance.o.e.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceOEN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"oenanthe\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01564254\", \"12961538\"]}");
	add("{\"term\":\"oenanthe aquatica\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12961980\"]}");
	add("{\"term\":\"oenanthe crocata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12961699\"]}");
	add("{\"term\":\"oengus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09531041\"]}");
	add("{\"term\":\"oenologist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09639603\"]}");
	add("{\"term\":\"oenology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05644016\"]}");
	add("{\"term\":\"oenomel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07907070\"]}");
	add("{\"term\":\"oenophile\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10078875\"]}");
	add("{\"term\":\"oenothera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12364648\"]}");
	add("{\"term\":\"oenothera biennis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12365000\"]}");
	add("{\"term\":\"oenothera fruticosa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12365217\"]}");
	add("{\"term\":\"oenothera macrocarpa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12365354\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }