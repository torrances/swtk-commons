package org.swtk.commons.dict.wordnet.indexbyname.instance.m.o.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMOM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"mom\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10297825\"]}");
	add("{\"term\":\"mombasa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08948706\"]}");
	add("{\"term\":\"mombin\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07781493\", \"12786803\"]}");
	add("{\"term\":\"moment\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"06031858\", \"11503385\", \"05178101\", \"15144992\", \"15271664\", \"15269461\"]}");
	add("{\"term\":\"momentousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05176939\"]}");
	add("{\"term\":\"momentum\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05036303\", \"05042975\"]}");
	add("{\"term\":\"momism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00822382\"]}");
	add("{\"term\":\"momma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10297825\"]}");
	add("{\"term\":\"mommsen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11205034\"]}");
	add("{\"term\":\"mommy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10297825\"]}");
	add("{\"term\":\"momordica\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12187799\"]}");
	add("{\"term\":\"momos\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09589043\"]}");
	add("{\"term\":\"momot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01833556\"]}");
	add("{\"term\":\"momotidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01833264\"]}");
	add("{\"term\":\"momotus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01833440\"]}");
	add("{\"term\":\"momus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09589043\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }