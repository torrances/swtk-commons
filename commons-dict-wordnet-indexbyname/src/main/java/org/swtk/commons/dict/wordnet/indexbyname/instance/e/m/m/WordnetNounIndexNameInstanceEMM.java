package org.swtk.commons.dict.wordnet.indexbyname.instance.e.m.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEMM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"emma goldman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11024857\"]}");
	add("{\"term\":\"emma hart willard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11407968\"]}");
	add("{\"term\":\"emmanthe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12855956\"]}");
	add("{\"term\":\"emmanthe penduliflora\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12856091\"]}");
	add("{\"term\":\"emmenagogue\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14876833\"]}");
	add("{\"term\":\"emmental\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07870958\"]}");
	add("{\"term\":\"emmentaler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07870958\"]}");
	add("{\"term\":\"emmenthal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07870958\"]}");
	add("{\"term\":\"emmenthaler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07870958\"]}");
	add("{\"term\":\"emmer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12163732\"]}");
	add("{\"term\":\"emmet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02222138\"]}");
	add("{\"term\":\"emmetropia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14120439\"]}");
	add("{\"term\":\"emmett kelly\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11120129\"]}");
	add("{\"term\":\"emmy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07283308\"]}");
	add("{\"term\":\"emmy noether\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11228907\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }