package org.swtk.commons.dict.wordnet.indexbyname.instance.j.e.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceJET {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"jet\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"03392772\", \"03611785\", \"11495467\", \"14949516\", \"07450700\", \"03601053\"]}");
	add("{\"term\":\"jet black\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04967759\"]}");
	add("{\"term\":\"jet bridge\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03601292\"]}");
	add("{\"term\":\"jet engine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03601478\"]}");
	add("{\"term\":\"jet lag\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14040504\"]}");
	add("{\"term\":\"jet plane\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03601053\"]}");
	add("{\"term\":\"jet propulsion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11490408\"]}");
	add("{\"term\":\"jet set\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08268677\"]}");
	add("{\"term\":\"jet stream\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11490539\"]}");
	add("{\"term\":\"jeth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15244945\"]}");
	add("{\"term\":\"jetliner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03601736\"]}");
	add("{\"term\":\"jetsam\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03372721\", \"03601832\"]}");
	add("{\"term\":\"jetty\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02897867\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }