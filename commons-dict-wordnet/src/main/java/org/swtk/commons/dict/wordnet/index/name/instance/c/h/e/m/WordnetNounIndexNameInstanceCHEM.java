package org.swtk.commons.dict.wordnet.index.name.instance.c.h.e.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCHEM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"chemakuan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06926724\"]}");
	add("{\"term\":\"chemakum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06926845\"]}");
	add("{\"term\":\"chemical\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14831008\"]}");
	add("{\"term\":\"chemiluminescence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11497167\"]}");
	add("{\"term\":\"chemise\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03017092\", \"03017234\"]}");
	add("{\"term\":\"chemisorption\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13469096\"]}");
	add("{\"term\":\"chemist\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10441215\", \"09933282\"]}");
	add("{\"term\":\"chemistry\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"13863157\", \"14604732\", \"06094057\"]}");
	add("{\"term\":\"chemnitz\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08788351\"]}");
	add("{\"term\":\"chemoimmunology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06061456\"]}");
	add("{\"term\":\"chemoreceptor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05307730\"]}");
	add("{\"term\":\"chemosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14339475\"]}");
	add("{\"term\":\"chemosorption\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13469096\"]}");
	add("{\"term\":\"chemosurgery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00669647\"]}");
	add("{\"term\":\"chemosynthesis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13469352\"]}");
	add("{\"term\":\"chemotaxis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00864537\"]}");
	add("{\"term\":\"chemotherapy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00663583\"]}");
	add("{\"term\":\"chemulpo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08975913\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }