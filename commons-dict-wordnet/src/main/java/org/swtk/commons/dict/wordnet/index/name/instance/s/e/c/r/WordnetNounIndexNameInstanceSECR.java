package org.swtk.commons.dict.wordnet.index.name.instance.s.e.c.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSECR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"secrecy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14439493\", \"04659534\"]}");
	add("{\"term\":\"secret\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05693343\", \"06685698\", \"06685887\"]}");
	add("{\"term\":\"secretaire\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04171929\"]}");
	add("{\"term\":\"secretariat\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02387080\", \"08341204\"]}");
	add("{\"term\":\"secretariate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08341204\"]}");
	add("{\"term\":\"secretary\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04171929\", \"10541521\", \"10589188\", \"10589463\"]}");
	add("{\"term\":\"secretaryship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00600587\"]}");
	add("{\"term\":\"secretase\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15046127\"]}");
	add("{\"term\":\"secreter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05335315\"]}");
	add("{\"term\":\"secretin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05416769\"]}");
	add("{\"term\":\"secretion\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05412071\", \"13575119\"]}");
	add("{\"term\":\"secretiveness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04659534\", \"04664764\"]}");
	add("{\"term\":\"secretor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05335315\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }