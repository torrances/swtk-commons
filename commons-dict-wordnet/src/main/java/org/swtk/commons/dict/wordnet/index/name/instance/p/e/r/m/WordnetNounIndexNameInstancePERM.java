package org.swtk.commons.dict.wordnet.index.name.instance.p.e.r.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePERM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"perm\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05268016\", \"09031742\"]}");
	add("{\"term\":\"permafrost\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09413039\"]}");
	add("{\"term\":\"permalloy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15003844\"]}");
	add("{\"term\":\"permanence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05060366\"]}");
	add("{\"term\":\"permanency\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05060366\"]}");
	add("{\"term\":\"permanent\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05268016\"]}");
	add("{\"term\":\"permanganate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15003969\"]}");
	add("{\"term\":\"permeability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04947673\"]}");
	add("{\"term\":\"permeableness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04947673\"]}");
	add("{\"term\":\"permeation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00052532\", \"13556157\"]}");
	add("{\"term\":\"permian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15152117\"]}");
	add("{\"term\":\"permic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06969636\"]}");
	add("{\"term\":\"permissibility\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04800440\"]}");
	add("{\"term\":\"permission\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01141515\", \"06702042\"]}");
	add("{\"term\":\"permissiveness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04645280\"]}");
	add("{\"term\":\"permit\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02582559\", \"01141515\", \"06561652\"]}");
	add("{\"term\":\"permutability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04744808\"]}");
	add("{\"term\":\"permutableness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04744808\"]}");
	add("{\"term\":\"permutation\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00340472\", \"00400031\", \"00871990\", \"07458361\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }