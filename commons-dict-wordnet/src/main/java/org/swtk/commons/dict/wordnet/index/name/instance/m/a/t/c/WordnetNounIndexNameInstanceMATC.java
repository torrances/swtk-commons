package org.swtk.commons.dict.wordnet.index.name.instance.m.a.t.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMATC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"match\", \"synsetCount\":9, \"upperType\":\"NOUN\", \"ids\":[\"05703985\", \"08005299\", \"09649426\", \"09920434\", \"13617916\", \"03734302\", \"03734473\", \"07485811\", \"03733928\"]}");
	add("{\"term\":\"matchboard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03734622\"]}");
	add("{\"term\":\"matchbook\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03734799\"]}");
	add("{\"term\":\"matchbox\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03734893\"]}");
	add("{\"term\":\"matchbush\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11994595\"]}");
	add("{\"term\":\"matcher\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10319542\"]}");
	add("{\"term\":\"matchet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03704925\"]}");
	add("{\"term\":\"matchlock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03734973\"]}");
	add("{\"term\":\"matchmaker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10319542\"]}");
	add("{\"term\":\"matchmaking\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01243193\"]}");
	add("{\"term\":\"matchstick\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03735317\"]}");
	add("{\"term\":\"matchup\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00390761\"]}");
	add("{\"term\":\"matchweed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11994595\"]}");
	add("{\"term\":\"matchwood\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09371846\", \"14973121\", \"14973213\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }