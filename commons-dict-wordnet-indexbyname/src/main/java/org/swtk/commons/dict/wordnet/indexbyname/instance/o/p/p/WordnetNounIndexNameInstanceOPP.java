package org.swtk.commons.dict.wordnet.indexbyname.instance.o.p.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceOPP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"oppenheimer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11235899\"]}");
	add("{\"term\":\"opponent\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09792668\", \"10399319\"]}");
	add("{\"term\":\"opportuneness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04726102\"]}");
	add("{\"term\":\"opportunism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04842719\"]}");
	add("{\"term\":\"opportunist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10399075\"]}");
	add("{\"term\":\"opportunistic infection\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14201964\"]}");
	add("{\"term\":\"opportunity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14507501\"]}");
	add("{\"term\":\"opportunity cost\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13326816\"]}");
	add("{\"term\":\"opposer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09792668\"]}");
	add("{\"term\":\"opposite\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"13881030\", \"10399319\", \"13880801\", \"06298695\"]}");
	add("{\"term\":\"opposite number\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05703771\"]}");
	add("{\"term\":\"opposite word\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06298695\"]}");
	add("{\"term\":\"oppositeness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13876846\"]}");
	add("{\"term\":\"opposition\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"08421145\", \"10075655\", \"13851118\", \"08420744\", \"10399319\", \"01172234\", \"13876846\", \"00203133\"]}");
	add("{\"term\":\"oppression\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07554062\", \"14020204\", \"00422042\"]}");
	add("{\"term\":\"oppressiveness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04718307\", \"07554062\"]}");
	add("{\"term\":\"oppressor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10399457\"]}");
	add("{\"term\":\"opprobrium\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14464696\", \"14464964\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }