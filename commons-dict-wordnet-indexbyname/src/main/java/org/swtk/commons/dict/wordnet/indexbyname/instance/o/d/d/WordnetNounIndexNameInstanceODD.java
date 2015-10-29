package org.swtk.commons.dict.wordnet.indexbyname.instance.o.d.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceODD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"odd fellow\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10260211\"]}");
	add("{\"term\":\"odd fish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10260211\"]}");
	add("{\"term\":\"odd hassel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11054163\"]}");
	add("{\"term\":\"odd man out\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10260211\"]}");
	add("{\"term\":\"oddball\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10062653\"]}");
	add("{\"term\":\"oddity\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03154617\", \"04805073\", \"04806260\"]}");
	add("{\"term\":\"oddment\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03154617\", \"03291294\"]}");
	add("{\"term\":\"oddments\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08416934\"]}");
	add("{\"term\":\"oddness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04806260\", \"13812804\"]}");
	add("{\"term\":\"oddone colonna\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11180190\"]}");
	add("{\"term\":\"odds\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13845695\", \"04763759\"]}");
	add("{\"term\":\"odds and ends\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08416934\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }