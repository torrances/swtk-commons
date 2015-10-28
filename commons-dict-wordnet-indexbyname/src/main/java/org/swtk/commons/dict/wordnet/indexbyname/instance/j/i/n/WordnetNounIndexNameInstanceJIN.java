package org.swtk.commons.dict.wordnet.indexbyname.instance.j.i.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceJIN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"jinghpaw\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06945962\"]}");
	add("{\"term\":\"jinghpo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06945962\"]}");
	add("{\"term\":\"jingle\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06390876\", \"07400598\"]}");
	add("{\"term\":\"jingo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09931307\"]}");
	add("{\"term\":\"jingoism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04885841\", \"07202146\"]}");
	add("{\"term\":\"jingoist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09931307\"]}");
	add("{\"term\":\"jinja\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09066277\"]}");
	add("{\"term\":\"jinks\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00511061\"]}");
	add("{\"term\":\"jinnah\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11105103\"]}");
	add("{\"term\":\"jinnee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09567562\"]}");
	add("{\"term\":\"jinni\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09567562\"]}");
	add("{\"term\":\"jinrikisha\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03604679\"]}");
	add("{\"term\":\"jinx\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07175075\", \"10244116\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }