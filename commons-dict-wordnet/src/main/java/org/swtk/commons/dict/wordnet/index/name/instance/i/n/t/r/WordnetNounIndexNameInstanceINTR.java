package org.swtk.commons.dict.wordnet.index.name.instance.i.n.t.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceINTR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"intractability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04914446\"]}");
	add("{\"term\":\"intractableness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04914446\"]}");
	add("{\"term\":\"intrados\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13891882\"]}");
	add("{\"term\":\"intranet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03586925\"]}");
	add("{\"term\":\"intransigence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04870728\"]}");
	add("{\"term\":\"intransigency\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04870728\"]}");
	add("{\"term\":\"intransitive\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06342634\"]}");
	add("{\"term\":\"intransitiveness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13820513\"]}");
	add("{\"term\":\"intransitivity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13820513\"]}");
	add("{\"term\":\"intravasation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14318363\"]}");
	add("{\"term\":\"intrenchment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03296462\"]}");
	add("{\"term\":\"intrepidity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04865320\"]}");
	add("{\"term\":\"intricacy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04774107\"]}");
	add("{\"term\":\"intrigue\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13954389\", \"05917114\"]}");
	add("{\"term\":\"intriguer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10027463\"]}");
	add("{\"term\":\"intro\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07059303\", \"07232009\"]}");
	add("{\"term\":\"introduction\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"00241051\", \"00321678\", \"07177626\", \"06426492\", \"07232009\", \"06408573\", \"00238889\"]}");
	add("{\"term\":\"introit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07054159\"]}");
	add("{\"term\":\"introitus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05520156\"]}");
	add("{\"term\":\"introject\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05932797\"]}");
	add("{\"term\":\"introjection\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05762194\", \"05762516\"]}");
	add("{\"term\":\"intromission\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00321678\"]}");
	add("{\"term\":\"intron\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14855348\"]}");
	add("{\"term\":\"intropin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14862387\"]}");
	add("{\"term\":\"introspection\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05794660\"]}");
	add("{\"term\":\"introspectiveness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04668338\"]}");
	add("{\"term\":\"introversion\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04629320\", \"13523144\", \"14085814\"]}");
	add("{\"term\":\"introvert\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10233099\"]}");
	add("{\"term\":\"intruder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10233322\"]}");
	add("{\"term\":\"intrusion\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00734781\", \"09337870\", \"13522608\", \"00050289\", \"07444576\"]}");
	add("{\"term\":\"intrusiveness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04845162\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }