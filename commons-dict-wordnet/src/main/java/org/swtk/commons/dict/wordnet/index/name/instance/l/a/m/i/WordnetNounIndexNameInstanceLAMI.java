package org.swtk.commons.dict.wordnet.index.name.instance.l.a.m.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLAMI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lamia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09567238\"]}");
	add("{\"term\":\"lamiaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12858787\"]}");
	add("{\"term\":\"lamina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05588560\"]}");
	add("{\"term\":\"laminaria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01405925\"]}");
	add("{\"term\":\"laminariaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01405693\"]}");
	add("{\"term\":\"laminariales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01405472\"]}");
	add("{\"term\":\"laminate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03640959\"]}");
	add("{\"term\":\"lamination\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00928738\", \"03641223\"]}");
	add("{\"term\":\"laminator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10263923\"]}");
	add("{\"term\":\"laminectomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00683991\"]}");
	add("{\"term\":\"laminitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14372300\"]}");
	add("{\"term\":\"lamisil\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04419862\"]}");
	add("{\"term\":\"lamium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12869630\"]}");
	add("{\"term\":\"lamivudine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03641353\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }