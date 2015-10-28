package org.swtk.commons.dict.wordnet.indexbyname.instance.d.u.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDUB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"dub\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05728468\"]}");
	add("{\"term\":\"dubai\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09067189\"]}");
	add("{\"term\":\"dubbin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14863376\"]}");
	add("{\"term\":\"dubbing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03257662\"]}");
	add("{\"term\":\"dubiety\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05706212\"]}");
	add("{\"term\":\"dubiousness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04764777\", \"05706212\"]}");
	add("{\"term\":\"dublin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08909418\"]}");
	add("{\"term\":\"dubliner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09734823\"]}");
	add("{\"term\":\"dubnium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14660701\"]}");
	add("{\"term\":\"dubonnet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07912397\"]}");
	add("{\"term\":\"dubrovnik\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08836687\"]}");
	add("{\"term\":\"dubuque\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09109677\"]}");
	add("{\"term\":\"dubya\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10895517\"]}");
	add("{\"term\":\"dubyuh\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10895517\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }