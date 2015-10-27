package org.swtk.commons.dict.wordnet.index.name.instance.v.a.p.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceVAPO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"vapor\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13593639\", \"15080200\"]}");
	add("{\"term\":\"vaporing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07244407\"]}");
	add("{\"term\":\"vaporisation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00219769\", \"13593639\"]}");
	add("{\"term\":\"vaporiser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04528257\"]}");
	add("{\"term\":\"vaporization\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13593639\", \"00219769\"]}");
	add("{\"term\":\"vaporizer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04528257\"]}");
	add("{\"term\":\"vaporousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04711464\"]}");
	add("{\"term\":\"vapors\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14427864\"]}");
	add("{\"term\":\"vapour\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13593639\", \"15080200\"]}");
	add("{\"term\":\"vapourousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04711464\"]}");
	add("{\"term\":\"vapours\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14427864\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }