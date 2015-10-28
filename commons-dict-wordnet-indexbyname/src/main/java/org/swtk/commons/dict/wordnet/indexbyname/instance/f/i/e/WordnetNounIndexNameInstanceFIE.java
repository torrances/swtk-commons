package org.swtk.commons.dict.wordnet.indexbyname.instance.f.i.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFIE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"fiedler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10990480\"]}");
	add("{\"term\":\"fief\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13270826\"]}");
	add("{\"term\":\"fiefdom\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08065377\", \"08575291\"]}");
	add("{\"term\":\"field\", \"synsetCount\":17, \"upperType\":\"NOUN\", \"ids\":[\"02690851\", \"05941627\", \"08022022\", \"08677077\", \"08015913\", \"08016026\", \"08569203\", \"08021702\", \"09416498\", \"08588287\", \"14537641\", \"01099024\", \"11477177\", \"06005806\", \"08587306\", \"08523662\", \"08587527\"]}");
	add("{\"term\":\"fielder\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10106152\", \"10106337\"]}");
	add("{\"term\":\"fieldfare\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01560948\"]}");
	add("{\"term\":\"fieldhand\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10099179\"]}");
	add("{\"term\":\"fielding\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10990595\", \"00127541\"]}");
	add("{\"term\":\"fieldmouse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02335407\"]}");
	add("{\"term\":\"fields\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10990710\"]}");
	add("{\"term\":\"fieldsman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10106152\"]}");
	add("{\"term\":\"fieldstone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14892267\"]}");
	add("{\"term\":\"fieldwork\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03339327\"]}");
	add("{\"term\":\"fieldworker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10111025\"]}");
	add("{\"term\":\"fiend\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10097659\", \"09565450\", \"10349658\"]}");
	add("{\"term\":\"fierceness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05044968\"]}");
	add("{\"term\":\"fieriness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04635693\", \"05023737\"]}");
	add("{\"term\":\"fiesta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07464462\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }