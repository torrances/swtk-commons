package org.swtk.commons.dict.wordnet.indexbyname.instance.i.n.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceINO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"inocor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02709232\"]}");
	add("{\"term\":\"inoculant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14943423\"]}");
	add("{\"term\":\"inoculating\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00825715\"]}");
	add("{\"term\":\"inoculation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00825545\"]}");
	add("{\"term\":\"inoculator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10227133\"]}");
	add("{\"term\":\"inoculum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14943423\"]}");
	add("{\"term\":\"inopportuneness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04730383\"]}");
	add("{\"term\":\"inordinateness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05125737\"]}");
	add("{\"term\":\"inorganic chemistry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06098902\"]}");
	add("{\"term\":\"inorganic compound\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14943662\"]}");
	add("{\"term\":\"inorganic phosphate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15006824\"]}");
	add("{\"term\":\"inosculation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05256902\"]}");
	add("{\"term\":\"inosine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14943786\"]}");
	add("{\"term\":\"inositol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14943970\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }