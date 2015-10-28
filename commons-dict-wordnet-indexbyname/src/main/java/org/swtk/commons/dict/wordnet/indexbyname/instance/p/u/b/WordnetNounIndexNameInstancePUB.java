package org.swtk.commons.dict.wordnet.indexbyname.instance.p.u.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePUB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pub\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04024793\"]}");
	add("{\"term\":\"puberty\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15173255\"]}");
	add("{\"term\":\"pubes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05566188\"]}");
	add("{\"term\":\"pubescence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15173255\"]}");
	add("{\"term\":\"pubis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05286213\"]}");
	add("{\"term\":\"public\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07982431\", \"08196607\"]}");
	add("{\"term\":\"publican\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10510006\"]}");
	add("{\"term\":\"publication\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01103863\", \"01104341\", \"01105519\", \"06601855\"]}");
	add("{\"term\":\"publiciser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10510284\"]}");
	add("{\"term\":\"publicist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10510284\"]}");
	add("{\"term\":\"publicity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04727812\", \"07261731\"]}");
	add("{\"term\":\"publicizer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10510284\"]}");
	add("{\"term\":\"publicizing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01103234\"]}");
	add("{\"term\":\"publisher\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10511160\", \"10510894\", \"08079459\"]}");
	add("{\"term\":\"publishing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01103863\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }