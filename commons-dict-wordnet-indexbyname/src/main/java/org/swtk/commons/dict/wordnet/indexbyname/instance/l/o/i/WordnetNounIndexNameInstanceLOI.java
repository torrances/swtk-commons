package org.swtk.commons.dict.wordnet.indexbyname.instance.l.o.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLOI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"loin\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02466034\", \"07674287\"]}");
	add("{\"term\":\"loin of lamb\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07683617\"]}");
	add("{\"term\":\"loincloth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02899556\"]}");
	add("{\"term\":\"loins\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05605349\", \"05566188\"]}");
	add("{\"term\":\"loir\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02355584\"]}");
	add("{\"term\":\"loire\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09365843\"]}");
	add("{\"term\":\"loire river\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09365843\"]}");
	add("{\"term\":\"loire valley\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09366029\"]}");
	add("{\"term\":\"loiseleuria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12260852\"]}");
	add("{\"term\":\"loiseleuria procumbens\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12260994\"]}");
	add("{\"term\":\"loiterer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10289929\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }