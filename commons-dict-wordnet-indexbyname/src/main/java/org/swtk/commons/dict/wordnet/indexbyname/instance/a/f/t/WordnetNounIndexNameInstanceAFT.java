package org.swtk.commons.dict.wordnet.indexbyname.instance.a.f.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAFT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"after part\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04323784\"]}");
	add("{\"term\":\"afterbirth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05528616\"]}");
	add("{\"term\":\"afterburner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02686412\"]}");
	add("{\"term\":\"aftercare\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00657435\"]}");
	add("{\"term\":\"afterdamp\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14750821\"]}");
	add("{\"term\":\"afterdeck\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02686551\"]}");
	add("{\"term\":\"aftereffect\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14335001\", \"11431615\"]}");
	add("{\"term\":\"afterglow\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07507508\", \"11538331\"]}");
	add("{\"term\":\"afterimage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05944848\"]}");
	add("{\"term\":\"afterlife\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15168824\"]}");
	add("{\"term\":\"aftermath\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07308725\", \"11431724\"]}");
	add("{\"term\":\"afternoon\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06645314\", \"15191238\"]}");
	add("{\"term\":\"afternoon tea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07591075\"]}");
	add("{\"term\":\"afterpains\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14354397\"]}");
	add("{\"term\":\"afterpiece\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07021660\"]}");
	add("{\"term\":\"afters\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07625449\"]}");
	add("{\"term\":\"aftersensation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05944848\"]}");
	add("{\"term\":\"aftershaft\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01899898\"]}");
	add("{\"term\":\"aftershock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07444237\"]}");
	add("{\"term\":\"aftertaste\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05945018\"]}");
	add("{\"term\":\"afterthought\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02686795\", \"05798017\"]}");
	add("{\"term\":\"afterworld\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05634307\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }