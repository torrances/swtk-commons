package org.swtk.commons.dict.wordnet.index.name.instance.o.p.p.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceOPPO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"opponent\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09792668\", \"10399319\"]}");
	add("{\"term\":\"opportuneness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04726102\"]}");
	add("{\"term\":\"opportunism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04842719\"]}");
	add("{\"term\":\"opportunist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10399075\"]}");
	add("{\"term\":\"opportunity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14507501\"]}");
	add("{\"term\":\"opposer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09792668\"]}");
	add("{\"term\":\"opposite\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"13881030\", \"10399319\", \"13880801\", \"06298695\"]}");
	add("{\"term\":\"oppositeness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13876846\"]}");
	add("{\"term\":\"opposition\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"08421145\", \"10075655\", \"13851118\", \"08420744\", \"10399319\", \"01172234\", \"13876846\", \"00203133\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }