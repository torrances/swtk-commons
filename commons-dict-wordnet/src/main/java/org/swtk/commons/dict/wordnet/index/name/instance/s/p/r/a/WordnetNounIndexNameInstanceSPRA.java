package org.swtk.commons.dict.wordnet.index.name.instance.s.p.r.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSPRA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sprachgefuhl\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05715832\"]}");
	add("{\"term\":\"sprag\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03957966\", \"04294589\"]}");
	add("{\"term\":\"spraguea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11882558\"]}");
	add("{\"term\":\"sprain\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14322838\"]}");
	add("{\"term\":\"sprat\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02535549\", \"07814961\"]}");
	add("{\"term\":\"sprawl\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05089544\", \"08557280\"]}");
	add("{\"term\":\"sprawler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10660366\"]}");
	add("{\"term\":\"sprawling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05089544\"]}");
	add("{\"term\":\"spray\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"07461133\", \"15081108\", \"02757108\", \"04294748\", \"13784445\", \"15077122\"]}");
	add("{\"term\":\"sprayer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02757108\", \"10660510\"]}");
	add("{\"term\":\"spraying\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00718720\", \"13784445\", \"00369747\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }