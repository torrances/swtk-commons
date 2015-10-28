package org.swtk.commons.dict.wordnet.indexbyname.instance.o.c.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceOCE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ocean\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13799183\", \"09399110\"]}");
	add("{\"term\":\"oceanaut\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09820794\"]}");
	add("{\"term\":\"oceanfront\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09399698\"]}");
	add("{\"term\":\"oceania\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08854867\"]}");
	add("{\"term\":\"oceanic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06950762\"]}");
	add("{\"term\":\"oceanica\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08854867\"]}");
	add("{\"term\":\"oceanid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09574028\"]}");
	add("{\"term\":\"oceanites\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02064078\"]}");
	add("{\"term\":\"oceanographer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10389821\"]}");
	add("{\"term\":\"oceanography\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06129511\"]}");
	add("{\"term\":\"oceanology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06129511\"]}");
	add("{\"term\":\"oceanus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09597945\"]}");
	add("{\"term\":\"ocellus\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04688978\", \"05319831\"]}");
	add("{\"term\":\"ocelot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02128146\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }