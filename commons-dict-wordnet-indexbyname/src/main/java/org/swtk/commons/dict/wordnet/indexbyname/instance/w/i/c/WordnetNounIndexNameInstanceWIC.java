package org.swtk.commons.dict.wordnet.indexbyname.instance.w.i.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceWIC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"wicca\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06255592\", \"08502987\"]}");
	add("{\"term\":\"wiccan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10799781\"]}");
	add("{\"term\":\"wichita\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06928797\", \"09111547\", \"09691679\"]}");
	add("{\"term\":\"wichita falls\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09169649\"]}");
	add("{\"term\":\"wick\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04589115\", \"04589330\"]}");
	add("{\"term\":\"wickedness\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"04788613\", \"04835188\", \"04859981\", \"14587156\", \"00746935\"]}");
	add("{\"term\":\"wicker\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04589491\", \"15122416\"]}");
	add("{\"term\":\"wicker basket\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04589635\"]}");
	add("{\"term\":\"wickerwork\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04589491\"]}");
	add("{\"term\":\"wicket\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04589740\", \"04589911\", \"04590057\", \"04590155\"]}");
	add("{\"term\":\"wicket door\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04589911\"]}");
	add("{\"term\":\"wicket gate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04589911\"]}");
	add("{\"term\":\"wickiup\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04590308\"]}");
	add("{\"term\":\"wickliffe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11419862\"]}");
	add("{\"term\":\"wickup\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12363015\"]}");
	add("{\"term\":\"wiclif\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11419862\"]}");
	add("{\"term\":\"wicopy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12368156\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }