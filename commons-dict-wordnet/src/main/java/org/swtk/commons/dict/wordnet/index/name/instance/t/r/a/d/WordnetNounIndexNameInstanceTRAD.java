package org.swtk.commons.dict.wordnet.index.name.instance.t.r.a.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTRAD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"trad\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07079972\"]}");
	add("{\"term\":\"trade\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"01111592\", \"11540382\", \"08453572\", \"01112179\", \"01098359\", \"00607485\", \"01093829\"]}");
	add("{\"term\":\"tradecraft\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05651861\"]}");
	add("{\"term\":\"trademark\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06864792\", \"04739783\"]}");
	add("{\"term\":\"tradeoff\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01169250\"]}");
	add("{\"term\":\"trader\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10740102\"]}");
	add("{\"term\":\"tradescant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11367669\"]}");
	add("{\"term\":\"tradescantia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12627558\"]}");
	add("{\"term\":\"tradesman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10611560\"]}");
	add("{\"term\":\"tradespeople\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07967271\"]}");
	add("{\"term\":\"trading\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00080218\"]}");
	add("{\"term\":\"tradition\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05675248\", \"05817771\"]}");
	add("{\"term\":\"traditionalism\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05986667\", \"01216192\", \"04809126\"]}");
	add("{\"term\":\"traditionalist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10740773\"]}");
	add("{\"term\":\"traditionality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04809126\"]}");
	add("{\"term\":\"traducement\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06732328\"]}");
	add("{\"term\":\"traducer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10018655\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }