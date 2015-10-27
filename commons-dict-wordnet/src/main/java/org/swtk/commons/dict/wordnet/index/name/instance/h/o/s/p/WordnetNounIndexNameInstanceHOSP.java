package org.swtk.commons.dict.wordnet.index.name.instance.h.o.s.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHOSP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"hospice\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00698502\", \"03545656\"]}");
	add("{\"term\":\"hospitableness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04663639\"]}");
	add("{\"term\":\"hospital\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08071169\", \"03545775\"]}");
	add("{\"term\":\"hospitalisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00659870\"]}");
	add("{\"term\":\"hospitality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06644013\"]}");
	add("{\"term\":\"hospitalization\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00659870\", \"13367927\", \"14599598\", \"15144127\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }