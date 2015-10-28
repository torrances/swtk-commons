package org.swtk.commons.dict.wordnet.indexbyname.instance.n.a.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceNAU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"nauch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00527830\"]}");
	add("{\"term\":\"nauclea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12689493\"]}");
	add("{\"term\":\"naucrates\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02582686\"]}");
	add("{\"term\":\"naught\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00067973\", \"13762308\"]}");
	add("{\"term\":\"naughtiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04916740\"]}");
	add("{\"term\":\"naumachia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03816703\"]}");
	add("{\"term\":\"naumachy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03816703\"]}");
	add("{\"term\":\"naupathia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14227424\"]}");
	add("{\"term\":\"nauru\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08860201\", \"08860475\"]}");
	add("{\"term\":\"nauruan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09743358\"]}");
	add("{\"term\":\"nausea\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07519350\", \"14383357\"]}");
	add("{\"term\":\"nauseant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03288430\"]}");
	add("{\"term\":\"nauseatingness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05003736\"]}");
	add("{\"term\":\"nautch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00527830\"]}");
	add("{\"term\":\"nautilidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01971232\"]}");
	add("{\"term\":\"nautilus\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01971538\", \"01973308\", \"03816835\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }