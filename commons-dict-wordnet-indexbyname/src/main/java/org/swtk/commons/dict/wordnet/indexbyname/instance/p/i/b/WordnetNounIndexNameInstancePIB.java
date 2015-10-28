package org.swtk.commons.dict.wordnet.indexbyname.instance.p.i.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePIB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pib\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13651674\"]}");
	add("{\"term\":\"pibgorn\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03542731\"]}");
	add("{\"term\":\"pibit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13652168\"]}");
	add("{\"term\":\"pibroch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07072802\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }