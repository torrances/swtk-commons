package org.swtk.commons.dict.wordnet.indexbyname.instance.s.i.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSIS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10622393\"]}");
	add("{\"term\":\"sisal\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12497906\", \"15067221\"]}");
	add("{\"term\":\"sise\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13766862\"]}");
	add("{\"term\":\"sisham\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12543399\"]}");
	add("{\"term\":\"siskin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01534153\"]}");
	add("{\"term\":\"sison\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12965350\"]}");
	add("{\"term\":\"sissiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04675496\"]}");
	add("{\"term\":\"sissoo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12543399\"]}");
	add("{\"term\":\"sissu\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12543399\"]}");
	add("{\"term\":\"sissy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10622786\"]}");
	add("{\"term\":\"sister\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10621666\", \"10621878\", \"10622393\"]}");
	add("{\"term\":\"sisterhood\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08092483\", \"08424406\", \"13836396\"]}");
	add("{\"term\":\"sistership\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08424406\", \"13836396\"]}");
	add("{\"term\":\"sistrurus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01760188\"]}");
	add("{\"term\":\"sisyphus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09521828\"]}");
	add("{\"term\":\"sisyridae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02270296\"]}");
	add("{\"term\":\"sisyrinchium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12438570\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }