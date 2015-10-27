package org.swtk.commons.dict.wordnet.index.name.instance.s.h.o.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSHOP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"shop\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00893934\", \"04610439\", \"04209460\"]}");
	add("{\"term\":\"shopaholic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10611219\"]}");
	add("{\"term\":\"shopfront\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04210748\"]}");
	add("{\"term\":\"shophar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04208107\"]}");
	add("{\"term\":\"shopkeeper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10611560\"]}");
	add("{\"term\":\"shoplifter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09886067\"]}");
	add("{\"term\":\"shoplifting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00783134\"]}");
	add("{\"term\":\"shopper\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10612003\", \"10611805\"]}");
	add("{\"term\":\"shopping\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04210932\", \"00082656\"]}");
	add("{\"term\":\"shopwalker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10117031\"]}");
	add("{\"term\":\"shopwindow\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03216510\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }