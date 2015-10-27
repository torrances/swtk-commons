package org.swtk.commons.dict.wordnet.index.name.instance.g.u.e.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGUES {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"guess\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05811946\", \"06795537\"]}");
	add("{\"term\":\"guesser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10170314\"]}");
	add("{\"term\":\"guessing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05811946\"]}");
	add("{\"term\":\"guesstimate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05812144\"]}");
	add("{\"term\":\"guesswork\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05811946\"]}");
	add("{\"term\":\"guest\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03832647\", \"10170653\", \"11038679\", \"10170460\"]}");
	add("{\"term\":\"guesthouse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03470537\"]}");
	add("{\"term\":\"guestimate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05812144\"]}");
	add("{\"term\":\"guestroom\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03470650\"]}");
	add("{\"term\":\"guestworker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10170887\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }