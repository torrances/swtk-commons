package org.swtk.commons.dict.wordnet.indexbyname.instance.r.i.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRIT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ritalin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03762153\"]}");
	add("{\"term\":\"rite\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01029801\", \"01031438\"]}");
	add("{\"term\":\"rite of passage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01039326\"]}");
	add("{\"term\":\"ritonavir\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04102077\"]}");
	add("{\"term\":\"rittenhouse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11283327\"]}");
	add("{\"term\":\"ritual\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00415803\", \"01032852\", \"01029801\"]}");
	add("{\"term\":\"ritual dance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00542516\"]}");
	add("{\"term\":\"ritual dancing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00542516\"]}");
	add("{\"term\":\"ritual killing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00228462\"]}");
	add("{\"term\":\"ritualism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01033055\", \"06157453\"]}");
	add("{\"term\":\"ritualist\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10552308\", \"10552443\"]}");
	add("{\"term\":\"ritz\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04102203\", \"06902925\", \"11283548\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }