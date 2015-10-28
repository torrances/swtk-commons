package org.swtk.commons.dict.wordnet.indexbyid.instance.p0.p0;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexIdInstance0001 {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("00015568", "{\"term\":\"animal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00015568\"]}");
	add("00015568", "{\"term\":\"animate being\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00015568\"]}");
	add("00015568", "{\"term\":\"beast\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09864997\", \"00015568\"]}");
	add("00015568", "{\"term\":\"brute\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00015568\", \"09864997\"]}");
	add("00015568", "{\"term\":\"creature\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09996081\", \"09995959\", \"00015568\"]}");
	add("00015568", "{\"term\":\"fauna\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00015568\", \"08009721\"]}");
	add("00017402", "{\"term\":\"flora\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00017402\", \"08453769\"]}");
	add("00017402", "{\"term\":\"plant\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"05914674\", \"10458237\", \"00017402\", \"03963198\"]}");
	add("00017402", "{\"term\":\"plant life\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00017402\"]}");
	add("00019226", "{\"term\":\"native\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00019226\", \"09644402\", \"09643964\"]}");
	add("00019308", "{\"term\":\"natural object\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00019308\"]}");
	add("00019793", "{\"term\":\"substance\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"00020270\", \"04941723\", \"06611268\", \"13374873\", \"14604577\", \"05928460\", \"05929717\", \"00019793\"]}");
 	}  	private static void add(final String ID, final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(ID)) ? map.get(ID) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(ID, list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> ids() { 		return map.keySet(); 	} }