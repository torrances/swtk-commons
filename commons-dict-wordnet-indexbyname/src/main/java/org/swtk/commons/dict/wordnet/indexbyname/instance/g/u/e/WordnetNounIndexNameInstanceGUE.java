package org.swtk.commons.dict.wordnet.indexbyname.instance.g.u.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGUE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"guelder rose\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12701625\"]}");
	add("{\"term\":\"guenevere\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11038435\"]}");
	add("{\"term\":\"guenon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02487606\"]}");
	add("{\"term\":\"guenon monkey\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02487606\"]}");
	add("{\"term\":\"guerdon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13305306\"]}");
	add("{\"term\":\"guereza\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02491525\"]}");
	add("{\"term\":\"gueridon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03470358\"]}");
	add("{\"term\":\"guerilla\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10170076\"]}");
	add("{\"term\":\"guerilla force\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08214835\"]}");
	add("{\"term\":\"guernsey\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02410173\", \"08907571\"]}");
	add("{\"term\":\"guernsey elm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12428971\"]}");
	add("{\"term\":\"guerrilla\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10170076\"]}");
	add("{\"term\":\"guerrilla force\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08214835\"]}");
	add("{\"term\":\"guerrilla theater\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00901199\"]}");
	add("{\"term\":\"guess\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05811946\", \"06795537\"]}");
	add("{\"term\":\"guesser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10170314\"]}");
	add("{\"term\":\"guessing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05811946\"]}");
	add("{\"term\":\"guessing game\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00460594\"]}");
	add("{\"term\":\"guesstimate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05812144\"]}");
	add("{\"term\":\"guesswork\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05811946\"]}");
	add("{\"term\":\"guest\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03832647\", \"10170653\", \"11038679\", \"10170460\"]}");
	add("{\"term\":\"guest night\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15191789\"]}");
	add("{\"term\":\"guest of honor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10170781\"]}");
	add("{\"term\":\"guest worker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10170887\"]}");
	add("{\"term\":\"guesthouse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03470537\"]}");
	add("{\"term\":\"guestimate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05812144\"]}");
	add("{\"term\":\"guestroom\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03470650\"]}");
	add("{\"term\":\"guestworker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10170887\"]}");
	add("{\"term\":\"guevara\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11038149\"]}");
	add("{\"term\":\"guevina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12237353\"]}");
	add("{\"term\":\"guevina avellana\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12237485\"]}");
	add("{\"term\":\"guevina heterophylla\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12237485\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }