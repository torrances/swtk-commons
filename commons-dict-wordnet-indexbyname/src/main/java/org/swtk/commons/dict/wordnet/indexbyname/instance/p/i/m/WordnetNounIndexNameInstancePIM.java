package org.swtk.commons.dict.wordnet.indexbyname.instance.p.i.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePIM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pima\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06931416\", \"09685602\"]}");
	add("{\"term\":\"pimenta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12351268\"]}");
	add("{\"term\":\"pimenta acris\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12351408\"]}");
	add("{\"term\":\"pimenta dioica\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12351583\"]}");
	add("{\"term\":\"pimenta officinalis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12351780\"]}");
	add("{\"term\":\"pimento\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07736940\", \"12922024\"]}");
	add("{\"term\":\"pimento butter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07871788\"]}");
	add("{\"term\":\"pimento tree\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12351583\"]}");
	add("{\"term\":\"pimiento\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07736940\", \"12922024\"]}");
	add("{\"term\":\"pimlico\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03946298\"]}");
	add("{\"term\":\"pimozide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03946430\"]}");
	add("{\"term\":\"pimp\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10453501\"]}");
	add("{\"term\":\"pimpernel\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12112779\", \"12658246\"]}");
	add("{\"term\":\"pimpinella\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12963690\"]}");
	add("{\"term\":\"pimpinella anisum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12963809\"]}");
	add("{\"term\":\"pimple\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14357711\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }