package org.swtk.commons.dict.wordnet.index.name.instance.w.h.i.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceWHIR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"whir\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07414517\"]}");
	add("{\"term\":\"whirl\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00344075\", \"00788715\", \"13900751\", \"07456668\"]}");
	add("{\"term\":\"whirlaway\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02386669\"]}");
	add("{\"term\":\"whirler\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04585994\", \"10796815\"]}");
	add("{\"term\":\"whirligig\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02969645\", \"04461511\"]}");
	add("{\"term\":\"whirling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00343581\"]}");
	add("{\"term\":\"whirlpool\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07447745\"]}");
	add("{\"term\":\"whirlwind\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11546212\"]}");
	add("{\"term\":\"whirlybird\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03517291\"]}");
	add("{\"term\":\"whirr\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07414517\"]}");
	add("{\"term\":\"whirring\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07414517\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }