package org.swtk.commons.dict.wordnet.indexbyname.instance.a.c.q;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceACQ {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"acquaintance\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09783207\", \"13953278\", \"05825271\"]}");
	add("{\"term\":\"acquaintanceship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13953278\"]}");
	add("{\"term\":\"acquiescence\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07190226\", \"14436566\"]}");
	add("{\"term\":\"acquired hemochromatosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14230870\"]}");
	add("{\"term\":\"acquired immune deficiency syndrome\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14151264\"]}");
	add("{\"term\":\"acquired immunity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14551795\"]}");
	add("{\"term\":\"acquired reflex\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00865904\"]}");
	add("{\"term\":\"acquired taste\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07513694\"]}");
	add("{\"term\":\"acquirement\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05645403\"]}");
	add("{\"term\":\"acquirer\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"08436120\", \"08436311\", \"08436519\", \"09783624\"]}");
	add("{\"term\":\"acquiring\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00042637\"]}");
	add("{\"term\":\"acquisition\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"05645403\", \"05760541\", \"13274154\", \"00078239\"]}");
	add("{\"term\":\"acquisition agreement\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06539701\"]}");
	add("{\"term\":\"acquisitiveness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04953255\"]}");
	add("{\"term\":\"acquittal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01196376\"]}");
	add("{\"term\":\"acquittance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06564805\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }