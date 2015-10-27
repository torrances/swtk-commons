package org.swtk.commons.dict.wordnet.index.name.instance.p.a.n.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePANE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pane\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02678511\", \"03888308\", \"03887590\"]}");
	add("{\"term\":\"panegyric\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06706894\"]}");
	add("{\"term\":\"panegyrist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09640191\"]}");
	add("{\"term\":\"panel\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"03102791\", \"03191952\", \"03453197\", \"03888043\", \"08431338\", \"08431565\", \"08431764\", \"03887755\"]}");
	add("{\"term\":\"paneling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03888308\"]}");
	add("{\"term\":\"panelist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10415805\"]}");
	add("{\"term\":\"panelling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03888308\"]}");
	add("{\"term\":\"panellist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10415805\"]}");
	add("{\"term\":\"panencephalitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14367002\"]}");
	add("{\"term\":\"panenthesism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06234997\"]}");
	add("{\"term\":\"panetela\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03886904\"]}");
	add("{\"term\":\"panetella\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03886904\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }