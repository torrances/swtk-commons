package org.swtk.commons.dict.wordnet.indexbyname.instance.r.i.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRID {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"riddance\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00207776\", \"00396141\"]}");
	add("{\"term\":\"riddle\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04095808\", \"06798080\"]}");
	add("{\"term\":\"ride\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04095909\", \"00308457\"]}");
	add("{\"term\":\"rider\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"10423621\", \"10549725\", \"06406207\", \"10549540\"]}");
	add("{\"term\":\"ridge\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"04096264\", \"05611097\", \"09432630\", \"09432776\", \"13924741\", \"09432390\"]}");
	add("{\"term\":\"ridgel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02379715\"]}");
	add("{\"term\":\"ridgeline\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09432630\"]}");
	add("{\"term\":\"ridgeling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02379715\"]}");
	add("{\"term\":\"ridgepole\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04096264\"]}");
	add("{\"term\":\"ridgil\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02379715\"]}");
	add("{\"term\":\"ridgling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02379715\"]}");
	add("{\"term\":\"ridicule\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01227006\", \"06728725\"]}");
	add("{\"term\":\"ridiculer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10572170\"]}");
	add("{\"term\":\"ridiculousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06620162\"]}");
	add("{\"term\":\"riding\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00300043\", \"00451320\"]}");
	add("{\"term\":\"ridley\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01667010\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }