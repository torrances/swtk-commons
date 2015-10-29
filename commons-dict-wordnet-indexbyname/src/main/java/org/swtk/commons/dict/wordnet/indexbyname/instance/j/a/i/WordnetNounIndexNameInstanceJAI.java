package org.swtk.commons.dict.wordnet.indexbyname.instance.j.a.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceJAI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"jai alai\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00481377\"]}");
	add("{\"term\":\"jail\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03597432\"]}");
	add("{\"term\":\"jail bird\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10238791\"]}");
	add("{\"term\":\"jail cell\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02994757\"]}");
	add("{\"term\":\"jail delivery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00096693\"]}");
	add("{\"term\":\"jailbird\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10238791\"]}");
	add("{\"term\":\"jailbreak\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00060809\"]}");
	add("{\"term\":\"jailer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10169387\"]}");
	add("{\"term\":\"jailhouse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03597432\"]}");
	add("{\"term\":\"jailor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10169387\"]}");
	add("{\"term\":\"jainism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06249785\", \"08115158\"]}");
	add("{\"term\":\"jainist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09704463\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }