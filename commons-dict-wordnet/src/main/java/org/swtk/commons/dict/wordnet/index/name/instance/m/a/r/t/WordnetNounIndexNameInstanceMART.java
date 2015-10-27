package org.swtk.commons.dict.wordnet.index.name.instance.m.a.r.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMART {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"mart\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03727779\"]}");
	add("{\"term\":\"martagon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12448581\"]}");
	add("{\"term\":\"marten\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02452665\"]}");
	add("{\"term\":\"martensite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14972515\"]}");
	add("{\"term\":\"martes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02452552\"]}");
	add("{\"term\":\"marti\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11179408\"]}");
	add("{\"term\":\"martial\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11179585\"]}");
	add("{\"term\":\"martian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09512920\"]}");
	add("{\"term\":\"martin\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"01598265\", \"11179688\", \"11179809\", \"11179910\", \"11180045\"]}");
	add("{\"term\":\"martinet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10316105\"]}");
	add("{\"term\":\"martingale\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03225104\", \"03729376\"]}");
	add("{\"term\":\"martini\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07932281\"]}");
	add("{\"term\":\"martinique\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08963015\"]}");
	add("{\"term\":\"martinmas\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15210672\"]}");
	add("{\"term\":\"martynia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12894744\"]}");
	add("{\"term\":\"martyniaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12894406\"]}");
	add("{\"term\":\"martyr\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10316493\", \"10316279\"]}");
	add("{\"term\":\"martyrdom\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07320650\", \"07347947\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }