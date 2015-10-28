package org.swtk.commons.dict.wordnet.indexbyname.instance.x.e.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceXEN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"xenarthra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02456521\"]}");
	add("{\"term\":\"xenicidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01590813\"]}");
	add("{\"term\":\"xenicus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01591230\"]}");
	add("{\"term\":\"xenogenesis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11444308\"]}");
	add("{\"term\":\"xenograft\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05591274\"]}");
	add("{\"term\":\"xenolith\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09504250\"]}");
	add("{\"term\":\"xenon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14685453\"]}");
	add("{\"term\":\"xenophanes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11421190\"]}");
	add("{\"term\":\"xenophobia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14409427\"]}");
	add("{\"term\":\"xenophon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11421278\"]}");
	add("{\"term\":\"xenopodidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01656886\"]}");
	add("{\"term\":\"xenopus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01657070\"]}");
	add("{\"term\":\"xenorhyncus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02006997\"]}");
	add("{\"term\":\"xenosauridae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01693344\"]}");
	add("{\"term\":\"xenosaurus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01693498\"]}");
	add("{\"term\":\"xenotime\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15130522\"]}");
	add("{\"term\":\"xenotransplant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01270764\"]}");
	add("{\"term\":\"xenotransplantation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01270764\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }