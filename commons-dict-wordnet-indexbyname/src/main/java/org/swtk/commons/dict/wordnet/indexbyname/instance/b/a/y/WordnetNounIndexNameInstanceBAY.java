package org.swtk.commons.dict.wordnet.indexbyname.instance.b.a.y;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBAY {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"bay\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"02391569\", \"02698907\", \"02815766\", \"02815920\", \"11724562\", \"07391436\", \"09238571\"]}");
	add("{\"term\":\"baya\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01545816\"]}");
	add("{\"term\":\"bayard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10858398\"]}");
	add("{\"term\":\"bayat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07241715\"]}");
	add("{\"term\":\"bayberry\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11762266\", \"12351408\"]}");
	add("{\"term\":\"baycol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03001816\"]}");
	add("{\"term\":\"bayer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02751623\"]}");
	add("{\"term\":\"bayes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10858593\"]}");
	add("{\"term\":\"baykal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09265673\"]}");
	add("{\"term\":\"bayonet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02816084\"]}");
	add("{\"term\":\"bayonne\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09135860\"]}");
	add("{\"term\":\"bayou\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09239993\"]}");
	add("{\"term\":\"bayrut\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08977579\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }