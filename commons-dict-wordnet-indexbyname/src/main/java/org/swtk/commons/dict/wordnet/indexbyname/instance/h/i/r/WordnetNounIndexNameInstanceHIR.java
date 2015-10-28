package org.swtk.commons.dict.wordnet.indexbyname.instance.h.i.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHIR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"hire\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00810735\", \"10189653\"]}");
	add("{\"term\":\"hireling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10196544\"]}");
	add("{\"term\":\"hirer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09887362\"]}");
	add("{\"term\":\"hirohito\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11071817\"]}");
	add("{\"term\":\"hiroshima\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08945060\"]}");
	add("{\"term\":\"hirschfeld\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11072038\"]}");
	add("{\"term\":\"hirschsprung\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11072181\"]}");
	add("{\"term\":\"hirsuteness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04690957\"]}");
	add("{\"term\":\"hirsutism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04690957\"]}");
	add("{\"term\":\"hirudinea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01940360\"]}");
	add("{\"term\":\"hirudinean\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01940550\"]}");
	add("{\"term\":\"hirudinidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01940796\"]}");
	add("{\"term\":\"hirudo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01940953\"]}");
	add("{\"term\":\"hirundinidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01596798\"]}");
	add("{\"term\":\"hirundo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01597252\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }