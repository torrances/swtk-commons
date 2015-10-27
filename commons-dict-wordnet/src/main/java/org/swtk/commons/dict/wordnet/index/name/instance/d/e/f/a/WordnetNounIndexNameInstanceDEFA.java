package org.swtk.commons.dict.wordnet.index.name.instance.d.e.f.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDEFA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"defacement\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00404274\"]}");
	add("{\"term\":\"defalcation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00778229\", \"13294761\"]}");
	add("{\"term\":\"defalcator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10071145\"]}");
	add("{\"term\":\"defamation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01222825\", \"06732328\"]}");
	add("{\"term\":\"defamer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10018655\"]}");
	add("{\"term\":\"default\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"05799872\", \"13321164\", \"13321434\", \"00068217\"]}");
	add("{\"term\":\"defaulter\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10018963\", \"10019052\", \"10019203\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }