package org.swtk.commons.dict.wordnet.indexbyname.instance.l.e.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLEC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lecanopteris\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13196898\"]}");
	add("{\"term\":\"lecanora\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13008918\"]}");
	add("{\"term\":\"lecanoraceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13008594\"]}");
	add("{\"term\":\"leccinum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13079207\"]}");
	add("{\"term\":\"lech\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10572408\"]}");
	add("{\"term\":\"lechanorales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13008412\"]}");
	add("{\"term\":\"lechatelierite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14903901\"]}");
	add("{\"term\":\"lecher\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10572408\"]}");
	add("{\"term\":\"lecherousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07504854\"]}");
	add("{\"term\":\"lechery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00858362\"]}");
	add("{\"term\":\"lechwe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02430222\"]}");
	add("{\"term\":\"lecithin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14704201\"]}");
	add("{\"term\":\"lectern\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03658909\"]}");
	add("{\"term\":\"lectin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14913225\"]}");
	add("{\"term\":\"lector\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10271919\", \"10272051\"]}");
	add("{\"term\":\"lecture\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00894541\", \"06726869\", \"07255209\"]}");
	add("{\"term\":\"lecturer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10272244\", \"10271919\"]}");
	add("{\"term\":\"lectureship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00595261\"]}");
	add("{\"term\":\"lecturing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00894541\"]}");
	add("{\"term\":\"lecythidaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12347726\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }