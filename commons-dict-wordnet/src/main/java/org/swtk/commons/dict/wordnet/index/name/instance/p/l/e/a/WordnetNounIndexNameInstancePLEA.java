package org.swtk.commons.dict.wordnet.index.name.instance.p.l.e.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePLEA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"plea\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01200418\", \"06573129\", \"07202298\"]}");
	add("{\"term\":\"pleader\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09795104\"]}");
	add("{\"term\":\"pleading\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06571356\"]}");
	add("{\"term\":\"pleasance\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07505853\", \"08661381\"]}");
	add("{\"term\":\"pleasantness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04785869\", \"07507310\"]}");
	add("{\"term\":\"pleasantry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00516308\"]}");
	add("{\"term\":\"pleaser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10460698\"]}");
	add("{\"term\":\"pleasing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01075480\"]}");
	add("{\"term\":\"pleasingness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04692211\"]}");
	add("{\"term\":\"pleasure\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00847956\", \"01073670\", \"05798457\", \"05838106\", \"07505853\"]}");
	add("{\"term\":\"pleat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03972239\"]}");
	add("{\"term\":\"pleating\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00407621\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }