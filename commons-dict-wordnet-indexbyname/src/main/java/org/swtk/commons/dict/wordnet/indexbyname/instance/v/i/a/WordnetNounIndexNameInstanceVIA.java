package org.swtk.commons.dict.wordnet.indexbyname.instance.v.i.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceVIA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"via media\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01208054\"]}");
	add("{\"term\":\"viability\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05158823\", \"05063385\"]}");
	add("{\"term\":\"viaduct\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04539965\"]}");
	add("{\"term\":\"viagra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04225450\"]}");
	add("{\"term\":\"vial\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03929501\"]}");
	add("{\"term\":\"viand\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07609042\"]}");
	add("{\"term\":\"viands\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07587918\"]}");
	add("{\"term\":\"viatical settlement\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00229629\", \"13318618\"]}");
	add("{\"term\":\"viatication\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00083167\"]}");
	add("{\"term\":\"viaticus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00083167\"]}");
	add("{\"term\":\"viaticus settlement\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00229629\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }