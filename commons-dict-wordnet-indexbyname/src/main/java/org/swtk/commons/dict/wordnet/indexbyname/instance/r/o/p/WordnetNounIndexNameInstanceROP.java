package org.swtk.commons.dict.wordnet.indexbyname.instance.r.o.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceROP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"rope\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04042970\", \"04115362\"]}");
	add("{\"term\":\"rope bridge\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04115916\"]}");
	add("{\"term\":\"rope burn\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14310497\"]}");
	add("{\"term\":\"rope ladder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04116002\"]}");
	add("{\"term\":\"rope tow\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04116093\"]}");
	add("{\"term\":\"rope yard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04116198\"]}");
	add("{\"term\":\"rope yarn\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04116334\"]}");
	add("{\"term\":\"ropebark\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12368156\"]}");
	add("{\"term\":\"ropedancer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10558572\"]}");
	add("{\"term\":\"ropemaker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10558186\"]}");
	add("{\"term\":\"roper\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10558186\", \"10558290\", \"10558410\"]}");
	add("{\"term\":\"ropewalk\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04116198\"]}");
	add("{\"term\":\"ropewalker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10558572\"]}");
	add("{\"term\":\"ropeway\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04477048\"]}");
	add("{\"term\":\"rophy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04042970\"]}");
	add("{\"term\":\"ropiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04943081\"]}");
	add("{\"term\":\"roping\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00300506\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }