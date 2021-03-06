package org.swtk.commons.dict.wordnet.indexbyname.instance.u.s.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceUSA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"us air force\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08213170\"]}");
	add("{\"term\":\"us air force academy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08211867\"]}");
	add("{\"term\":\"us army\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08411879\"]}");
	add("{\"term\":\"us army criminal investigation laboratory\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04517385\"]}");
	add("{\"term\":\"us attorney general\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10589873\"]}");
	add("{\"term\":\"usa\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08411879\", \"09067337\"]}");
	add("{\"term\":\"usability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05157376\"]}");
	add("{\"term\":\"usableness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05157376\"]}");
	add("{\"term\":\"usacil\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04517385\"]}");
	add("{\"term\":\"usaf\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08213170\"]}");
	add("{\"term\":\"usage\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06294112\", \"00414252\", \"00948944\"]}");
	add("{\"term\":\"usama bin laden\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10871048\"]}");
	add("{\"term\":\"usance\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00414252\", \"13472977\", \"15324828\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }