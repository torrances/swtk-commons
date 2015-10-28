package org.swtk.commons.dict.wordnet.indexbyname.instance.s.c.y;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSCY {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"scyliorhinidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01490875\"]}");
	add("{\"term\":\"scylla\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09514635\"]}");
	add("{\"term\":\"scyphozoa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01913170\"]}");
	add("{\"term\":\"scyphozoan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01913704\"]}");
	add("{\"term\":\"scyphus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04165199\"]}");
	add("{\"term\":\"scythe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04165311\"]}");
	add("{\"term\":\"scythia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09200544\"]}");
	add("{\"term\":\"scythian\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06988129\", \"10586394\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }