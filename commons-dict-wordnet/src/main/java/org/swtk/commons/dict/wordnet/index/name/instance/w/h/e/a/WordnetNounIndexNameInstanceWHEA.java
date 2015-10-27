package org.swtk.commons.dict.wordnet.index.name.instance.w.h.e.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceWHEA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"wheal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14322122\"]}");
	add("{\"term\":\"wheat\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04974118\", \"07819521\", \"12162602\"]}");
	add("{\"term\":\"wheatear\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01564373\"]}");
	add("{\"term\":\"wheatfield\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08701024\"]}");
	add("{\"term\":\"wheatflake\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07721218\"]}");
	add("{\"term\":\"wheatgrass\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12125642\"]}");
	add("{\"term\":\"wheatley\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11402925\"]}");
	add("{\"term\":\"wheatstone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11403095\"]}");
	add("{\"term\":\"wheatworm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01935284\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }