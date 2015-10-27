package org.swtk.commons.dict.wordnet.index.name.instance.v.i.s.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceVISC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"viscaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12759619\"]}");
	add("{\"term\":\"viscacha\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02370768\"]}");
	add("{\"term\":\"viscera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05306487\"]}");
	add("{\"term\":\"viscidity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04943081\"]}");
	add("{\"term\":\"viscidness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04943081\"]}");
	add("{\"term\":\"viscometer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04545544\"]}");
	add("{\"term\":\"viscometry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01119639\"]}");
	add("{\"term\":\"visconti\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11387576\"]}");
	add("{\"term\":\"viscose\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04545698\", \"14989955\"]}");
	add("{\"term\":\"viscosimeter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04545544\"]}");
	add("{\"term\":\"viscosimetry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01119639\"]}");
	add("{\"term\":\"viscosity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04942180\"]}");
	add("{\"term\":\"viscount\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10775483\", \"10775816\"]}");
	add("{\"term\":\"viscountcy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06354810\", \"14456698\"]}");
	add("{\"term\":\"viscountess\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10775594\", \"10775729\"]}");
	add("{\"term\":\"viscounty\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08575513\", \"14456698\"]}");
	add("{\"term\":\"viscousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04942180\"]}");
	add("{\"term\":\"viscum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12759832\"]}");
	add("{\"term\":\"viscus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05306228\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }