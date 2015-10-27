package org.swtk.commons.dict.wordnet.index.name.instance.h.e.r.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHERO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"hero\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"07713570\", \"09577426\", \"10192757\", \"11065101\", \"09925991\", \"05938456\", \"10344679\"]}");
	add("{\"term\":\"herod\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11065348\"]}");
	add("{\"term\":\"herodotus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11065564\"]}");
	add("{\"term\":\"heroic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06397799\"]}");
	add("{\"term\":\"heroics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00552751\"]}");
	add("{\"term\":\"heroin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03521174\"]}");
	add("{\"term\":\"heroine\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10193081\", \"10192976\"]}");
	add("{\"term\":\"heroism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04864969\"]}");
	add("{\"term\":\"heron\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02010695\", \"11065101\"]}");
	add("{\"term\":\"heronry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08600982\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }