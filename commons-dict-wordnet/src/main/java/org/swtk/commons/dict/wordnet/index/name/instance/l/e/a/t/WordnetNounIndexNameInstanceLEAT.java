package org.swtk.commons.dict.wordnet.index.name.instance.l.e.a.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLEAT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"leather\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14783901\"]}");
	add("{\"term\":\"leatherback\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01668182\"]}");
	add("{\"term\":\"leatherette\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03658436\"]}");
	add("{\"term\":\"leatherfish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02656742\"]}");
	add("{\"term\":\"leatherjack\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02580293\"]}");
	add("{\"term\":\"leatherjacket\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02314977\", \"02580293\", \"02656742\"]}");
	add("{\"term\":\"leatherleaf\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12254835\", \"13194386\"]}");
	add("{\"term\":\"leatherneck\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10313800\"]}");
	add("{\"term\":\"leatherwood\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12368156\", \"12771527\"]}");
	add("{\"term\":\"leatherwork\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03658702\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }