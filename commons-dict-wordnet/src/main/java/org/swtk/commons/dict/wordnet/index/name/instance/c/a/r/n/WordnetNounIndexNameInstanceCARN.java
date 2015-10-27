package org.swtk.commons.dict.wordnet.index.name.instance.c.a.r.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCARN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"carnage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00224850\"]}");
	add("{\"term\":\"carnality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07505354\"]}");
	add("{\"term\":\"carnallite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14693574\"]}");
	add("{\"term\":\"carnation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04978478\", \"11828937\"]}");
	add("{\"term\":\"carnauba\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12609081\", \"12609345\"]}");
	add("{\"term\":\"carnegie\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10902740\", \"10902954\"]}");
	add("{\"term\":\"carnegiea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11864672\"]}");
	add("{\"term\":\"carnelian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14825764\"]}");
	add("{\"term\":\"carnival\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00520389\", \"00553716\", \"00512566\"]}");
	add("{\"term\":\"carnivora\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02077567\"]}");
	add("{\"term\":\"carnivore\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01327072\", \"02077948\"]}");
	add("{\"term\":\"carnosaur\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01716149\"]}");
	add("{\"term\":\"carnosaura\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01715951\"]}");
	add("{\"term\":\"carnot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10903132\"]}");
	add("{\"term\":\"carnotite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14693838\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }