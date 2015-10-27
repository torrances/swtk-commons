package org.swtk.commons.dict.wordnet.index.name.instance.m.a.r.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMARC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"marc\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07920430\"]}");
	add("{\"term\":\"marceau\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11175804\"]}");
	add("{\"term\":\"marcel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05267474\"]}");
	add("{\"term\":\"march\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"06713607\", \"07072336\", \"08530235\", \"08444976\", \"00283684\", \"00291423\", \"15235666\"]}");
	add("{\"term\":\"marchantia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11564243\"]}");
	add("{\"term\":\"marchantiaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11564053\"]}");
	add("{\"term\":\"marchantiales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11563880\"]}");
	add("{\"term\":\"marche\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08827236\"]}");
	add("{\"term\":\"marcher\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10224540\", \"10312993\", \"10313163\"]}");
	add("{\"term\":\"marches\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08827236\"]}");
	add("{\"term\":\"marching\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00291423\"]}");
	add("{\"term\":\"marchioness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10313251\", \"10313434\"]}");
	add("{\"term\":\"marchland\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08530235\"]}");
	add("{\"term\":\"marchpane\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07623854\"]}");
	add("{\"term\":\"marciano\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11175933\"]}");
	add("{\"term\":\"marcionism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06199076\"]}");
	add("{\"term\":\"marconi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11176112\"]}");
	add("{\"term\":\"marcuse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11176323\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }