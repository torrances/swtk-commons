package org.swtk.commons.dict.wordnet.indexbyname.instance.c.o.v;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCOV {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"covalence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05041916\"]}");
	add("{\"term\":\"covalency\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05041916\"]}");
	add("{\"term\":\"covariance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06034695\"]}");
	add("{\"term\":\"covariation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06042282\"]}");
	add("{\"term\":\"cove\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09280749\", \"09280667\"]}");
	add("{\"term\":\"coven\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08415424\"]}");
	add("{\"term\":\"covenant\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06537579\", \"06785061\"]}");
	add("{\"term\":\"coventry\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08900094\", \"14451037\"]}");
	add("{\"term\":\"cover\", \"synsetCount\":10, \"upperType\":\"NOUN\", \"ids\":[\"01051916\", \"03126349\", \"13339433\", \"00990979\", \"04461181\", \"09280855\", \"02843848\", \"01051609\", \"02852392\", \"04159023\"]}");
	add("{\"term\":\"coverage\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06696529\", \"05131025\", \"13365679\"]}");
	add("{\"term\":\"coverall\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03126548\"]}");
	add("{\"term\":\"covering\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00713478\", \"00829743\", \"01051609\", \"03127399\", \"09280855\"]}");
	add("{\"term\":\"coverlet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03128204\"]}");
	add("{\"term\":\"covert\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04159023\", \"08008222\"]}");
	add("{\"term\":\"covertness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14439753\"]}");
	add("{\"term\":\"covetousness\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00759878\", \"04952935\", \"07565445\"]}");
	add("{\"term\":\"covey\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08008310\", \"08327239\"]}");
	add("{\"term\":\"coville\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12743822\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }