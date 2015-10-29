package org.swtk.commons.dict.wordnet.indexbyname.instance.i.s.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceIST {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"istanbul\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09064260\"]}");
	add("{\"term\":\"isthmian games\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00517437\"]}");
	add("{\"term\":\"isthmus\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05274710\", \"09342510\"]}");
	add("{\"term\":\"isthmus of corinth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09342808\"]}");
	add("{\"term\":\"isthmus of darien\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09343145\"]}");
	add("{\"term\":\"isthmus of kra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09343017\"]}");
	add("{\"term\":\"isthmus of panama\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09343145\"]}");
	add("{\"term\":\"isthmus of suez\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09343391\"]}");
	add("{\"term\":\"isthmus of tehuantepec\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09343517\"]}");
	add("{\"term\":\"istiophoridae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02632682\"]}");
	add("{\"term\":\"istiophorus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02633098\"]}");
	add("{\"term\":\"istiophorus albicans\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02633245\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }