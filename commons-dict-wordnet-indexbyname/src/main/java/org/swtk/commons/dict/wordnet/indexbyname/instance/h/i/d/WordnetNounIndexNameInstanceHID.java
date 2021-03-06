package org.swtk.commons.dict.wordnet.indexbyname.instance.h.i.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHID {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"hidatsa\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06922708\", \"09675910\"]}");
	add("{\"term\":\"hidden reserve\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13390740\"]}");
	add("{\"term\":\"hidden tax\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13335107\"]}");
	add("{\"term\":\"hiddenite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15076980\"]}");
	add("{\"term\":\"hiddenness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14439753\"]}");
	add("{\"term\":\"hide\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01898376\", \"14783454\"]}");
	add("{\"term\":\"hide and go seek\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00485921\"]}");
	add("{\"term\":\"hideaway\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03522810\", \"08601745\"]}");
	add("{\"term\":\"hideki yukawa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11424398\"]}");
	add("{\"term\":\"hideousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04698409\"]}");
	add("{\"term\":\"hideout\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08601745\"]}");
	add("{\"term\":\"hideyo noguchi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11229009\"]}");
	add("{\"term\":\"hiding\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14599497\", \"01050836\"]}");
	add("{\"term\":\"hiding place\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08601976\"]}");
	add("{\"term\":\"hidrosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13556464\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }