package org.swtk.commons.dict.wordnet.indexbyname.instance.l.o.v;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLOV {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lovage\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07834801\", \"12960986\"]}");
	add("{\"term\":\"lovastatin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03698415\"]}");
	add("{\"term\":\"love\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00848145\", \"13617812\", \"07503480\", \"09869006\", \"05821331\", \"07558676\"]}");
	add("{\"term\":\"lovebird\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01822693\", \"01824510\"]}");
	add("{\"term\":\"lovelace\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11161872\"]}");
	add("{\"term\":\"loveliness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04692745\"]}");
	add("{\"term\":\"lovell\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11161971\"]}");
	add("{\"term\":\"lovely\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09991988\"]}");
	add("{\"term\":\"lovemaking\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00848145\"]}");
	add("{\"term\":\"lover\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09645915\", \"10097373\", \"09645472\"]}");
	add("{\"term\":\"loveseat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03698800\"]}");
	add("{\"term\":\"lovesickness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07502633\"]}");
	add("{\"term\":\"lovingness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04634357\", \"07561495\"]}");
	add("{\"term\":\"lovoa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12720245\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }