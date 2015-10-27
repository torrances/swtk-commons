package org.swtk.commons.dict.wordnet.index.name.instance.b.r.a.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBRAI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"braid\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02892276\", \"05266995\"]}");
	add("{\"term\":\"braiding\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02892276\"]}");
	add("{\"term\":\"brail\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02892469\", \"02892573\"]}");
	add("{\"term\":\"braille\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06374199\", \"10881877\"]}");
	add("{\"term\":\"brain\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"07668194\", \"10146463\", \"05619057\", \"05625839\", \"05488747\"]}");
	add("{\"term\":\"braincase\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05548146\"]}");
	add("{\"term\":\"brainchild\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03579155\"]}");
	add("{\"term\":\"brainiac\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10146463\"]}");
	add("{\"term\":\"brainpan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05548146\"]}");
	add("{\"term\":\"brainpower\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05625839\"]}");
	add("{\"term\":\"brainstem\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05508836\"]}");
	add("{\"term\":\"brainstorm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05815314\"]}");
	add("{\"term\":\"brainstorming\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01205767\"]}");
	add("{\"term\":\"brainwashing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00890638\"]}");
	add("{\"term\":\"brainwave\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05815314\", \"11451416\"]}");
	add("{\"term\":\"brainworker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09892462\"]}");
	add("{\"term\":\"braising\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00248096\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }