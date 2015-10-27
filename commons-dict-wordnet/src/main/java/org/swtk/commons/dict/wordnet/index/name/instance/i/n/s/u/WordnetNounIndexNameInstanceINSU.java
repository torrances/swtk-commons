package org.swtk.commons.dict.wordnet.index.name.instance.i.n.s.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceINSU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"insubordination\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01181883\", \"04915359\"]}");
	add("{\"term\":\"insubstantiality\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04769070\", \"05048749\"]}");
	add("{\"term\":\"insufficiency\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05120433\", \"14136953\", \"14487055\"]}");
	add("{\"term\":\"insufflation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00837491\", \"13521877\"]}");
	add("{\"term\":\"insulant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14944995\"]}");
	add("{\"term\":\"insularism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14438922\"]}");
	add("{\"term\":\"insularity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14438922\"]}");
	add("{\"term\":\"insulation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00828671\", \"14944995\", \"14438922\"]}");
	add("{\"term\":\"insulator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14845760\"]}");
	add("{\"term\":\"insulin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05417989\"]}");
	add("{\"term\":\"insult\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01227516\", \"06728162\"]}");
	add("{\"term\":\"insurability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04725063\"]}");
	add("{\"term\":\"insurance\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"14563428\", \"06535632\", \"13365819\"]}");
	add("{\"term\":\"insured\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10229489\"]}");
	add("{\"term\":\"insurer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08087301\"]}");
	add("{\"term\":\"insurgence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00965352\"]}");
	add("{\"term\":\"insurgency\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00965352\"]}");
	add("{\"term\":\"insurgent\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10170076\", \"10229738\"]}");
	add("{\"term\":\"insurrection\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00964240\"]}");
	add("{\"term\":\"insurrectionism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05880984\"]}");
	add("{\"term\":\"insurrectionist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10229738\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }