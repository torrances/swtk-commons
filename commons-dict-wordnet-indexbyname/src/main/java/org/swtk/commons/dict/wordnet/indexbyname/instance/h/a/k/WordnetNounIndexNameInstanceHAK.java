package org.swtk.commons.dict.wordnet.indexbyname.instance.h.a.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHAK {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"hake\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02527155\", \"07808003\"]}");
	add("{\"term\":\"hakea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12239138\"]}");
	add("{\"term\":\"hakea laurina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12239385\"]}");
	add("{\"term\":\"hakea leucoptera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12239582\"]}");
	add("{\"term\":\"hakea lissosperma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12239806\"]}");
	add("{\"term\":\"hakeem\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10176189\"]}");
	add("{\"term\":\"hakenkreuz\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06896775\"]}");
	add("{\"term\":\"hakham\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06352347\"]}");
	add("{\"term\":\"hakim\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10176189\", \"10176286\"]}");
	add("{\"term\":\"hakka\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06943581\", \"10176391\"]}");
	add("{\"term\":\"hakka dialect\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06943581\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }