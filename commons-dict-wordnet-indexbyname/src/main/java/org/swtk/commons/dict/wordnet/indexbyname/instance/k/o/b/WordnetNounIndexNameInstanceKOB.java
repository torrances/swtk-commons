package org.swtk.commons.dict.wordnet.indexbyname.instance.k.o.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceKOB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"kob\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02430116\"]}");
	add("{\"term\":\"kobe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08944686\"]}");
	add("{\"term\":\"kobenhavn\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08779701\"]}");
	add("{\"term\":\"kobo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13711283\"]}");
	add("{\"term\":\"kobus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02429983\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }