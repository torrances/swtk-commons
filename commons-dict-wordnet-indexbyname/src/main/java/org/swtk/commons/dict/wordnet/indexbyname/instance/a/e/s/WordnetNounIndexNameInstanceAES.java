package org.swtk.commons.dict.wordnet.indexbyname.instance.a.e.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAES {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"aeschylus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10828690\"]}");
	add("{\"term\":\"aeschynanthus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12851328\"]}");
	add("{\"term\":\"aesculapius\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09582330\"]}");
	add("{\"term\":\"aesculus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12788937\"]}");
	add("{\"term\":\"aesir\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09602248\"]}");
	add("{\"term\":\"aesop\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10828827\"]}");
	add("{\"term\":\"aesthesia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05685989\"]}");
	add("{\"term\":\"aesthesis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05720023\"]}");
	add("{\"term\":\"aesthete\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10084344\"]}");
	add("{\"term\":\"aesthetic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05977838\"]}");
	add("{\"term\":\"aesthetician\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10084476\", \"10084638\"]}");
	add("{\"term\":\"aesthetics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06170939\"]}");
	add("{\"term\":\"aestivation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07963655\", \"14037633\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }