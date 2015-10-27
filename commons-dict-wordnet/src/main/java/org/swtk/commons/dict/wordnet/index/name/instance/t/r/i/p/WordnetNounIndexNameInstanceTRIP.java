package org.swtk.commons.dict.wordnet.index.name.instance.t.r.i.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTRIP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"trip\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"00077383\", \"00287084\", \"04492482\", \"07303090\", \"07332119\", \"14401716\", \"00309196\"]}");
	add("{\"term\":\"tripalmitin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15104622\"]}");
	add("{\"term\":\"tripe\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06624351\", \"07678965\"]}");
	add("{\"term\":\"triphammer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04491903\"]}");
	add("{\"term\":\"triphosphopyridine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15104735\"]}");
	add("{\"term\":\"triple\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05868961\", \"08002640\", \"00133802\"]}");
	add("{\"term\":\"triplet\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08002640\", \"10749453\", \"13766184\"]}");
	add("{\"term\":\"tripletail\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02638800\"]}");
	add("{\"term\":\"tripleurospermum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12048665\"]}");
	add("{\"term\":\"triplicate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04492036\"]}");
	add("{\"term\":\"triplicity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05106119\", \"08003213\"]}");
	add("{\"term\":\"tripling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13591675\"]}");
	add("{\"term\":\"triplochiton\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12222278\"]}");
	add("{\"term\":\"tripod\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04492338\"]}");
	add("{\"term\":\"tripoli\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08977766\", \"08979872\", \"14960612\"]}");
	add("{\"term\":\"tripos\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07214116\"]}");
	add("{\"term\":\"tripper\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04492482\", \"10616097\", \"10686480\", \"10749575\"]}");
	add("{\"term\":\"triptych\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04492679\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }