package org.swtk.commons.dict.wordnet.index.name.instance.t.r.a.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTRAM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tram\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04342573\", \"04476082\", \"04477048\"]}");
	add("{\"term\":\"tramcar\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04342573\", \"04476082\"]}");
	add("{\"term\":\"tramline\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04476238\"]}");
	add("{\"term\":\"trammel\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04188289\", \"04476382\", \"04476486\", \"04476580\"]}");
	add("{\"term\":\"tramontana\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11540704\"]}");
	add("{\"term\":\"tramontane\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11540704\"]}");
	add("{\"term\":\"tramp\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00289814\", \"04476919\", \"07413160\", \"10195742\", \"10703158\", \"10742949\"]}");
	add("{\"term\":\"tramper\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10195742\", \"10666381\"]}");
	add("{\"term\":\"trample\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07413259\"]}");
	add("{\"term\":\"trampler\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10666381\", \"10743110\"]}");
	add("{\"term\":\"trampling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07413259\"]}");
	add("{\"term\":\"trampoline\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04476749\"]}");
	add("{\"term\":\"tramway\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04476238\", \"04477048\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }