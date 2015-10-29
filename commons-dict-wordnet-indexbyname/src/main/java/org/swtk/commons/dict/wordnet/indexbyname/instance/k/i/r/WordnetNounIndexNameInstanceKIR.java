package org.swtk.commons.dict.wordnet.indexbyname.instance.k.i.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceKIR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"kirchhoff\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11125935\"]}");
	add("{\"term\":\"kirchner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11126160\"]}");
	add("{\"term\":\"kirghiz\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06940513\", \"09042810\", \"09755744\"]}");
	add("{\"term\":\"kirghizia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09042810\"]}");
	add("{\"term\":\"kirghizstan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09042810\"]}");
	add("{\"term\":\"kirgiz\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06940513\", \"09042810\", \"09755744\"]}");
	add("{\"term\":\"kirgizia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09042810\"]}");
	add("{\"term\":\"kirgizstan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09042810\"]}");
	add("{\"term\":\"kiribati\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08859741\"]}");
	add("{\"term\":\"kiribati dollar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13695755\"]}");
	add("{\"term\":\"kirk\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03624191\"]}");
	add("{\"term\":\"kirkia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12738674\"]}");
	add("{\"term\":\"kirkia wilmsii\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12738834\"]}");
	add("{\"term\":\"kirkuk\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08934623\"]}");
	add("{\"term\":\"kirpan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03624259\"]}");
	add("{\"term\":\"kirsch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07920312\"]}");
	add("{\"term\":\"kirtle\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03624405\", \"03624484\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }