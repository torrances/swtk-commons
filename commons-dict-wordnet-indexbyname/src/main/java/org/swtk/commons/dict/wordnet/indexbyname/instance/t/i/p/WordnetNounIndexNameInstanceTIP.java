package org.swtk.commons.dict.wordnet.indexbyname.instance.t.i.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTIP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tip\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"08635538\", \"13925175\", \"06664322\", \"13319724\", \"08680894\"]}");
	add("{\"term\":\"tipi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04419551\"]}");
	add("{\"term\":\"tipper\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03260869\", \"10732222\"]}");
	add("{\"term\":\"tippet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04447731\"]}");
	add("{\"term\":\"tipple\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07899955\"]}");
	add("{\"term\":\"tippler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10732339\"]}");
	add("{\"term\":\"tipsiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14042038\"]}");
	add("{\"term\":\"tipstaff\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07282500\"]}");
	add("{\"term\":\"tipster\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10732484\"]}");
	add("{\"term\":\"tiptoe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05584935\"]}");
	add("{\"term\":\"tiptop\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08682103\", \"13963489\"]}");
	add("{\"term\":\"tipu\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12594416\"]}");
	add("{\"term\":\"tipuana\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12594265\"]}");
	add("{\"term\":\"tipulidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02207747\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }