package org.swtk.commons.dict.wordnet.indexbyname.instance.k.i.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceKIC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"kichaga\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07006105\"]}");
	add("{\"term\":\"kichai\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09678626\"]}");
	add("{\"term\":\"kick\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00337631\", \"05835833\", \"07224625\", \"07365354\", \"07543858\", \"00137149\"]}");
	add("{\"term\":\"kick in the butt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01166765\"]}");
	add("{\"term\":\"kick pleat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03621300\"]}");
	add("{\"term\":\"kick start\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03621972\"]}");
	add("{\"term\":\"kick starter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03621972\"]}");
	add("{\"term\":\"kick turn\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00442175\"]}");
	add("{\"term\":\"kick up\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00438261\"]}");
	add("{\"term\":\"kickapoo\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06923199\", \"09678744\"]}");
	add("{\"term\":\"kickback\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13305807\"]}");
	add("{\"term\":\"kicker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10250250\"]}");
	add("{\"term\":\"kicking\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00137149\", \"00337631\"]}");
	add("{\"term\":\"kickoff\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07344168\", \"15290329\", \"00242374\"]}");
	add("{\"term\":\"kickshaw\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07572730\"]}");
	add("{\"term\":\"kicksorter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03621434\"]}");
	add("{\"term\":\"kickstand\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03621637\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }