package org.swtk.commons.dict.wordnet.indexbyname.instance.c.u.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCUM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05411679\"]}");
	add("{\"term\":\"cumana\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09185374\"]}");
	add("{\"term\":\"cumarone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14922252\"]}");
	add("{\"term\":\"cumberland\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09284044\", \"10936916\"]}");
	add("{\"term\":\"cumbersomeness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04718941\"]}");
	add("{\"term\":\"cumbria\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08901776\", \"08901901\"]}");
	add("{\"term\":\"cumfrey\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12843529\"]}");
	add("{\"term\":\"cumin\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07830610\", \"12957586\"]}");
	add("{\"term\":\"cuminum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12957473\"]}");
	add("{\"term\":\"cummerbund\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03152063\"]}");
	add("{\"term\":\"cummings\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10937129\"]}");
	add("{\"term\":\"cumquat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12733823\"]}");
	add("{\"term\":\"cumulation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07978094\"]}");
	add("{\"term\":\"cumulonimbus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09284678\"]}");
	add("{\"term\":\"cumulus\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07978094\", \"09284866\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }