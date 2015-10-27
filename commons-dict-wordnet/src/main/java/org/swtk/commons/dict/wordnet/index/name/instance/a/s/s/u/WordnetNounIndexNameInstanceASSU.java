package org.swtk.commons.dict.wordnet.index.name.instance.a.s.s.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceASSU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"assuagement\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07508420\"]}");
	add("{\"term\":\"assuan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08918684\"]}");
	add("{\"term\":\"assumption\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"00084080\", \"04845958\", \"07372466\", \"15218743\", \"00083690\", \"05900703\", \"06766514\"]}");
	add("{\"term\":\"assur\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08939014\"]}");
	add("{\"term\":\"assurance\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"13366301\", \"07242066\", \"07242432\", \"05705328\"]}");
	add("{\"term\":\"assurbanipal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10845637\"]}");
	add("{\"term\":\"assuredness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04911339\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }