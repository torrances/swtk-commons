package org.swtk.commons.dict.wordnet.indexbyname.instance.h.i.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHIL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"hilaire belloc\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10862631\"]}");
	add("{\"term\":\"hilaire germain edgar degas\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10947438\"]}");
	add("{\"term\":\"hilarity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07544765\"]}");
	add("{\"term\":\"hilary clinton\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10922504\"]}");
	add("{\"term\":\"hilary rodham clinton\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10922504\"]}");
	add("{\"term\":\"hilbert\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11069830\"]}");
	add("{\"term\":\"hilbert space\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08021565\"]}");
	add("{\"term\":\"hildebrand\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11034208\"]}");
	add("{\"term\":\"hill\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"03797867\", \"11069933\", \"11070052\", \"03797581\", \"09325914\"]}");
	add("{\"term\":\"hill myna\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01580821\"]}");
	add("{\"term\":\"hillary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11070178\"]}");
	add("{\"term\":\"hillbilly\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10195988\"]}");
	add("{\"term\":\"hillbilly music\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07076355\"]}");
	add("{\"term\":\"hillel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11070431\"]}");
	add("{\"term\":\"hilliness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04779796\"]}");
	add("{\"term\":\"hillock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09349568\"]}");
	add("{\"term\":\"hillside\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09326434\"]}");
	add("{\"term\":\"hilltop\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08602314\"]}");
	add("{\"term\":\"hilo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09101172\"]}");
	add("{\"term\":\"hilt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03525817\"]}");
	add("{\"term\":\"hilum\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11698944\", \"05232048\"]}");
	add("{\"term\":\"hilus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05232048\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }