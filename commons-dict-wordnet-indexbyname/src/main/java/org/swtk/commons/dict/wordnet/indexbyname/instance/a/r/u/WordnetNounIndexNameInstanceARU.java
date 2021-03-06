package org.swtk.commons.dict.wordnet.indexbyname.instance.a.r.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceARU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"aruba\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08766627\"]}");
	add("{\"term\":\"arugula\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11907006\"]}");
	add("{\"term\":\"arui\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02418750\"]}");
	add("{\"term\":\"arulo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06908287\"]}");
	add("{\"term\":\"arum\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11799769\", \"11800487\"]}");
	add("{\"term\":\"arum family\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11799003\"]}");
	add("{\"term\":\"arum lily\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11814248\"]}");
	add("{\"term\":\"arum maculatum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11800617\"]}");
	add("{\"term\":\"arum palaestinum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11800893\"]}");
	add("{\"term\":\"arundinaria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12168596\"]}");
	add("{\"term\":\"arundinaria gigantea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12168770\"]}");
	add("{\"term\":\"arundinaria tecta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12168956\"]}");
	add("{\"term\":\"arundo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12129706\"]}");
	add("{\"term\":\"arundo conspicua\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12129882\"]}");
	add("{\"term\":\"arundo donax\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12130015\"]}");
	add("{\"term\":\"arundo richardii\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12135900\"]}");
	add("{\"term\":\"aruru\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09539123\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }