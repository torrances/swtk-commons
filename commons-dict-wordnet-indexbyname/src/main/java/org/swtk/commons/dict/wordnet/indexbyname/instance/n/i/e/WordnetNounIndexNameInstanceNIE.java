package org.swtk.commons.dict.wordnet.indexbyname.instance.n.i.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceNIE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"niebuhr\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11226695\", \"11226875\"]}");
	add("{\"term\":\"niece\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10377312\"]}");
	add("{\"term\":\"niels abel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10826801\"]}");
	add("{\"term\":\"niels bohr\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10874796\"]}");
	add("{\"term\":\"niels henrik abel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10826801\"]}");
	add("{\"term\":\"niels henrik david bohr\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10874796\"]}");
	add("{\"term\":\"nielsen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11226996\"]}");
	add("{\"term\":\"nierembergia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12929405\"]}");
	add("{\"term\":\"nierembergia frutescens\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12929828\"]}");
	add("{\"term\":\"nierembergia repens\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12929614\"]}");
	add("{\"term\":\"nierembergia rivularis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12929614\"]}");
	add("{\"term\":\"nietzsche\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11227115\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }