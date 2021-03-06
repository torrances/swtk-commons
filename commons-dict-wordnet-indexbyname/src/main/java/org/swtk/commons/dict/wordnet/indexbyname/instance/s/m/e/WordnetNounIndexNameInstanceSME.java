package org.swtk.commons.dict.wordnet.indexbyname.instance.s.m.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSME {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"smear\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00073081\", \"04701789\", \"05272638\", \"06732965\"]}");
	add("{\"term\":\"smear test\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05751241\"]}");
	add("{\"term\":\"smear word\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06733830\"]}");
	add("{\"term\":\"smegma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05424506\"]}");
	add("{\"term\":\"smell\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00884639\", \"05666448\", \"14549784\", \"04987257\", \"05721684\"]}");
	add("{\"term\":\"smelling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00884639\"]}");
	add("{\"term\":\"smelling bottle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04253188\"]}");
	add("{\"term\":\"smelling salts\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15067966\"]}");
	add("{\"term\":\"smelt\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02543043\", \"07814530\"]}");
	add("{\"term\":\"smelter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04253284\"]}");
	add("{\"term\":\"smeltery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04253284\"]}");
	add("{\"term\":\"smetana\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11325154\"]}");
	add("{\"term\":\"smew\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01857829\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }