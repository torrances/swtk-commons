package org.swtk.commons.dict.wordnet.index.name.instance.s.y.n.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSYNE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"synecdoche\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07123138\"]}");
	add("{\"term\":\"synechia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14229959\"]}");
	add("{\"term\":\"synentognathi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02552164\"]}");
	add("{\"term\":\"synercus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02412015\"]}");
	add("{\"term\":\"syneresis\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13585842\", \"13585998\"]}");
	add("{\"term\":\"synergism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06201589\", \"13586113\"]}");
	add("{\"term\":\"synergist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04383346\"]}");
	add("{\"term\":\"synergy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13586113\"]}");
	add("{\"term\":\"synesthesia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05728549\"]}");
	add("{\"term\":\"synezesis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13586404\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }