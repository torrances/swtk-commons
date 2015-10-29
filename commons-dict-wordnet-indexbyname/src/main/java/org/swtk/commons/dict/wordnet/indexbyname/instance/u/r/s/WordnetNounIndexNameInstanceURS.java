package org.swtk.commons.dict.wordnet.indexbyname.instance.u.r.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceURS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ursa major\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09315095\"]}");
	add("{\"term\":\"ursa minor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09362930\"]}");
	add("{\"term\":\"ursidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02134070\"]}");
	add("{\"term\":\"ursine dasyure\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01887475\"]}");
	add("{\"term\":\"ursinia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12050561\"]}");
	add("{\"term\":\"ursus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02134594\"]}");
	add("{\"term\":\"ursus americanus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02135813\"]}");
	add("{\"term\":\"ursus arctos\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02134788\"]}");
	add("{\"term\":\"ursus arctos horribilis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02135232\"]}");
	add("{\"term\":\"ursus arctos middendorffi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02135440\"]}");
	add("{\"term\":\"ursus arctos syriacus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02135118\"]}");
	add("{\"term\":\"ursus horribilis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02135232\"]}");
	add("{\"term\":\"ursus maritimus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02136736\"]}");
	add("{\"term\":\"ursus middendorffi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02135440\"]}");
	add("{\"term\":\"ursus thibetanus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02136356\"]}");
	add("{\"term\":\"ursus ursinus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02137070\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }