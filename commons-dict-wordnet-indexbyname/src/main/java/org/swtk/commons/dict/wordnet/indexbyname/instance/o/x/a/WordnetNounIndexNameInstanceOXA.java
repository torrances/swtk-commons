package org.swtk.commons.dict.wordnet.indexbyname.instance.o.x.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceOXA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"oxacillin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03873033\"]}");
	add("{\"term\":\"oxalacetate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14995204\"]}");
	add("{\"term\":\"oxalacetic acid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14995311\"]}");
	add("{\"term\":\"oxalate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14995479\"]}");
	add("{\"term\":\"oxalic acid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14995581\"]}");
	add("{\"term\":\"oxalidaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12723203\"]}");
	add("{\"term\":\"oxalis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12723708\"]}");
	add("{\"term\":\"oxalis acetosella\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12723950\"]}");
	add("{\"term\":\"oxalis caprina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12724476\"]}");
	add("{\"term\":\"oxalis cernua\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12724143\"]}");
	add("{\"term\":\"oxalis corniculata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12724317\"]}");
	add("{\"term\":\"oxalis crenata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12724801\"]}");
	add("{\"term\":\"oxalis tuberosa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12724801\"]}");
	add("{\"term\":\"oxalis violacea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12724616\"]}");
	add("{\"term\":\"oxaloacetate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14995204\"]}");
	add("{\"term\":\"oxaloacetic acid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14995311\"]}");
	add("{\"term\":\"oxandra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11716807\"]}");
	add("{\"term\":\"oxandra lanceolata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11716919\"]}");
	add("{\"term\":\"oxaprozin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03873193\"]}");
	add("{\"term\":\"oxazepam\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03873353\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }