package org.swtk.commons.dict.wordnet.indexbyname.instance.h.a.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHAB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"habacuc\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06452159\"]}");
	add("{\"term\":\"habakkuk\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06452159\", \"11041096\"]}");
	add("{\"term\":\"habanera\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00534359\", \"07069652\"]}");
	add("{\"term\":\"habenaria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12085497\"]}");
	add("{\"term\":\"haber\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11041174\"]}");
	add("{\"term\":\"haberdasher\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09950230\"]}");
	add("{\"term\":\"haberdashery\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03478827\", \"03056449\"]}");
	add("{\"term\":\"habergeon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03478940\"]}");
	add("{\"term\":\"habiliment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03055525\"]}");
	add("{\"term\":\"habit\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00949739\", \"03479290\", \"13512112\", \"03479089\", \"00415192\", \"05676878\"]}");
	add("{\"term\":\"habitability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04729507\"]}");
	add("{\"term\":\"habitableness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04729507\"]}");
	add("{\"term\":\"habitant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09643248\"]}");
	add("{\"term\":\"habitat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08598111\"]}");
	add("{\"term\":\"habitation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01056469\", \"03264208\", \"08598331\"]}");
	add("{\"term\":\"habituation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00195680\", \"14086207\"]}");
	add("{\"term\":\"habitude\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00416013\"]}");
	add("{\"term\":\"habitue\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10536998\"]}");
	add("{\"term\":\"habitus\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05005695\", \"14554658\"]}");
	add("{\"term\":\"habsburg\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08172201\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }