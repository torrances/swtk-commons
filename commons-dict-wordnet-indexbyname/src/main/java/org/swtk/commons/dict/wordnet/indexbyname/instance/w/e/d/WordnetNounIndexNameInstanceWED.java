package org.swtk.commons.dict.wordnet.indexbyname.instance.w.e.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceWED {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"wed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15189280\"]}");
	add("{\"term\":\"weddell sea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09500557\"]}");
	add("{\"term\":\"wedding\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08273656\", \"01039028\", \"07466684\"]}");
	add("{\"term\":\"wedding anniversary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15275502\"]}");
	add("{\"term\":\"wedding band\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04576624\"]}");
	add("{\"term\":\"wedding cake\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07648411\"]}");
	add("{\"term\":\"wedding ceremony\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07466684\"]}");
	add("{\"term\":\"wedding chest\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03540204\"]}");
	add("{\"term\":\"wedding day\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15247747\"]}");
	add("{\"term\":\"wedding dress\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02901868\"]}");
	add("{\"term\":\"wedding gift\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13290482\"]}");
	add("{\"term\":\"wedding gown\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02901868\"]}");
	add("{\"term\":\"wedding guest\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10792060\"]}");
	add("{\"term\":\"wedding licence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06563330\"]}");
	add("{\"term\":\"wedding license\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06563330\"]}");
	add("{\"term\":\"wedding march\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07073190\"]}");
	add("{\"term\":\"wedding night\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15247844\"]}");
	add("{\"term\":\"wedding party\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08273656\"]}");
	add("{\"term\":\"wedding picture\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04576491\"]}");
	add("{\"term\":\"wedding present\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13290482\"]}");
	add("{\"term\":\"wedding reception\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08271797\"]}");
	add("{\"term\":\"wedding ring\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04576624\"]}");
	add("{\"term\":\"wedge\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"03027561\", \"04576806\", \"04577108\", \"04577269\", \"06836139\", \"07713570\", \"13942580\"]}");
	add("{\"term\":\"wedge bone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07674941\"]}");
	add("{\"term\":\"wedge heel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04577269\"]}");
	add("{\"term\":\"wedge shape\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13942580\"]}");
	add("{\"term\":\"wedgie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04577404\"]}");
	add("{\"term\":\"wedgwood\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04577500\", \"11399431\"]}");
	add("{\"term\":\"wedlock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13987306\"]}");
	add("{\"term\":\"wednesday\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15189280\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }